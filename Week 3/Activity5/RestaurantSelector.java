package Activity5;
//**************************************************************
// Activity 5 part 1 of 1
// Name: Tyler Shannon
// Date: 2/1/23
//***************************************************************
// This program allows the user to select a restaurant for a group with dietary restrictions. The program prompts the user for
// whether any members of the group are vegetarian, vegan, or gluten-free. Then, it displays a list of available restaurants
// based on the group's dietary needs. The program assumes that the user enters either "Y" or "N" in response to the dietary
// restriction questions. If the user enters something else, the program will not function correctly.
// To run the program, execute the main method in the RestaurantSelector class. The program will prompt the user for input
// regarding dietary restrictions, and then display a list of available restaurants. Data input format is either "Y" or "N"
// for each dietary restriction question.
import java.util.Scanner;
public class RestaurantSelector {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the restaurant selector!");
        System.out.println("Do any members of your party have dietary restrictions?");
        System.out.println("Enter Y for Yes or N for No.");

        System.out.print("Vegetarian? ");
        boolean vegetarian = input.next().equalsIgnoreCase("Y");

        System.out.print("Vegan? ");
        boolean vegan = input.next().equalsIgnoreCase("Y");

        System.out.print("Gluten-free? ");
        boolean glutenFree = input.next().equalsIgnoreCase("Y");

        System.out.println("Here are your restaurant options:");
        if (!vegetarian && !vegan && !glutenFree) {
            System.out.println("All restaurants are available.");
        } else {
            if (!vegetarian) {
                System.out.println("Joe's Gourmet Burgers is not an option.");
            }
            if (!vegetarian || !glutenFree) {
                System.out.println("Mama's Fine Italian is not an option.");
            }
            if (!vegetarian || !vegan || !glutenFree) {
                System.out.println("Main Street Pizza Company is not an option.");
            }
            if (!vegetarian || !vegan || !glutenFree) {
                System.out.println("The Chef's Kitchen is not an option.");
            }
            if (vegetarian && vegan && glutenFree) {
                System.out.println("Corner Café is your best option!");
            }
        }
    }
}
