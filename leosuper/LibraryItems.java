/*Developer: Leo LUJIAYU Instructor: Mr.Daniel Date: March 7th, 2018 
This program is a simulation of a library in which uses the knowledge of
inheritance and polymorphism
It is composed of a superclass items and subclasses cds and books.
This is superclass item.
 */
package leosuper;
import java.util.Date;
/**
 *
 * @author leolu
 */
public class LibraryItems {
    //characteristics
    private String itemtitle;
    private String itemauthor;
    private int itemID;
    private boolean itemloan;
    private Date itemduedate;
    
    //constructor
    public LibraryItems(){
        itemtitle=null;
        itemauthor=null;
        itemID=0;
        itemloan=false;
        itemduedate=new Date();
    
    }
    
    //constructor
    public LibraryItems(String title, String author, int id, boolean loan, Date duedate) {

		itemtitle = title;
		itemauthor = author;
		itemID = id;
		itemloan = loan;
		itemduedate =duedate;
    }
    //get
    public String getitemtitle() {
		return itemtitle;
    }

	public String getitemauthor() {
		return itemauthor;
    }

	public int getitemid() {
		return itemID;
    }

	public boolean getitemloan() {
		return itemloan;
    }

	public Date getitemduedate() {
		return itemduedate;
    }
      
        
	public void printDetails() {
		System.out.println("Title: " + getitemtitle());
		System.out.println("Creator: " + getitemauthor());
		System.out.println("Item Id: # " + getitemid());

		if (getitemloan()) {
			System.out.println(getitemtitle() + " is on loan ");
		} else
			System.out.println(getitemtitle() + " is not on loan ");

		System.out.println(getitemduedate());
	}
}
