/*Creator: Leo LUJIAYU  Instructor: Mr.Daniel Date: Sept 28th, 2017
This program helps the user to input student number, students' assignment scores
and calculate the average score for each students.
 */
package javaapplication12;

/**
 *
 * @author leolu
 */
import java.util.Scanner;
public class LeoInputScores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("enter the number of students ");
        int s=input.nextInt();
        System.out.print("enter the number of assignments ");
        int a=input.nextInt();
        int b=1;
        while(b<=s){
        System.out.print("student "+b);
        int c=1;
        double sumscore=0;
        while(c<=a){
        System.out.print(" enter the assignment "+c+" score ");
        double score=input.nextDouble();
        c++;
        
        sumscore=sumscore+score;
        
                }
        System.out.println("average score "+sumscore/s);
        
        b++;
        
        }
        
    }
    
}
