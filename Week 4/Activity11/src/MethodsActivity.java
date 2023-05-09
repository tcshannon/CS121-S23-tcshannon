//**************************************************************
// Activity 11 part 1 of 1
// Name: Tyler Shannon
// Date: 2/13/23
//***************************************************************
// This program calculates the area of a rectangle by prompting
// the user for the length and width of the rectangle. The program
// uses methods to get user input, calculate the area, and display
// the results. The program requires no input files and outputs
// the rectangle length, width, and area to the console.
//*****************************************************************
//*******************************************************************
// FOR ALL CLASSES Class Name::MethodName()
// Parameters:
// None for main()
// No return value for getLength(), getWidth()
// length and width as double for getArea()
// length, width, and area as double for displayData()
// A discussion of what the method/function does and required
// parameters as well as return value.
//********************************************************************
import java.util.Scanner;

public class MethodsActivity {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double length = getLength();
        double width = getWidth();
        double area = getArea(length, width);
        displayData(length, width, area);
        scanner.close();
    }

    public static double getLength() {
        System.out.println("Enter the length of the rectangle:");
        double length = scanner.nextDouble();
        return length;
    }

    public static double getWidth() {
        System.out.println("Enter the width of the rectangle:");
        double width = scanner.nextDouble();
        return width;
    }

    public static double getArea(double length, double width) {
        double area = length * width;
        return area;
    }

    public static void displayData(double length, double width, double area) {
        System.out.println("Rectangle length: " + length);
        System.out.println("Rectangle width: " + width);
        System.out.println("Rectangle area: " + area);
    }
}