package org.example;

public class Album extends LibraryItem {
    protected int trackCount; //The number of tracks on the album

    //Constructor that initializes the fields of the class
    public Album(String title, int year, String author, int trackCount) {
        super(title, year, author);
        this.trackCount = trackCount;
    }

    //Returns the number of tracks on the album (getter method)
    public int getTrackCount() {
        return trackCount;
    }

    //Returns a string representation of the album
    @Override
    public String toString() {
        return "Album: " + title + " by " + author + " (" + year + ") - " + trackCount + " tracks";
    }
}
