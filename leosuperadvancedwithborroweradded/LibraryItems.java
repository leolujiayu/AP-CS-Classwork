/*Developer: Leo LUJIAYU Instructor: Mr.Daniel Date: March 12th, 2018 
This program is a simulation of a library in which uses the knowledge of
inheritance and polymorphism
It is composed of a superclass items and subclasses cds and books.
This is superclass item.
 */
package leosuperadvancedwithborroweradded;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 *
 * @author leolu
 */
public class LibraryItems {
      
    
    //characteristics
    private String itemtitle;
    private String itemauthor;
    private int itemID;
    boolean itemloan;
    private Date date;
    Date itemduedate;
    private int borrowerID;
    
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

		itemtitle=title;
		itemauthor=author;
		itemID=id;
		itemloan=loan;
		itemduedate=duedate;
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
      
    //print item details
	public void printDetails() {
		System.out.println("Title: " + getitemtitle());
		System.out.println("Creator: " + getitemauthor());
		System.out.println("Item Id: # " + getitemid());

		if (getitemloan()) {
			System.out.println(getitemtitle() + " is on loan ");
                        System.out.println("Due Date: "+itemduedate);
			System.out.println("Borrower ID: "+borrowerID);
		} else
			System.out.println(getitemtitle() + " is not on loan ");

		System.out.println(getitemduedate());
	}
        
        private static Date Dateaddition(Date date, int days) {
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(date);
		calendar.add(Calendar.DATE,days);
		return calendar.getTime();
	}
        
        // borrow function
	public void BorrowItem(Borrower a) {
		this.itemloan=true;
		Date today=new Date();
		itemduedate=Dateaddition(today, 20);
		a.list.add(itemtitle);
		borrowerID=a.bID;
		a.updateOnloan();
	}
	// return item function
	public void ReturnItem(Borrower a) {
                a.list.remove(itemtitle);
		this.itemloan=false;
                Date today=new Date();
                borrowerID=a.bID;
                a.updateOnloan();
                itemduedate=today;
	}
		
		
	}


