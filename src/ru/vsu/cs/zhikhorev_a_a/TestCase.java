package ru.vsu.cs.zhikhorev_a_a;

public class TestCase {

    public static boolean testProgram() {

        if (Picture.getColor(-3, 4) != SimpleColor.YELLOW) {
            System.out.println("Test number 1 failed, the program does not work correctly");
            return false;
        }

        if (Picture.getColor(3, 6) != SimpleColor.ORANGE) {
            System.out.println("Test number 2 failed, the program does not work correctly");
            return false;
        }

        if (Picture.getColor(3.5, 1.6) != SimpleColor.BLUE) {
            System.out.println("Test number 3 failed, the program does not work correctly");
            return false;
        }

        if (Picture.getColor(1.5, 2) != SimpleColor.BLUE) {
            System.out.println("Test number 4 failed, the program does not work correctly");
            return false;
        }

        if (Picture.getColor(2.5, -2.25) != SimpleColor.YELLOW) {
            System.out.println("Test number 5 failed, the program does not work correctly");
            return false;
        }

        if (Picture.getColor(5, -8) != SimpleColor.GREEN) {
            System.out.println("Test number 6 failed, the program does not work correctly");
            return false;
        }

        if (Picture.getColor(-2, -2) != SimpleColor.BLUE) {
            System.out.println("Test number 7 failed, the program does not work correctly");
            return false;
        }

        if (Picture.getColor(7, 8) != SimpleColor.YELLOW) {
            System.out.println("Test number 8 failed, the program does not work correctly");
            return false;
        }

        if (Picture.getColor(3, -5.1) != SimpleColor.GREEN) {
            System.out.println("Test number 9 failed, the program does not work correctly");
            return false;
        }

        if (Picture.getColor(1, 1) != SimpleColor.GRAY) {
            System.out.println("Test number 10 failed, the program does not work correctly");
            return false;
        }

        return true;

    }
}
