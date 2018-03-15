/*Developer: Leo LUJIAYU Instructor: Mr.Daniel Date March 15th
this program simulates course record. with classes lesson and assessment
 */
package course;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author leolu
 */
    public class leocourse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        course k=new course("Krugman's Economics",50, 20);
        
        k.addassessment("Pre-read", 100);
        k.addlessons("GameTheory", 80, false);
        k.addlessons("International Trade", 80, false);
        k.printdetail();
        
    }
    
}
