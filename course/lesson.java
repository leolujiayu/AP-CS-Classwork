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
public class lesson {
    assessment assessment;
    private String lessontitle;
    private int durationminutes;
    private boolean requirelab;
    
    
    
    public lesson(String title, int t, boolean lab){
        
    lessontitle=title;
    durationminutes=t;
    requirelab=lab;
    
    }      
    public assessment getAssessment(){
    return assessment;
}
    
    
    public void printdetail(){
    System.out.println("title: "+lessontitle);
    System.out.println("duration time in minutes: "+durationminutes);
    System.out.println("require lab: "+requirelab);
    }
}
