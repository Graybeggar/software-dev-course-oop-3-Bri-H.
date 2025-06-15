package org.example;

public class LibraryItem { // declares the LibraryItem class.
    // fields (variables) that store the item’s information.
    protected String title;
    protected int year;
    protected String author;

    //	Constructor that initializes the fields of the class
    public LibraryItem(String title, int year, String author) {
        this.title = title;
        this.year = year;
        this.author = author;
    }

    public String getTitle() {
        return title; //Returns the title of the item (getter method)
    }

    public int getYear() {
        return year; //Returns the year the item was released (getter method)
    }

    public String getAuthor() {
        return author; //Returns the author of the item (getter method)
    }

    //Returns a string representation of the item
    @Override
    public String toString() {
        return "Item: " + title + " by " + author + " (" + year + ")";
    }
}
