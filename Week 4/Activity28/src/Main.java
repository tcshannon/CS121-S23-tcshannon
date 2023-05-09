//*****************************************************************
// Activity 28 - StudentSet and Iterator part 1 of 2
// Name: Tyler Shannon
// Date: 4/22/23
//*****************************************************************
// This program creates a set of student names using the StudentSet
// class, and then displays the set using the displayStudents() method.
// The user is prompted to enter student names until they enter "q".
// The program then prints out the set of student names in no particular order.
//
// To run the program, compile and run the Main class. Follow the prompts to
// enter student names. Enter "q" when finished. The program will then print
// out the set of student names.
//*****************************************************************


public class Main {
    public static void main(String[] args) {
        StudentSet set = new StudentSet();
        set.addStudents();
        set.displayStudents();
    }
}
