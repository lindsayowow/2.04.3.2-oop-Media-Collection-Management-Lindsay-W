//The Movie class is a subclass of the LibraryItem class and should contain
// the following additional protected fields:

//Property	Type	Description
//durationInMinutes	int	The duration of the movie in minutes

//You should also include an accessor method for the durationInMinutes field:

//Method	Arguments	Return Type	Description
//getDurationInMinutes	None	int	Returns the duration of the movie in minutes
// (getter method)

//You will also need to implement a constructor that accepts the same arguments as the
// LibraryItem constructor, as well as an additional argument for the durationInMinutes
// field. Remember to call the superclass constructor to initialize the fields of the
// LibraryItem class, using the super keyword.

//Finally, you will need to override the toString method to return a string representation
// of the Movie object. The string

//You should override the toString method to return a string representation of the
// Movie object in the following format:
//Movie: <title> by <author> (<year>) - <durationInMinutes> minutes

//Method	Arguments	Return Type	Description
//Movie	title (String), author (String), year (int), durationInMinutes (int)	None	Constructor that initializes the fields of the class
//toString	None	String	Returns a string representation of the movie

package org.example;

public class Movie extends LibraryItem{
    protected int durationInMinutes;

    public Movie() {
        super ("", "", 0);
        this.durationInMinutes = 0;
    }

    public Movie(String title, String author, int year, int durationInMinutes) {
        super (title, author, year);
        this.durationInMinutes = durationInMinutes;
    }

    public Movie(String title, String author, int year) {
        super (title, author, year);
        this.durationInMinutes = 0;
    }

    public int getDurationInMinutes() {
        return this.durationInMinutes;
    }

    public String toString() {
        return "Movie: "+ this.title + " by " + this.author + " (" + this.year + ") - " + this.durationInMinutes + " minutes";
    }

}
