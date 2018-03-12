/*Developer: Leo LUJIAYU Instructor: Mr.Daniel Date: March 12th, 2018 
This program is a simulation of a library in which uses the knowledge of
inheritance and polymorphism
It is composed of a superclass items and subclasses cds and books.
This is Borrower class which simulates a borrower.
 */
package leosuperadvancedwithborroweradded;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 *
 * @author leolu
 */
public class Borrower {
    
	public ArrayList list = new ArrayList();
        
        int bID;
	int Onloan;
        String bName;
	String email;
	
        
	public Borrower(String name, String mail, int id) {
            bName=name;
            email=mail;
            bID=id;
            Onloan=0;	
	}
	
	public void getBName() {
            System.out.println("Borrower Name: "+bName);
	}
	
	public void getEmail() {
            System.out.println("Email Address: "+email);
	}
	
	public void getBID() {
            System.out.println("Borrowr ID: "+bID);
	}
	
	public void getOnloan() {
            System.out.println(Onloan);
	}
	
	public void updateOnloan() {
            Onloan=Onloan+1;
	}
	
	public void printDetails() {
            System.out.println("Books borrowed: ");
            for(int i=0;i<list.size();i++) {
            System.out.println(list.get(i));
	}
	}

}
