//********************************************************************
// Activity 34 - simple date format part 2 of 2
// Name: Tyler Shannon
// Date: 4/24/23
//********************************************************************
// The TotalCalories class contains a static method that calculates the
// total number of calories consumed during a diet period based on the
// amount of calories per day and the start and end dates of the diet.
// The method takes three parameters: caloriesPerDay (int), startDateStr (String),
// and endDateStr (String), and returns an integer representing the total
// calories consumed. The date format for the start and end dates is mm/dd/yyyy.
//********************************************************************

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TotalCalories {
    public static int getTotalCalories(int caloriesPerDay, String startDateStr, String endDateStr) {
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        Date startDate;
        Date endDate;
        try {
            startDate = df.parse(startDateStr);
            endDate = df.parse(endDateStr);
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please use mm/dd/yyyy.");
            return 0;
        }

        long diffInMs = endDate.getTime() - startDate.getTime();
        long diffInDays = diffInMs / (24 * 60 * 60 * 1000) + 1; // add 1 to include the end date

        return caloriesPerDay * (int) diffInDays;
    }
}