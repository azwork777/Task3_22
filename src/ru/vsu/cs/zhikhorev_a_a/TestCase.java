package ru.vsu.cs.zhikhorev_a_a;

public class TestCase {

    public static int testProgram() {

        if (Picture.getColor(-3, 4) != SimpleColor.YELLOW) {
            return 1;
        }

        if (Picture.getColor(3, 6) != SimpleColor.ORANGE) {
            return 2;
        }

        if (Picture.getColor(3.5, 1.6) != SimpleColor.BLUE) {
            return 3;
        }

        if (Picture.getColor(1.5, 2) != SimpleColor.BLUE) {
            return 4;
        }

        if (Picture.getColor(2.5, -2.25) != SimpleColor.YELLOW) {
            return 5;
        }

        if (Picture.getColor(5, -8) != SimpleColor.GREEN) {
            return 6;
        }

        if (Picture.getColor(-2, -2) != SimpleColor.BLUE) {
            return 7;
        }

        if (Picture.getColor(7, 8) != SimpleColor.YELLOW) {
            return 8;
        }

        if (Picture.getColor(3, -5.1) != SimpleColor.GREEN) {
            return 9;
        }

        if (Picture.getColor(1, 1) != SimpleColor.GRAY) {
            return 10;
        }

        return 0;
    }
}
