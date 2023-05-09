//********************************************************************
// Activity 10 part 1 of 3
// Name: Tyler Shannon
// Date: 2/13/23
//********************************************************************
// This program reads the contents of a text file and displays them
// in the console. The name of the file is hard-coded as "courses.txt".
//
// To run the program, simply execute the main method in this class.
// No data input is required. The file "courses.txt" should exist in
// the same directory as this file.
//********************************************************************

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("courses.txt"))) {

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }
    }
}
