//**************************************************************
// Activity 30 - hashmaps part 2 of 2
// Name: Tyler Shannon
// Date: 4/22/23
//***************************************************************
// This class provides a main method to test the MyHashMap class.
// It creates an instance of MyHashMap, adds some key/value pairs,
// displays them, removes one of them, and displays the remaining
// pairs again. To run this program, compile and execute this class.
//*****************************************************************

public class TestMyHashMap {
    public static void main(String[] args) {
        MyHashMap myMap = new MyHashMap();

        myMap.add("John", "Doe");
        myMap.add("Jane", "Doe");
        myMap.add("Bob", "Smith");

        System.out.println("Initial key/value pairs:");
        myMap.display();

        myMap.remove("Jane");

        System.out.println("\nKey/value pairs after removing Jane:");
        myMap.display();
    }
}
