//*******************************************************************
// Activity 31 - linked lists
// Name: Tyler Shannon
// Date: 4/22/23
//*******************************************************************
// Main class contains the main method to run the program
// It creates two instances of the Student class, adds courses to their course lists,
// prints their information and course lists, removes a course from each course list,
// and prints the course lists again to verify the course was removed.
//********************************************************************


public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("John", "Doe", "000001", "Computer Science", "Freshman");
        student1.addCourse("Math 101");
        student1.addCourse("Computer Science 101");
        student1.addCourse("English 101");
        student1.addCourse("History 101");
        System.out.println(student1.getStudentInfo());
        student1.displayStudentCourses();
        student1.removeCourse("History 101");
        System.out.println("After removing a course:");
        student1.displayStudentCourses();

        Student student2 = new Student("Jane", "Smith", "000002", "Biology", "Sophomore");
        student2.addCourse("Biology 101");
        student2.addCourse("Chemistry 101");
        student2.addCourse("Psychology 101");
        System.out.println(student2.getStudentInfo());
        student2.displayStudentCourses();
        student2.removeCourse("Psychology 101");
        System.out.println("After removing a course:");
        student2.displayStudentCourses();
    }
}
