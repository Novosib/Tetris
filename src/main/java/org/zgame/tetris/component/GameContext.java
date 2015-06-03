package org.zgame.tetris.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.zgame.stage.GameOverStage;
import org.zgame.tetris.Main;
import org.zgame.utils.Constants;
import org.zgame.utils.Record;

import java.awt.*;
import java.util.List;
import java.util.Random;

/**
 * Created by mnikiforov on 31.05.2015.
 */
public class GameContext implements Runnable {

    private static final Logger log = LoggerFactory.getLogger(GameContext.class);

    private TemplateOfFigure currentFigure;
    private TemplateOfFigure nextFigure;
    private RootGlass rootGlass;
    private boolean gameOver = false;
    private int pointsNow;
    private int pointsAll;

    public GameContext() {
        rootGlass = new RootGlass();
//        figureShadow = new TemplateOfFigure();

        currentFigure = new TemplateOfFigure(5);//new Random().nextInt(7) + 1
        nextFigure = new TemplateOfFigure(5);//new Random().nextInt(7) + 1
    }

    @Override
    public void run() {
        while (!gameOver) {
            if (!currentFigure.isDownAvailable(rootGlass)) {
                for (int row = 0; row < Constants.matrY; row++) {
                    for (int column = 0; column < Constants.matrX; column++) {
                        if (rootGlass.getFilledGlass()[row][column] == 0) {
                            break;
                        }
                        if (column == Constants.matrX - 1) {
                            rootGlass.deleteFullLine(row);
//                            for (int t = 0; t < 10; t++) {
//                                particles.add(new ParticleEffect(FigurePaint.converFromIndexColumn(t), FigurePaint.converFromIndexRow(row)));
//                            }
//                            start = ParticleEffect.TIME;
                            pointsNow++;
                        }
                    }
                }
                if (pointsNow != 0) {
                    pointsAll += getDeleteLinePoints(pointsNow);
//                    countTCC.setText("Счет: " + pointsAll);
                }
                if (!gameOver) {
                    nextStep();
                }
            } else {
                currentFigure.moveDown(rootGlass);
            }
//            for (int row = 0; row < Constants.matrY; row++) {
//                System.arraycopy(currentFigure.getFigure()[row], 0, figureShadow.getFigure()[row], 0, Constants.matrX);
//            }

//            while (!figureShadow.isDownBarrier(rootGlass)) {
//                figureShadow.down();
//            }

            try {
                Thread.sleep(currentFigure.getComeDownTime(pointsAll));
            } catch (InterruptedException e) {
                log.error(e.getMessage(), e.getCause());
            }
        }

        gameOver = true;
        log.info("GAME OVER!!!");

        List<Record> recordList = Record.getRecord();
        Record record = new Record();
        record.setCount(pointsAll);
        record.setFIO(Main.getName());
        recordList.add(record);
        Record.setRecord(recordList);

        GameOverStage gos = new GameOverStage(this);
//        gos.setReturnStage(this);
        Main.getInstance().setCurrentStage(gos);
    }

    public void nextStep() {
        for (int row = 0; row < Constants.matrY; row++) {
            for (int column = 0; column < Constants.matrX; column++) {
                rootGlass.getFilledGlass()[row][column] += currentFigure.getFigure()[row][column];
            }
        }

        currentFigure = nextFigure;
        nextFigure = new TemplateOfFigure(new Random().nextInt(7) + 1);
//        int rotateRandom = new Random().nextInt(4);
//        for (int i = 0; i < rotateRandom; i++) {
//            nextFigure.rotate(rootGlass);
//        }
        pointsNow = 0;
    }

    public void fallCurrentFigure() {
        while (currentFigure.isDownAvailable(rootGlass)) {
            currentFigure.moveDown(rootGlass);
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                log.error(e.getMessage(), e);
            }
        }
        nextStep();
    }

    public void paint(Graphics2D gr2d) {
        rootGlass.paintRootGlass(gr2d);
        currentFigure.paintFigure(gr2d);
//        figureShadow.paintFigureShadow(gr2d);
        nextFigure.paintFigureNext(gr2d);
    }

    public void gameReset() {
        for (int row = 0; row < Constants.matrY; row++) {
            for (int column = 0; column < Constants.matrX; column++) {
                rootGlass.getFilledGlass()[row][column] = 0;
            }
        }
//        pointsAll = 0;
        gameOver = true;
        currentFigure = new TemplateOfFigure(new Random().nextInt(6) + 1);
    }

    public int getDeleteLinePoints(int points) {
        switch (points) {
            case 1: {
                return 100;
            }
            case 2: {
                return 300;
            }
            case 3: {
                return 700;
            }
            case 4: {
                return 1500;
            }
        }
        return 0;
    }

    public TemplateOfFigure getCurrentFigure() {
        return currentFigure;
    }

    public void setCurrentFigure(TemplateOfFigure currentFigure) {
        this.currentFigure = currentFigure;
    }

    public RootGlass getRootGlass() {
        return rootGlass;
    }

    public void setRootGlass(RootGlass rootGlass) {
        this.rootGlass = rootGlass;
    }
}
