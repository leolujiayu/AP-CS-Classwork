/*Developer: Leo LUJIAYU Instructor: Mr.Daniel Date: March 12th, 2018 
This program is a simulation of a library in which uses the knowledge of
inheritance and polymorphism
It is composed of a superclass items and subclasses cds and books.
 */
package leosuperadvancedwithborroweradded;
import java.util.Scanner;
import java.util.Date;
import java.util.ArrayList;

/**
 *
 * @author leolu
 */
public class LeoLibrary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList BookList=new ArrayList();
	Book rfl=new Book("12 Rules for Life", "Jordan Peterson", 23, false, new Date(), false );
        rfl.printDetails();
        System.out.println();
        BookList.add(rfl);
        Book tkamb=new Book("To Kill A Mocking Bird", "Harper Lee", 18, false, new Date(), false );
        tkamb.printDetails();
        System.out.println();
        BookList.add(tkamb);
        CD ajfa=new CD("And Justice for all", "Metallica", 107, false, new Date(), "Metal");
        ajfa.printDetails();
        
        Borrower a=new Borrower("Leo","leo@yahoo.com",21);
        
        Scanner input=new Scanner(System.in);
        System.out.println();
        System.out.println("Please select from below");
        System.out.println("1. View book list.");
        System.out.println("2. View borrower.");
        
        int opt=input.nextInt();
        
        while(opt<=3) {
        	if(opt==1) {
       
       	for(int i=0;i<BookList.size();i++) {
        System.out.println(i+1+" ");
               ((LibraryItems) BookList.get(i)).printDetails(); 
                } System.out.println();
        System.out.println("Please select from below");
        	System.out.println("1. Borrow");
                System.out.println("2. Return");
                System.out.println("3. Exit");
       		int opt2=input.nextInt();
                
                
       	if(opt2==1) {
        System.out.println("Please enter the labled number of your selected book");
       int opt3=input.nextInt();
       if(((LibraryItems) BookList.get(opt3-1)).itemloan==false) {
       ((LibraryItems) BookList.get(opt3-1)).BorrowItem(a);
       System.out.println("Book Successfully Borrowed");
       System.out.println("Due Date: "+((LibraryItems) BookList.get(opt3-1)).itemduedate.toString());        				
       System.out.println();
        		}
        else {			
        System.out.println("book loaned out with due date: "+((LibraryItems) BookList.get(opt3-1)).itemduedate.toString());
        	
        System.out.println();
        			}
        		}
        
        else if(opt2==2){
            for(int i=0;i<BookList.size();i++) {
        System.out.println(i+1+" ");
               ((LibraryItems) BookList.get(i)).printDetails(); 
                } System.out.println();
        System.out.println("Please enter the labled number of your selected book");
       int optx=input.nextInt();
       if(((LibraryItems) BookList.get(optx-1)).itemloan==true) {
       ((LibraryItems) BookList.get(optx-1)).ReturnItem(a);
       System.out.println("Book Successfully Returned");
            				
       System.out.println();
        		}

        
        }
        
         System.out.println();
        System.out.println("Please select from below");
       	System.out.println("1. See the book list");
        System.out.println("2. Check the borrower information");
        System.out.println("3. Exit");
        opt=input.nextInt();
        }
        else if(opt==2){
        a.getBName();
        a.getBID();
        a.getEmail();
        a.printDetails();
        		 System.out.println();
        System.out.println("Please select from below");
        System.out.println("1. See the book list");
        System.out.println("2. Check the borrower information");
        System.out.println("3. Exit");
                        
        opt=input.nextInt();
        }
        }

         System.out.println();
        System.out.println("Thank you for using");
	}

    
}
