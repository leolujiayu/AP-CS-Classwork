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
public class assessment  {
    assessment courseassessment;
    private String assessmenttitle;
    private int maxmarks;
    
    public assessment(String title, int mark){
    assessmenttitle=title;
    maxmarks=mark;
    }

    
    public void printdetail(){
    System.out.println("assesment title: "+assessmenttitle);
    System.out.println("maximum mark: "+maxmarks);
    }
}
