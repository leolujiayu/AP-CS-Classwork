/*Developer: Leo LUJIAYU Instructor: Mr.Daniel Date: March 7th, 2018 
This program is a simulation of a library in which uses the knowledge of
inheritance and polymorphism
It is composed of a superclass items and subclasses cds and books.
This is Book(subclass).
 */
package leosuper;
import java.util.Date;
/**
 *
 * @author leolu
 */
public class Book extends LibraryItems{
    private boolean isrequested;

	public Book(String Title, String Author, int Id, boolean Loan, Date DueDate,
			boolean isrequestedd) {
		super(Title, Author, Id, Loan, DueDate);

		isrequested = isrequestedd;

	}

	public void printDetails() {
		super.printDetails();
		if (isrequested) {
			System.out.println("sorry, please wait and come back later, book requested");

		} else
			System.out.println("great, book not requested, you are ok to go");
	}

}
