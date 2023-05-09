//********************************************************************
// Activity 10 part 3 of 3
// Name: Tyler Shannon
// Date: 2/13/23
//********************************************************************
// This program appends data to a text file. The file format is
// hard-coded, and data is written under headers that are also
// hard-coded.
//
// To run the program, simply execute the main method in this class.
// The program will prompt the user to enter data for each course,
// and append it to the file "courses.txt". The data must be entered
// in the order specified by the headers.
//********************************************************************

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileAppend {

    public static void main(String[] args) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("courses.txt", true))) {

            Scanner scanner = new Scanner(System.in);

            while (true) {

                System.out.print("Enter course code (or 'exit' to quit): ");
                String code = scanner.nextLine();

                if ("exit".equals(code)) {
                    break;
                }

                System.out.print("Enter course name: ");
                String name = scanner.nextLine();

                System.out.print("Enter instructor name: ");
                String instructor = scanner.nextLine();

                System.out.print("Enter schedule: ");
                String schedule = scanner.nextLine();

                System.out.print("Enter room number: ");
                String room = scanner.nextLine();

                bw.write(code + "\t" + name + "\t" + instructor + "\t" + schedule + "\t" + room + "\n");
                bw.flush();

                System.out.println("Data written to file.");

            }

        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }
    }
}
