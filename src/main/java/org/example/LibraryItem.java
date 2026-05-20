//The first class that you will need to create is the LibraryItem class.
// This class will be the base class for the Album, Movie, and Book classes,
// and need to contain the following protected fields:

//Property	Type	Description
//title	String	The title of the item
//author	String	The author of the item
//year	int	The year the item was released

//The LibraryItem class should also contain the following methods:

//Method	Arguments	Return Type	Description
//LibraryItem	title (String), author (String), year (int)	None
// Constructor that initializes the fields of the class

//toString	None	String	Returns a string representation of the item

//getTitle	None	String	Returns the title of the item (getter method)
//
// getYear	None	int	Returns the year the item was released (getter method)
//
// getAuthor	None	String	Returns the author of the item (getter method)

//For your toString method, return a string formatted as follows:
//
//Item: <title> by <author> (<year>)

package org.example;

public class LibraryItem {
    protected String title;
    protected String author;
    protected int year;

    public LibraryItem(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public LibraryItem() {
        this.title = "";
        this.author = "";
        this.year = 0;
    }

    public String toString() {
         return "Item: "+ this.title + " by " + this.author + " (" + this.year + ")";
    }

    public String getTitle() {
        return this.title;
    }

    public int getYear() {
        return this.year;
    }

    public String getAuthor() {
        return this.author;
    }


}
