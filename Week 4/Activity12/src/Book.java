//**************************************************************
// Activity 12 part 3 of 3
// Name: Tyler Shannon
// Date: 2/30/23
//***************************************************************
// This program defines a Book class that contains information
// about a book such as its title, author, page count, and
// fiction status. It also includes a method to print the
// book's details. The class can be used to instantiate
// objects of a book.
//*****************************************************************
//*******************************************************************
// Book::printDetails()
// Parameters: None
// Prints the book's details such as its title, author, page
// count, and fiction status.
// Return Value: None
//********************************************************************

// Class 2: Book
class Book {
    // instance variables
    String title;
    String author;
    int pageCount;
    boolean isFiction;

    // constructor
    public Book(String title, String author, int pageCount, boolean isFiction) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
        this.isFiction = isFiction;
    }

    // method to print book details
    public void printDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Page Count: " + pageCount);
        System.out.println("Fiction: " + isFiction);
    }
}