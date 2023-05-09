//********************************************************************
// Activity 28 - StudentSet and Iterator part 2 of 2
// Name: Tyler Shannon
// Date: 4/22/23
//********************************************************************
// This class represents a set of student names. The set is implemented
// using a HashSet of Strings. The addStudents() method prompts the user
// to enter student names, and adds them to the set until the user enters
// "q". The displayStudents() method creates an iterator for the set,
// and prints out each student in the set using the iterator.
//
// This class is intended to be used with the Main class to create and
// display a set of student names.
//********************************************************************

import java.util.*;

public class StudentSet {
    private Set<String> students;

    public StudentSet() {
        students = new HashSet<>();
    }

    public void addStudents() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter student names (q to quit):");
        String name = input.nextLine();
        while (!name.equals("q")) {
            students.add(name);
            name = input.nextLine();
        }
    }

    public void displayStudents() {
        Iterator<String> iterator = students.iterator();
        System.out.println("Student Set:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

