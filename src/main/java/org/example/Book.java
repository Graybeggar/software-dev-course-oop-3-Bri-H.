package org.example;


public class Book extends LibraryItem {
    protected int pageCount;  //The number of pages in the book

    //Constructor that initializes the fields of the class
    public Book(String title, int year, String author, int pageCount) {
        super(title, year, author);  //call LibraryItem constructor for common fields
        this.pageCount = pageCount;  //initialize pageCount specific to Book
    }

    //Returns the number of pages in the book (getter method)
    public int getPageCount() {
        return pageCount;
    }

    //Returns a string representation of the book
    @Override
    public String toString() {
        return "Book: " + title + " by " + author + " (" + year + ") - " + pageCount + " pages";
    }

    //This method will be called readBook, and will take no arguments and return nothing (void).
    public void readBook() {
        System.out.println("Reading " + title + " by " + author + "...");
        System.out.println("Done!");
    }
}
