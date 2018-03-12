/*Developer: Leo LUJIAYU Instructor: Mr.Daniel Date: March 12th, 2018 
This program is a simulation of a library in which uses the knowledge of
inheritance and polymorphism
It is composed of a superclass items and subclasses cds and books.
This is CD(subclass).
 */
package leosuperadvancedwithborroweradded;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 *
 * @author leolu
 */
public class CD extends LibraryItems{
    
	private String genre;

	public CD(String Title, String Author, int Id, boolean Loan, Date DueDate,
			String Genre) {
		super(Title, Author, Id, Loan, DueDate);

		genre=Genre;
	}

	public void printDetails() {
		super.printDetails();

		System.out.println("It is " + genre);

	}
}
