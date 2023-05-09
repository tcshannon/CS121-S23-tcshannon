package Activity3;
//*****************************************************************
// Assignment #3 part 3 of 3
// Name: Tyler Shannon
// Date: 2/1/23
//*****************************************************************
// This program prompts the user for the lengths of the three sides of
// a triangle using Scanner or JOptionPane and determines if the triangle
// is scalene, isosceles, or equilateral using if/else statements. It then
// prints the result to the console. To run the program, execute the main
// method in the Triangles class. The user should input three integer values
// representing the lengths of the three sides of the triangle.
//*****************************************************************
import java.util.Scanner;

public class Triangles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of side 1: ");
        int side1 = sc.nextInt();
        System.out.print("Enter the length of side 2: ");
        int side2 = sc.nextInt();
        System.out.print("Enter the length of side 3: ");
        int side3 = sc.nextInt();
        if(side1 == side2 && side2 == side3) {
            System.out.println("The triangle is equilateral.");
        } else if(side1 == side2 || side2 == side3 || side1 == side3) {
            System.out.println("The triangle is isosceles.");
        } else {
            System.out.println("The triangle is scalene.");
        }
        sc.close();
    }
}
