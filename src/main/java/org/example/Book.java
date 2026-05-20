//The Book class is a subclass of the LibraryItem class and should contain the following
// additional protected fields:

//Property	Type	Description
//pageCount	int	The number of pages in the book
//You should also include an accessor method for the pageCount field:

//Method	Arguments	Return Type	Description
//getPageCount	None	int	Returns the number of pages in the book (getter method)
//You will also need to implement a constructor that accepts the same arguments as the
// LibraryItem constructor, as well as an additional argument for the pageCount field.
// Remember to call the superclass constructor to initialize the fields of the LibraryItem
// class, using the super keyword.

//Finally, you will need to override the toString method to return a string representation
// of the Book object. The string

//You should override the toString method to return a string representation of the Book
// object in the following format:
//        "Book: <title> by <author> (<year>) - <pageCount> pages"

//Method	Arguments	Return Type	Description
//Book	title (String), author (String), year (int), pageCount (int)	None	Constructor that initializes the fields of the class
//toString	None	String	Returns a string representation of the book

//In the book class, we are going to add one more method specific to Books only.
// This method will be called readBook, and will take no arguments and return nothing
// (void). The method should simply print out the following message to the console:

//Reading <title> by <author>...
//Done!

package org.example;

public class Book extends LibraryItem{
    protected int pageCount;

    public Book() {
        super ("", "", 0);
        this.pageCount = 0;
    }

    public Book(String title, String author, int year, int pageCount) {
        super (title, author, year);
        this.pageCount = pageCount;
    }

    public Book(String title, String author, int year) {
        super (title, author, year);
        this.pageCount = 0;
    }

    public int getPageCount() {
        return this.pageCount;
    }

    public String toString() {
        return "Book: "+ this.title + " by " + this.author + " (" + this.year + ") - " + this.pageCount + " pages";
    }

   public void readBook() {
      System.out.println("Reading " + this.title + " by " + this.author + "...");
      System.out.println("Done!");
   }
}
