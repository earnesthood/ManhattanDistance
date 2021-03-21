/**
 * Matthew Neal
 * Ford Motor Credit Company — Software Engineering Intern Coding Exercise
 * This program takes two coordinate points and gives the Manhattan distance between them.
 */

import java.util.Scanner;

public class ManhattanDistance {
    public static int findManhattanDistance(int x1, int y1, int x2, int y2) {
        return Math.abs(x1 - x2) + Math.abs(y1 - y2);
    }

    public static void main(String[] args) {
        System.out.println("This program takes two coordinate points and gives the Manhattan distance between them.");

        // verifies that the first coordinate point contains only integers
        int x1;
        int y1;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a first coordinate pair, with each integer separated by a space (e.g. 5 4): ");
            try {
                x1 = Integer.parseInt(scanner.next());
                y1 = Integer.parseInt(scanner.next());
                break;
            } catch (Exception e) {
                System.out.print("Please enter only integers. ");
            }
        }

        // verifies that the second coordinate point contains only integers
        int x2;
        int y2;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a second coordinate pair: ");
            try {
                x2 = Integer.parseInt(scanner.next());
                y2 = Integer.parseInt(scanner.next());
                break;
            } catch (Exception e) {
                System.out.print("Please enter only integers. ");
            }
        }

        System.out.println("The Manhattan distance between these two points is "
                + findManhattanDistance(x1, y1, x2, y2) + ".");
    }
}
