//********************************************************************
// Activity 34 - simple date format part 1 of 2
// Name: Tyler Shannon
// Date: 4/24/23
//********************************************************************
// The Main class contains the main method that prompts the user to input
// the amount of calories allowed per day, the start date of the diet,
// and the end date of the diet. It then calls the getTotalCalories
// method from the TotalCalories class to calculate the total calories
// consumed during the diet period and prints the result. The date format
// for the start and end dates is mm/dd/yyyy.
//********************************************************************

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount of calories allowed per day by the diet: ");
        int caloriesPerDay = scanner.nextInt();

        System.out.print("Enter the start date of the diet (mm/dd/yyyy): ");
        String startDateStr = scanner.next();

        System.out.print("Enter the end date of the diet (mm/dd/yyyy): ");
        String endDateStr = scanner.next();

        int totalCalories = TotalCalories.getTotalCalories(caloriesPerDay, startDateStr, endDateStr);
        System.out.println("Total calories consumed during the diet period: " + totalCalories);
    }
}