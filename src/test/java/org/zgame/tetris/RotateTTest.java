package org.zgame.tetris;

import junit.framework.TestCase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.zgame.tetris.component.FigureType;
import org.zgame.tetris.component.RootGlass;
import org.zgame.tetris.component.TemplateOfFigure;
import org.zgame.utils.Constants;

import java.util.Arrays;

/**
 * Created by mnikiforov on 02.06.2015.
 */
public class RotateTTest extends TestCase {

    private static final Logger log = LoggerFactory.getLogger(RotateTTest.class);

    public void testCaseFigure_3_0() {
        byte[][] rootGlassMatr = new byte[][]{
            //    0  1  2   3   4   5  6  7  8  9
            /*0*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
            /*1*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
            /*2*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
            /*3*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
            /*4*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
            /*5*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
            /*6*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
            /*7*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
            /*8*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
            /*9*/{0, 0, 0, 00, 00, 00, 0, 0, 0, 0},
           /*10*/{0, 0, 0,  0, 00,  0, 0, 0, 0, 0},
           /*11*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
           /*12*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
           /*13*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
           /*14*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
           /*15*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
           /*16*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
           /*17*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
           /*18*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
           /*19*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0}
        };

        byte[][] matrExpected = new byte[][]{
            //    0  1  2   3   4  5  6  7  8  9
            /*0*/{0, 0, 0,  0,  0, 0, 0, 0, 0, 0},
            /*1*/{0, 0, 0,  0,  0, 0, 0, 0, 0, 0},
            /*2*/{0, 0, 0,  0,  0, 0, 0, 0, 0, 0},
            /*3*/{0, 0, 0,  0,  0, 0, 0, 0, 0, 0},
            /*4*/{0, 0, 0,  0,  0, 0, 0, 0, 0, 0},
            /*5*/{0, 0, 0,  0,  0, 0, 0, 0, 0, 0},
            /*6*/{0, 0, 0,  0,  0, 0, 0, 0, 0, 0},
            /*7*/{0, 0, 0,  0,  0, 0, 0, 0, 0, 0},
            /*8*/{0, 0, 0,  0,  0, 0, 0, 0, 0, 0},
            /*9*/{0, 0, 0,  0, 01, 0, 0, 0, 0, 0},
           /*10*/{0, 0, 0, 01, 01, 0, 0, 0, 0, 0},
           /*11*/{0, 0, 0,  0, 01, 0, 0, 0, 0, 0},
           /*12*/{0, 0, 0,  0,  0, 0, 0, 0, 0, 0},
           /*13*/{0, 0, 0,  0,  0, 0, 0, 0, 0, 0},
           /*14*/{0, 0, 0,  0,  0, 0, 0, 0, 0, 0},
           /*15*/{0, 0, 0,  0,  0, 0, 0, 0, 0, 0},
           /*16*/{0, 0, 0,  0,  0, 0, 0, 0, 0, 0},
           /*17*/{0, 0, 0,  0,  0, 0, 0, 0, 0, 0},
           /*18*/{0, 0, 0,  0,  0, 0, 0, 0, 0, 0},
           /*19*/{0, 0, 0,  0,  0, 0, 0, 0, 0, 0}
        };

        RootGlass rootGlass = new RootGlass(rootGlassMatr);
        TemplateOfFigure tof = new TemplateOfFigure(FigureType.T, 9, 3);

        tof.rotate(rootGlass);

        if (Arrays.deepEquals(tof.getFigure().getMatr(), matrExpected)) {
            log.debug("testCaseFigure_3_0 is passed!");
            assertTrue(true);
        } else {
            log.error("testCaseFigure_3_0 is not passed");
            log.debug("tof.getFigure().getMatr(): {}", Arrays.deepToString(tof.getFigure().getMatr()));
            log.debug("matrExpected:    {}", Arrays.deepToString(matrExpected));
            assertTrue(false);
        }
    }

    public void testCaseFigure_3_01() {
        byte[][] rootGlassMatr = new byte[][]{
            //    0  1  2   3   4   5  6  7  8  9
            /*0*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
            /*1*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
            /*2*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
            /*3*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
            /*4*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
            /*5*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
            /*6*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
            /*7*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
            /*8*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
            /*9*/{0, 0, 0, 00, 00, 00, 0, 0, 0, 0},
           /*10*/{0, 0, 0,  0, 00,  0, 0, 0, 0, 0},
           /*11*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
           /*12*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
           /*13*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
           /*14*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
           /*15*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
           /*16*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
           /*17*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
           /*18*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
           /*19*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0}
        };

        byte[][] matrExpected = new byte[][]{
            //    0  1  2   3   4   5  6  7  8  9
            /*0*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
            /*1*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
            /*2*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
            /*3*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
            /*4*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
            /*5*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
            /*6*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
            /*7*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
            /*8*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
            /*9*/{0, 0, 0,  0, 01,  0, 0, 0, 0, 0},
           /*10*/{0, 0, 0, 01, 01, 01, 0, 0, 0, 0},
           /*11*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
           /*12*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
           /*13*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
           /*14*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
           /*15*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
           /*16*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
           /*17*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
           /*18*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
           /*19*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0}
        };

        RootGlass rootGlass = new RootGlass(rootGlassMatr);
        TemplateOfFigure tof = new TemplateOfFigure(FigureType.T, 9, 3);

        tof.rotate(rootGlass);
        tof.rotate(rootGlass);

        if (Arrays.deepEquals(tof.getFigure().getMatr(), matrExpected)) {
            log.debug("testCaseFigure_3_01 is passed!");
            assertTrue(true);
        } else {
            log.error("testCaseFigure_3_01 is not passed");
            log.debug("tof.getFigure().getMatr(): {}", Arrays.deepToString(tof.getFigure().getMatr()));
            log.debug("matrExpected:              {}", Arrays.deepToString(matrExpected));
            assertTrue(false);
        }
    }

    public void testCaseFigure_3_02() {
        byte[][] rootGlassMatr = new byte[][]{
            //    0  1  2   3   4   5  6  7  8  9
            /*0*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
            /*1*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
            /*2*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
            /*3*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
            /*4*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
            /*5*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
            /*6*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
            /*7*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
            /*8*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
            /*9*/{0, 0, 0, 00, 00, 00, 0, 0, 0, 0},
           /*10*/{0, 0, 0,  0, 00,  0, 0, 0, 0, 0},
           /*11*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
           /*12*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
           /*13*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
           /*14*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
           /*15*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
           /*16*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
           /*17*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
           /*18*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
           /*19*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0}
        };

        byte[][] matrExpected = new byte[][]{
            //    0  1  2   3   4   5  6  7  8  9
            /*0*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
            /*1*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
            /*2*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
            /*3*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
            /*4*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
            /*5*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
            /*6*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
            /*7*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
            /*8*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
            /*9*/{0, 0, 0, 01,  0,  0, 0, 0, 0, 0},
           /*10*/{0, 0, 0, 01, 01,  0, 0, 0, 0, 0},
           /*11*/{0, 0, 0, 01,  0,  0, 0, 0, 0, 0},
           /*12*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
           /*13*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
           /*14*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
           /*15*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
           /*16*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
           /*17*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
           /*18*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
           /*19*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0}
        };

        RootGlass rootGlass = new RootGlass(rootGlassMatr);
        TemplateOfFigure tof = new TemplateOfFigure(FigureType.T, 9, 3);

        tof.rotate(rootGlass);
        tof.rotate(rootGlass);
        tof.rotate(rootGlass);

        if (Arrays.deepEquals(tof.getFigure().getMatr(), matrExpected)) {
            log.debug("testCaseFigure_3_02 is passed!");
            assertTrue(true);
        } else {
            log.error("testCaseFigure_3_02 is not passed");
            log.debug("tof.getFigure().getMatr(): {}", Arrays.deepToString(tof.getFigure().getMatr()));
            log.debug("matrExpected:              {}", Arrays.deepToString(matrExpected));
            assertTrue(false);
        }
    }

    public void testCaseFigure_3_03() {
        byte[][] rootGlassMatr = new byte[][]{
            //    0  1  2  3  4  5  6  7   8   9
            /*0*/{0, 0, 0, 0, 0, 0, 0, 0,  0,  0},
            /*1*/{0, 0, 0, 0, 0, 0, 0, 0,  0,  0},
            /*2*/{0, 0, 0, 0, 0, 0, 0, 0,  0,  0},
            /*3*/{0, 0, 0, 0, 0, 0, 0, 0,  0,  0},
            /*4*/{0, 0, 0, 0, 0, 0, 0, 0,  0,  0},
            /*5*/{0, 0, 0, 0, 0, 0, 0, 0,  0,  0},
            /*6*/{0, 0, 0, 0, 0, 0, 0, 0,  0,  0},
            /*7*/{0, 0, 0, 0, 0, 0, 0, 0,  0,  0},
            /*8*/{0, 0, 0, 0, 0, 0, 0, 0,  0,  0},
            /*9*/{0, 0, 0, 0, 0, 0, 0, 0,  0, 00},
           /*10*/{0, 0, 0, 0, 0, 0, 0, 0, 00, 00},
           /*11*/{0, 0, 0, 0, 0, 0, 0, 0,  0, 00},
           /*12*/{0, 0, 0, 0, 0, 0, 0, 0,  0,  0},
           /*13*/{0, 0, 0, 0, 0, 0, 0, 0,  0,  0},
           /*14*/{0, 0, 0, 0, 0, 0, 0, 0,  0,  0},
           /*15*/{0, 0, 0, 0, 0, 0, 0, 0,  0,  0},
           /*16*/{0, 0, 0, 0, 0, 0, 0, 0,  0,  0},
           /*17*/{0, 0, 0, 0, 0, 0, 0, 0,  0,  0},
           /*18*/{0, 0, 0, 0, 0, 0, 0, 0,  0,  0},
           /*19*/{0, 0, 0, 0, 0, 0, 0, 0,  0,  0}
        };

        byte[][] matrExpected = new byte[][]{
            //    0  1  2  3  4  5  6   7   8   9
            /*0*/{0, 0, 0, 0, 0, 0, 0,  0,  0,  0},
            /*1*/{0, 0, 0, 0, 0, 0, 0,  0,  0,  0},
            /*2*/{0, 0, 0, 0, 0, 0, 0,  0,  0,  0},
            /*3*/{0, 0, 0, 0, 0, 0, 0,  0,  0,  0},
            /*4*/{0, 0, 0, 0, 0, 0, 0,  0,  0,  0},
            /*5*/{0, 0, 0, 0, 0, 0, 0,  0,  0,  0},
            /*6*/{0, 0, 0, 0, 0, 0, 0,  0,  0,  0},
            /*7*/{0, 0, 0, 0, 0, 0, 0,  0,  0,  0},
            /*8*/{0, 0, 0, 0, 0, 0, 0,  0,  0,  0},
            /*9*/{0, 0, 0, 0, 0, 0, 0,  0, 01,  0},
           /*10*/{0, 0, 0, 0, 0, 0, 0, 01, 01, 01},
           /*11*/{0, 0, 0, 0, 0, 0, 0,  0,  0,  0},
           /*12*/{0, 0, 0, 0, 0, 0, 0,  0,  0,  0},
           /*13*/{0, 0, 0, 0, 0, 0, 0,  0,  0,  0},
           /*14*/{0, 0, 0, 0, 0, 0, 0,  0,  0,  0},
           /*15*/{0, 0, 0, 0, 0, 0, 0,  0,  0,  0},
           /*16*/{0, 0, 0, 0, 0, 0, 0,  0,  0,  0},
           /*17*/{0, 0, 0, 0, 0, 0, 0,  0,  0,  0},
           /*18*/{0, 0, 0, 0, 0, 0, 0,  0,  0,  0},
           /*19*/{0, 0, 0, 0, 0, 0, 0,  0,  0,  0}
        };

        RootGlass rootGlass = new RootGlass(rootGlassMatr);
        TemplateOfFigure tof = new TemplateOfFigure(FigureType.T, 9, 7);

        tof.rotate(rootGlass);
        tof.moveRight(rootGlass);

        tof.rotate(rootGlass);

        if (Arrays.deepEquals(tof.getFigure().getMatr(), matrExpected)) {
            log.debug("testCaseFigure_3_03 is passed!");
            assertTrue(true);
        } else {
            log.error("testCaseFigure_3_03 is not passed");
            log.debug("tof.getFigure().getMatr(): {}", Arrays.deepToString(tof.getFigure().getMatr()));
            log.debug("matrExpected:              {}", Arrays.deepToString(matrExpected));
            assertTrue(false);
        }
    }

    public void testCaseFigure_3_04() {
        byte[][] rootGlassMatr = new byte[][]{
            //    0  1  2  3  4  5  6   7   8   9
            /*0*/{0, 0, 0, 0, 0, 0, 0,  0,  0,  0},
            /*1*/{0, 0, 0, 0, 0, 0, 0,  0,  0,  0},
            /*2*/{0, 0, 0, 0, 0, 0, 0,  0,  0,  0},
            /*3*/{0, 0, 0, 0, 0, 0, 0,  0,  0,  0},
            /*4*/{0, 0, 0, 0, 0, 0, 0,  0,  0,  0},
            /*5*/{0, 0, 0, 0, 0, 0, 0,  0,  0,  0},
            /*6*/{0, 0, 0, 0, 0, 0, 0,  0,  0,  0},
            /*7*/{0, 0, 0, 0, 0, 0, 0,  0,  0,  0},
            /*8*/{0, 0, 0, 0, 0, 0, 0,  0,  0,  0},
            /*9*/{0, 0, 0, 0, 0, 0, 0,  0,  0, 00},
           /*10*/{0, 0, 0, 0, 0, 0, 0, 01, 00, 00},
           /*11*/{0, 0, 0, 0, 0, 0, 0,  0,  0, 00},
           /*12*/{0, 0, 0, 0, 0, 0, 0,  0,  0,  0},
           /*13*/{0, 0, 0, 0, 0, 0, 0,  0,  0,  0},
           /*14*/{0, 0, 0, 0, 0, 0, 0,  0,  0,  0},
           /*15*/{0, 0, 0, 0, 0, 0, 0,  0,  0,  0},
           /*16*/{0, 0, 0, 0, 0, 0, 0,  0,  0,  0},
           /*17*/{0, 0, 0, 0, 0, 0, 0,  0,  0,  0},
           /*18*/{0, 0, 0, 0, 0, 0, 0,  0,  0,  0},
           /*19*/{0, 0, 0, 0, 0, 0, 0,  0,  0,  0}
        };

        byte[][] matrExpected = new byte[][]{
            //    0  1  2  3  4  5  6  7   8   9
            /*0*/{0, 0, 0, 0, 0, 0, 0, 0,  0,  0},
            /*1*/{0, 0, 0, 0, 0, 0, 0, 0,  0,  0},
            /*2*/{0, 0, 0, 0, 0, 0, 0, 0,  0,  0},
            /*3*/{0, 0, 0, 0, 0, 0, 0, 0,  0,  0},
            /*4*/{0, 0, 0, 0, 0, 0, 0, 0,  0,  0},
            /*5*/{0, 0, 0, 0, 0, 0, 0, 0,  0,  0},
            /*6*/{0, 0, 0, 0, 0, 0, 0, 0,  0,  0},
            /*7*/{0, 0, 0, 0, 0, 0, 0, 0,  0,  0},
            /*8*/{0, 0, 0, 0, 0, 0, 0, 0,  0,  0},
            /*9*/{0, 0, 0, 0, 0, 0, 0, 0,  0, 01},
           /*10*/{0, 0, 0, 0, 0, 0, 0, 0, 01, 01},
           /*11*/{0, 0, 0, 0, 0, 0, 0, 0,  0, 01},
           /*12*/{0, 0, 0, 0, 0, 0, 0, 0,  0,  0},
           /*13*/{0, 0, 0, 0, 0, 0, 0, 0,  0,  0},
           /*14*/{0, 0, 0, 0, 0, 0, 0, 0,  0,  0},
           /*15*/{0, 0, 0, 0, 0, 0, 0, 0,  0,  0},
           /*16*/{0, 0, 0, 0, 0, 0, 0, 0,  0,  0},
           /*17*/{0, 0, 0, 0, 0, 0, 0, 0,  0,  0},
           /*18*/{0, 0, 0, 0, 0, 0, 0, 0,  0,  0},
           /*19*/{0, 0, 0, 0, 0, 0, 0, 0,  0,  0}
        };

        TemplateOfFigure tof = new TemplateOfFigure(FigureType.T, 9, 7);

        RootGlass emptyRootGlass = new RootGlass(Constants.EMPTY_ROOT_GLASS_MATR);
        tof.rotate(emptyRootGlass);
        tof.moveRight(emptyRootGlass);

        RootGlass rootGlass = new RootGlass(rootGlassMatr);
        tof.rotate(rootGlass);

        if (Arrays.deepEquals(tof.getFigure().getMatr(), matrExpected)) {
            log.debug("testCaseFigure_3_04 is passed!");
            assertTrue(true);
        } else {
            log.error("testCaseFigure_3_04 is not passed");
            log.debug("tof.getFigure().getMatr(): {}", Arrays.deepToString(tof.getFigure().getMatr()));
            log.debug("matrExpected:              {}", Arrays.deepToString(matrExpected));
            assertTrue(false);
        }
    }

    public void testCaseFigure_3_1() {
        byte[][] rootGlassMatr = new byte[][]{
            //    0  1  2   3   4   5  6  7  8  9
            /*0*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
            /*1*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
            /*2*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
            /*3*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
            /*4*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
            /*5*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
            /*6*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
            /*7*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
            /*8*/{0, 0, 0, 00, 00, 00, 0, 0, 0, 0},
            /*9*/{0, 0, 0,  0, 00,  0, 0, 0, 0, 0},
           /*10*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
           /*11*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
           /*12*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
           /*13*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
           /*14*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
           /*15*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
           /*16*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
           /*17*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
           /*18*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
           /*19*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0}
        };

        RootGlass rootGlass = new RootGlass(rootGlassMatr);
        TemplateOfFigure tof = new TemplateOfFigure(FigureType.T, 8, 3);
        TemplateOfFigure tofExpected = new TemplateOfFigure(FigureType.T, 8, 3).rotationAngleInt(90);

        tof.rotate(rootGlass);

        if (Arrays.deepEquals(tof.getFigure().getMatr(), tofExpected.getFigure().getMatr())) {
            log.debug("testCaseFigure_3_1 is passed!");
            assertTrue(true);
        } else {
            log.error("testCaseFigure_3_1 is not passed");
            log.debug("tof.getFigure().getMatr():          {}", Arrays.deepToString(tof.getFigure().getMatr()));
            log.debug("tofExpected.getFigure():  {}", Arrays.deepToString(tofExpected.getFigure().getMatr()));
            assertTrue(false);
        }
    }

    public void testCaseFigure_3_2() {
        byte[][] rootGlassMatr = new byte[][]{
            //     0   1   2  3  4  5  6  7  8  9
            /*0*/{ 0,  0,  0, 0, 0, 0, 0, 0, 0, 0},
            /*1*/{ 0,  0,  0, 0, 0, 0, 0, 0, 0, 0},
            /*2*/{ 0,  0,  0, 0, 0, 0, 0, 0, 0, 0},
            /*3*/{ 0,  0,  0, 0, 0, 0, 0, 0, 0, 0},
            /*4*/{ 0,  0,  0, 0, 0, 0, 0, 0, 0, 0},
            /*5*/{ 0,  0,  0, 0, 0, 0, 0, 0, 0, 0},
            /*6*/{ 0,  0,  0, 0, 0, 0, 0, 0, 0, 0},
            /*7*/{ 0,  0,  0, 0, 0, 0, 0, 0, 0, 0},
            /*8*/{00, 00, 00, 0, 0, 0, 0, 0, 0, 0},
            /*9*/{ 0, 00,  0, 0, 0, 0, 0, 0, 0, 0},
           /*10*/{ 0,  0,  0, 0, 0, 0, 0, 0, 0, 0},
           /*11*/{ 0,  0,  0, 0, 0, 0, 0, 0, 0, 0},
           /*12*/{ 0,  0,  0, 0, 0, 0, 0, 0, 0, 0},
           /*13*/{ 0,  0,  0, 0, 0, 0, 0, 0, 0, 0},
           /*14*/{ 0,  0,  0, 0, 0, 0, 0, 0, 0, 0},
           /*15*/{ 0,  0,  0, 0, 0, 0, 0, 0, 0, 0},
           /*16*/{ 0,  0,  0, 0, 0, 0, 0, 0, 0, 0},
           /*17*/{ 0,  0,  0, 0, 0, 0, 0, 0, 0, 0},
           /*18*/{ 0,  0,  0, 0, 0, 0, 0, 0, 0, 0},
           /*19*/{ 0,  0,  0, 0, 0, 0, 0, 0, 0, 0}
        };

        byte[][] matrExpected = new byte[][]{
            //     0   1  2  3  4  5  6  7  8  9
            /*0*/{ 0,  0, 0, 0, 0, 0, 0, 0, 0, 0},
            /*1*/{ 0,  0, 0, 0, 0, 0, 0, 0, 0, 0},
            /*2*/{ 0,  0, 0, 0, 0, 0, 0, 0, 0, 0},
            /*3*/{ 0,  0, 0, 0, 0, 0, 0, 0, 0, 0},
            /*4*/{ 0,  0, 0, 0, 0, 0, 0, 0, 0, 0},
            /*5*/{ 0,  0, 0, 0, 0, 0, 0, 0, 0, 0},
            /*6*/{ 0,  0, 0, 0, 0, 0, 0, 0, 0, 0},
            /*7*/{ 0,  0, 0, 0, 0, 0, 0, 0, 0, 0},
            /*8*/{ 0, 01, 0, 0, 0, 0, 0, 0, 0, 0},
            /*9*/{01, 01, 0, 0, 0, 0, 0, 0, 0, 0},
           /*10*/{ 0, 01, 0, 0, 0, 0, 0, 0, 0, 0},
           /*11*/{ 0,  0, 0, 0, 0, 0, 0, 0, 0, 0},
           /*12*/{ 0,  0, 0, 0, 0, 0, 0, 0, 0, 0},
           /*13*/{ 0,  0, 0, 0, 0, 0, 0, 0, 0, 0},
           /*14*/{ 0,  0, 0, 0, 0, 0, 0, 0, 0, 0},
           /*15*/{ 0,  0, 0, 0, 0, 0, 0, 0, 0, 0},
           /*16*/{ 0,  0, 0, 0, 0, 0, 0, 0, 0, 0},
           /*17*/{ 0,  0, 0, 0, 0, 0, 0, 0, 0, 0},
           /*18*/{ 0,  0, 0, 0, 0, 0, 0, 0, 0, 0},
           /*19*/{ 0,  0, 0, 0, 0, 0, 0, 0, 0, 0}
        };
        RootGlass rootGlass = new RootGlass(rootGlassMatr);
        TemplateOfFigure tof = new TemplateOfFigure(FigureType.T, 8, 0);

        tof.rotate(rootGlass);

        if (Arrays.deepEquals(tof.getFigure().getMatr(), matrExpected)) {
            log.debug("testCaseFigure_3_2 is passed!");
            assertTrue(true);
        } else {
            log.error("testCaseFigure_3_2 is not passed");
            log.debug("tof.getFigure().getMatr(): {}", Arrays.deepToString(tof.getFigure().getMatr()));
            log.debug("matrExpected:    {}", Arrays.deepToString(matrExpected));
            assertTrue(false);
        }
    }

    public void testCaseFigure_3_3() {
        byte[][] rootGlassMatr = new byte[][]{
            //    0  1  2   3   4   5  6  7  8  9
            /*0*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
            /*1*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
            /*2*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
            /*3*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
            /*4*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
            /*5*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
            /*6*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
            /*7*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
            /*8*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
            /*9*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
           /*10*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
           /*11*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
           /*12*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
           /*13*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
           /*14*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
           /*15*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
           /*16*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
           /*17*/{0, 0, 0,  0,  0,  0, 0, 0, 0, 0},
           /*18*/{0, 0, 0, 00, 00, 00, 0, 0, 0, 0},
           /*19*/{0, 0, 0,  0, 00,  0, 0, 0, 0, 0}
        };

        byte[][] matrExpected = new byte[][]{
            //    0  1  2   3   4  5  6  7  8  9
            /*0*/{0, 0, 0,  0,  0, 0, 0, 0, 0, 0},
            /*1*/{0, 0, 0,  0,  0, 0, 0, 0, 0, 0},
            /*2*/{0, 0, 0,  0,  0, 0, 0, 0, 0, 0},
            /*3*/{0, 0, 0,  0,  0, 0, 0, 0, 0, 0},
            /*4*/{0, 0, 0,  0,  0, 0, 0, 0, 0, 0},
            /*5*/{0, 0, 0,  0,  0, 0, 0, 0, 0, 0},
            /*6*/{0, 0, 0,  0,  0, 0, 0, 0, 0, 0},
            /*7*/{0, 0, 0,  0,  0, 0, 0, 0, 0, 0},
            /*8*/{0, 0, 0,  0,  0, 0, 0, 0, 0, 0},
            /*9*/{0, 0, 0,  0,  0, 0, 0, 0, 0, 0},
           /*10*/{0, 0, 0,  0,  0, 0, 0, 0, 0, 0},
           /*11*/{0, 0, 0,  0,  0, 0, 0, 0, 0, 0},
           /*12*/{0, 0, 0,  0,  0, 0, 0, 0, 0, 0},
           /*13*/{0, 0, 0,  0,  0, 0, 0, 0, 0, 0},
           /*14*/{0, 0, 0,  0,  0, 0, 0, 0, 0, 0},
           /*15*/{0, 0, 0,  0,  0, 0, 0, 0, 0, 0},
           /*16*/{0, 0, 0,  0,  0, 0, 0, 0, 0, 0},
           /*17*/{0, 0, 0,  0, 01, 0, 0, 0, 0, 0},
           /*18*/{0, 0, 0, 01, 01, 0, 0, 0, 0, 0},
           /*19*/{0, 0, 0,  0, 01, 0, 0, 0, 0, 0}
        };
        RootGlass rootGlass = new RootGlass(rootGlassMatr);
        TemplateOfFigure tof = new TemplateOfFigure(FigureType.T, 18, 3);

        tof.rotate(rootGlass);

        if (Arrays.deepEquals(tof.getFigure().getMatr(), matrExpected)) {
            log.debug("testCaseFigure_3_3 is passed!");
            assertTrue(true);
        } else {
            log.error("testCaseFigure_3_3 is not passed");
            log.debug("tof.getFigure().getMatr(): {}", Arrays.deepToString(tof.getFigure().getMatr()));
            log.debug("matrExpected:    {}", Arrays.deepToString(matrExpected));
            assertTrue(false);
        }
    }
}
