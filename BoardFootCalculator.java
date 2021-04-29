/*
* This program gets the width and height, calculate
* and shows height required for 1 board foot in inches.
*
* @author  Jay Lee
* @version 1.0
* @since   2020-04-29
*/
// package ca.mths.unit1.unit07.java.main;

import java.util.Scanner;

public final class BoardFootCalculator {
    // Constant
    /** One Board Foot is 144 inches^3. */
    static final int ONE_BOARD_FOOT = 144;

    /**
    * This method gets width and length of 1 board foot,
    * calculates and returns height of 1 board foot.
    * @param width -  the width of 1 board foot
    * @param length -  the length of 1 board foot
    * @return height
    */
    public static double boardFoot(final double length, final double width) {
        // Calculate height
        double height = ONE_BOARD_FOOT / (length * width);

        // Return value
        return height;
    }

    private BoardFootCalculator() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * This method gets width and length,
    * passes to function and get to height.
    * @param args
    */
    public static void main(final String[] args) {
        Scanner myObj = new Scanner(System.in);

        // Input
        System.out.print("Enter width in inches: ");
        String widthString = myObj.nextLine();
        System.out.print("Enter length in inches: ");
        String lengthString = myObj.nextLine();

        try {
            // Check condition
            double width = Double.parseDouble(widthString);
            double length = Double.parseDouble(lengthString);
            if (width > 0 && length > 0) {
                double height = boardFoot(width, length);
                // Output
                System.out.println("The height of " + width + " x " + length
                        + " in size required for 1 board foot (144 in³) is "
                        + height + " in.");
            } else {
                System.out.print("Out of range!");
            }
        } catch (Exception invalidInput) {
            System.err.print("Invalid input!");
        }
        System.out.println("\nDone.");
    }
}
