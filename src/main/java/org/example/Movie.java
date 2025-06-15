package org.example;

public class Movie extends LibraryItem {
    protected int durationInMinutes; //The duration of the movie in minutes

    //Constructor that initializes the fields of the class
    public Movie(String title, int year, String author, int durationInMinutes) {
        super(title, year, author);
        this.durationInMinutes = durationInMinutes;
    }

    //Returns the duration of the movie in minutes (getter method)
    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    //Returns a string representation of the movie
    @Override
    public String toString() {
        return "Movie: " + title + " by " + author + " (" + year + ") - " + durationInMinutes + " minutes";
    }
}
