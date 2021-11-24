package ru.vsu.cs.zhikhorev_a_a;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.ROOT);

        printMessageAboutTests();

        if (!isProgramWorkingCorrectly()) {
            return;
        }

        double x = readNumber("x");
        double y = readNumber("y");

        printColorForPoint(x, y);

    }

    private static void printMessageAboutTests() {
        if (TestCase.testProgram() != 0) {
            int FailedTestNumber = TestCase.testProgram();
            System.out.println("Test number " + FailedTestNumber + " failed, the program does not work correctly");
        } else {
            System.out.println("All tests are correct, the program works correctly");
        }
    }

    private static boolean isProgramWorkingCorrectly() {
        if (TestCase.testProgram() != 0) {
            return false;
        } else {
            return true;
        }
    }

    private static double readNumber(String variable) {
        System.out.println("Input " + variable + " (ranging from -10 to 10): ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();

        if (Math.abs(a) > 10) {
            System.out.println("Input error. Please check the correctness of the entered data");
            return readNumber(variable);
        }

        return a;
    }

    private static void printColorForPoint(double x, double y) {
        System.out.printf("(%.3f, %.3f) -> %s%n", x, y, Picture.getColor(x, y));
    }

}