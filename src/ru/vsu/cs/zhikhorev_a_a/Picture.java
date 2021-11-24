package ru.vsu.cs.zhikhorev_a_a;

import ru.vsu.cs.zhikhorev_a_a.figures.Circle;
import ru.vsu.cs.zhikhorev_a_a.figures.HorizontalParabola;
import ru.vsu.cs.zhikhorev_a_a.figures.VerticalParabola;
import ru.vsu.cs.zhikhorev_a_a.figures.Line;


public class Picture {
    public static final Circle C = new Circle(-2, -4, 5);
    public static final HorizontalParabola SmallP = new HorizontalParabola(2, 3, 0.5);
    public static final HorizontalParabola BigP = new HorizontalParabola(-4, -2, 0.5);
    public static final VerticalParabola VP = new VerticalParabola(3, 1, 1);
    public static final Line L = new Line(0, 7, -4);


    public static SimpleColor getColor(double x, double y) {
        if (L.isPointAboveLine(x, y)) {
            return getColorFromAreaAboveLine(x, y);
        } else {
            return getColorFromAreaUnderLine(x, y);
        }
    }

    private static SimpleColor getColorFromAreaAboveLine(double x, double y) {

        if (VP.isPointInsideVerticalParabola(x, y)) {
            if (SmallP.isPointInsideHorizontalParabola(x, y)) {
                return SimpleColor.BLUE;
            } else if (BigP.isPointInsideHorizontalParabola(x, y)) {
                return SimpleColor.BLUE;
            } else return SimpleColor.ORANGE;
        }

        if (SmallP.isPointInsideHorizontalParabola(x, y)) {
            if (BigP.isPointInsideHorizontalParabola(x, y)) {
                return SimpleColor.ORANGE;
            } else return SimpleColor.YELLOW;
        }

        if (BigP.isPointInsideHorizontalParabola(x, y)) {
            if (C.isPointInsideCircle(x, y)) {
                return SimpleColor.YELLOW;
            } else return SimpleColor.ORANGE;
        }

        if (y < -5) {
            return SimpleColor.GREEN;
        } else if (x < 3) {
            return SimpleColor.BLUE;
        } else return SimpleColor.YELLOW;


    }

    private static SimpleColor getColorFromAreaUnderLine(double x, double y) {

        if (C.isPointInsideCircle(x, y)) {
            if (BigP.isPointInsideHorizontalParabola(x, y)) {
                return SimpleColor.BLUE;
            } else return SimpleColor.YELLOW;
        }

        if (BigP.isPointInsideHorizontalParabola(x, y)) {
            if (y > -2) {
                return SimpleColor.GRAY;
            } else return SimpleColor.GREEN;
        }

        return SimpleColor.YELLOW;

    }
}