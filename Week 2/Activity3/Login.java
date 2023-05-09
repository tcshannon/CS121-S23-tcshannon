package Activity3;
//*****************************************************************
// Assignment #3 part 2 of 3
// Name: Tyler Shannon
// Date: 2/1/23
//*****************************************************************
// This program prompts the user for a username and password using
// JOptionPane and checks if the inputs match the correct username
// and password values. If the inputs match, it prints a welcome message
// to the user. If only one input matches or neither match, an appropriate
// error message is displayed. To run the program, execute the main method
// in the Login class. The user should input a username and password.
//*****************************************************************
import javax.swing.JOptionPane;

public class Login {
    public static void main(String[] args) {
        String userName = "user123";
        String password = "pass123";
        String name = JOptionPane.showInputDialog("Enter your username:");
        String pw = JOptionPane.showInputDialog("Enter your password:");
        if(name.equals(userName) && pw.equals(password)) {
            JOptionPane.showMessageDialog(null, "Welcome to CS121.");
        } else if(name.equals(userName)) {
            JOptionPane.showMessageDialog(null, "Incorrect password.");
        } else if(pw.equals(password)) {
            JOptionPane.showMessageDialog(null, "Incorrect username.");
        } else {
            JOptionPane.showMessageDialog(null, "Both username and password are incorrect.");
        }
    }
}
