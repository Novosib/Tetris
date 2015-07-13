package org.zgame.tetris.multi_thread;

import junit.framework.TestCase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.zgame.tetris.component.FigureType;
import org.zgame.tetris.component.RootGlass;
import org.zgame.tetris.component.TemplateOfFigure;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by SBT-Nikiforov-MO on 06.07.2015.
 */
public class MoveGMultiThreadTest extends TestCase {

    private static final Logger log = LoggerFactory.getLogger(MoveGMultiThreadTest.class);

    public void testMoveGMultiThreadTest_00() throws InterruptedException {
        int rowCount = 20;
        int columnCount = 100000;
        byte[][] rootGlassMatr = new byte[rowCount][columnCount];
        for (int row = 0; row < rowCount; row++) {
            for (int column = 0; column < columnCount; column++) {
                rootGlassMatr[row][column] = 0;
            }
        }

        RootGlass rootGlass = new RootGlass(rootGlassMatr);
        TemplateOfFigure tof = new TemplateOfFigure(FigureType.G, rowCount, columnCount, 9, columnCount / 2 - 1);
        TemplateOfFigure tof_expected = new TemplateOfFigure(FigureType.G, rowCount, columnCount, 9, columnCount / 2 - 2);

        ExecutorService ex = Executors.newFixedThreadPool(100);
        CountDownLatch latch = new CountDownLatch(1);

        for (int i = 0; i < columnCount / 2 - 1; i++) {
            ex.submit(new RunnableForMove(tof, rootGlass, Move.LEFT).latch(latch));
            if (i != 0) {
                ex.submit(new RunnableForMove(tof, rootGlass, Move.RIGHT).latch(latch));
            }
        }
        latch.countDown();

        ex.shutdown();
        ex.awaitTermination(Long.MAX_VALUE, TimeUnit.MILLISECONDS);

        if (Arrays.deepEquals(tof.getFigure().getMatr(), tof_expected.getFigure().getMatr())) {
            log.debug("testMoveGMultiThreadTest_00 is passed!");
            assertTrue(true);
        } else {
            log.error("testMoveGMultiThreadTest_00 is not passed");
            log.debug("tof.getFigure().getMatr():          {}", tof.getFigure().toNotZeroString());
            log.debug("tof_expected.getFigure().getMatr(): {}", tof_expected.getFigure().toNotZeroString());
            assertTrue(false);
        }
    }
}
