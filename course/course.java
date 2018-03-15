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
public class course {
    private String coursetitle;
    private int maxstudent;
    private int numberoflessons;
    
    private assessment courseassessment;
    private lesson[] lesson=new lesson[numberoflessons];
     
    
       public course(String CourseT, int MaxStu,int NumOfLes){
        coursetitle=CourseT;
        maxstudent=MaxStu;
        numberoflessons=NumOfLes;
    } 

    public course() {
       
    }
    
  
       public void addlessons(String lessonT, int time, boolean rlab){
       
       
       for(int i=0;i<lesson.length;i++) {
			if(lesson[i]==null) {
				lesson[i]= new lesson(lessonT,time,rlab);
				break;
			}
		}

       }
       
       
        public void addassessment(String AT, int MaxM){
        assessment d = new assessment(AT, MaxM);
        
    }
         public void printdetail(){
        
        System.out.println("Course title: "+ coursetitle);
        System.out.println("Maximum number of students: "+maxstudent);
        System.out.println("Number of lessons: "+numberoflessons);
        for(int i=0;i<lesson.length;i++) {
			if(lesson[i]!=null) {
			System.out.println("Lesson "+(i+1));
			lesson[i].printdetail();
			}
	}
        courseassessment.printdetail();
        
    }
    
}
