package org.zgame.tetris.component;

import org.zgame.utils.Constants;

/**
 * Created by SBT-Nikiforov-MO on 28.05.2015.
 */
public class RootGlass {

    private byte rowCount = Constants.matrY;
    private byte columnCount = Constants.matrX;
    private byte[][] filledGlass;

    public RootGlass() {
        filledGlass = new byte[rowCount][columnCount];
    }

    public RootGlass(byte[][] filledGlass) {
        this();
        this.filledGlass = filledGlass;
    }

    public void deleteFullLine(int lineNumber) {
        for (int i = lineNumber - 1; i >= 0; i--) {
            for (int j = 0; j < Constants.matrX; j++) {
                filledGlass[i + 1][j] = filledGlass[i][j];
                filledGlass[i][j] = 0;
            }
        }
    }

    public Boolean verifyGameOver() {
        boolean over = false;
        for (int j = 2; j < Constants.matrX - 2; j++) {
            if (filledGlass[0][j] != 0) {
                over = true;
            }
        }

        return false;
    }

    public byte[][] getFilledGlass() {
        return filledGlass;
    }

    public void setFilledGlass(byte[][] filledGlass) {
        this.filledGlass = filledGlass;
    }

    public byte getRowCount() {
        return rowCount;
    }

    public void setRowCount(byte rowCount) {
        this.rowCount = rowCount;
    }

    public byte getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(byte columnCount) {
        this.columnCount = columnCount;
    }
}