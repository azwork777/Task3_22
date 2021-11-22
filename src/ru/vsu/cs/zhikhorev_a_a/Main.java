package ru.vsu.cs.zhikhorev_a_a;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.ROOT);

        isProgramWorkingCorrectly();

        double x = ReadNumber("x");
        double y = ReadNumber("y");

        printColorForPoint(x, y);
    }

    public static void isProgramWorkingCorrectly() {
        if (TestCase.testProgram()) {
            System.out.println("All tests are correct, the program works correctly");
        }
    }

    public static double ReadNumber(String variable) {
        System.out.println("Input " + variable + " (ranging from -10 to 10): ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();

        if (Math.abs(a) > 10) {
            System.out.println("Input error. Please check the correctness of the entered data");
            return ReadNumber(variable);
        }

        return a;
    }

    public static void printColorForPoint(double x, double y) {
        System.out.printf("(%.3f, %.3f) -> %s%n", x, y, Picture.getColor(x, y));
    }

}