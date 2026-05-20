//The Album class is a subclass of the LibraryItem class and should contain
// the following additional protected fields:

//Property	Type	Description
//trackCount	int	The number of tracks on the album

//You should also include an accessor method for the trackCount field:

//Method	Arguments	Return Type	Description
//getTrackCount	None	int	Returns the number of tracks on the album (getter method)

//You will also need to implement a constructor that accepts the same arguments as
// the LibraryItem constructor, as well as an additional argument for the trackCount
// field. Remember to call the superclass constructor to initialize the fields of the
// LibraryItem class, using the super keyword.

//Finally, you will need to override the toString method to return a string
// representation of the Album object. The string

//You should override the toString method to return a string representation of the
// Album object in the following format:
//Album: <title> by <author> (<year>) - <trackCount> tracks

//Method	Arguments	Return Type	Description
//Album	title (String), author (String), year (int), trackCount (int)	None	Constructor that initializes the fields of the class
//toString	None	String	Returns a string representation of the album

package org.example;

public class Album extends LibraryItem {
    protected int trackCount;

    public Album() {
        super ("", "", 0);
        this.trackCount = 0;
    }

    public Album(String title, String author, int year, int trackCount) {
        super (title, author, year);
        this.trackCount = trackCount;
    }

    public Album(String title, String author, int year) {
        super (title, author, year);
        this.trackCount = 0;
    }

    public int getTrackCount() {
        return this.trackCount;
    }

    public String toString() {
        return "Album: "+ this.title + " by " + this.author + " (" + this.year + ") - " + this.trackCount + " tracks";
    }

}
