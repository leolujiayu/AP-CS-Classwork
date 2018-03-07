/*Developer: Leo LUJIAYU Instructor: Mr.Daniel Date: March 7th, 2018 
This program is a simulation of a library in which uses the knowledge of
inheritance and polymorphism
It is composed of a superclass items and subclasses cds and books.
 */
package leosuper;
import java.util.Date;
/**
 *
 * @author leolu
 */
public class LeoLibrary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	Book rfl = new Book("12 Rules for Life", "Jordan Peterson", 23, false, new Date(), false );
        rfl.printDetails();
        System.out.println();
        
        CD ajfa = new CD("And Justice for all", "Metallica", 107, false, new Date(), "Metal");
        ajfa.printDetails();
        
        

	}

    
}
