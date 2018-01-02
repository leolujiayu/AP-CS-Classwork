/*Creator: Leo LUJIAYU Instructor: Mr.Daniel Date: Sept 21st,2017
This program includes eight math problems in the pdf file and the user can input
 the values of the vairables to get the answers to the eight problems.
 */
package javaapplication3;

import java.util.Scanner;


/**
 *
 * @author leolu
 */
public class LeoLuMathProblems {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("x= ");
        double x=input.nextDouble();
        
        
        
       
        double a=Math.pow(x,2)+5*x-7;
        System.out.println("first question answer is"+a);
        double a2=10*Math.pow(x,3)+5*Math.pow(x,2)+100-x;
        System.out.println("second question answer is"+a2);
        double a3=Math.pow(x,0.2)+2*Math.pow(x,0.5);
        System.out.println("third question answer is"+a3);
        
        System.out.print("x1=");
        double x1=input.nextDouble();
        System.out.print("y1=");
        double y1=input.nextDouble();
        System.out.print("x2=");
        double x2=input.nextDouble();
        System.out.print("y2=");
        double y2=input.nextDouble();
        double b1=Math.pow((x1-x2),2);
        double b2=Math.pow((y1-y2),2);
        double a4=Math.pow((b1+b2),0.5);
        System.out.println("fourth question answer is"+a4);
        
        System.out.print("A=");
        double A=input.nextDouble();
        System.out.print("B=");
        double B=input.nextDouble();
        double c1=Math.pow(A,2);
        double c2=Math.pow(B,2);
        double a5=Math.sqrt(c1+c2);
        System.out.println("fiftn question answer is"+a5);
        
        System.out.print("y=");
        double y=input.nextDouble();
        double a6=(Math.pow(x,2)+Math.pow(y,2))/(7*x);
        System.out.println("sixth question answer is"+a6);
        double d1=Math.pow(x,2)+3*Math.pow(x,3);
        double d2=d1/(2*x*y);
      
        double a7=Math.sqrt(d2);
        System.out.println("seventh question answer is"+a7);
        double a8=2*x+Math.sqrt(x/2);
        System.out.println("eighth question answer is"+a8);
        
        
        
        
    }
    
}
