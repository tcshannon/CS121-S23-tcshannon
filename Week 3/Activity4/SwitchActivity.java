package Activity4;
//**************************************************************
// Activity 4
// Name: Tyler Shannon
// Date: 2/1/23
//***************************************************************
// This program implements the SwitchActivity class, which asks the user
// to enter a planet name and prints out its size and distance from the sun.
// The program uses a switch statement to check the user input and execute
// the corresponding case statement. If an invalid planet name is entered,
// an error message is printed. To run the program, simply compile and run
// the SwitchActivity.java file.
//*****************************************************************

import java.util.Scanner;

public class SwitchActivity {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name of a planet: ");
        String planet = input.nextLine();

        switch(planet.toLowerCase()) {
            case "mercury":
                System.out.println("Size: 3,031 miles in diameter");
                System.out.println("Distance from the sun: 35.98 million miles");
                break;
            case "venus":
                System.out.println("Size: 7,520.8 miles in diameter");
                System.out.println("Distance from the sun: 67.24 million miles");
                break;
            case "earth":
                System.out.println("Size: 7,926 miles in diameter");
                System.out.println("Distance from the sun: 93 million miles");
                break;
            case "mars":
                System.out.println("Size: 4,212 miles in diameter");
                System.out.println("Distance from the sun: 142 million miles");
                break;
            case "jupiter":
                System.out.println("Size: 86,881 miles in diameter");
                System.out.println("Distance from the sun: 484 million miles");
                break;
            case "saturn":
                System.out.println("Size: 72,367 miles in diameter");
                System.out.println("Distance from the sun: 886 million miles");
                break;
            case "uranus":
                System.out.println("Size: 31,518 miles in diameter");
                System.out.println("Distance from the sun: 1.79 billion miles");
                break;
            case "neptune":
                System.out.println("Size: 30,599 miles in diameter");
                System.out.println("Distance from the sun: 2.8 billion miles");
                break;
            default:
                System.out.println("Invalid planet name.");
                break;
        }
    }
}
