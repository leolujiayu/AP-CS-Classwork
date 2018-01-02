/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectleo;

import java.util.Scanner;

/**
 *
 * @author leolu
 */
public class college {
    
    private double gpa;
    private int sat;
    private int act;
    
    public college(double gpa, int sat, int act){
        this.gpa=gpa;
        this.sat=sat;
        this.act=act;
    }
    
   
    public void compareGPA(){
         Scanner input=new Scanner(System.in);
        double gpas=input.nextDouble();
         if(this.gpa<=gpas){
         System.out.println("You're GPA has met the requirement");
         System.out.println("So you've passed the grades requirement");
    System.out.println("Did you take SAT or ACT? please enter sat or act");
    Scanner input3=new Scanner(System.in);
    String answer=input3.nextLine();
    if(answer.compareToIgnoreCase("sat")==0){
        System.out.println("enter your score");
         Scanner input5=new Scanner(System.in);
         int yoursat=input5.nextInt();
        
        if(this.sat<=yoursat){
         System.out.println("You're SAT score has met the requirement");
         System.out.println("Great!");
         //
         }
         else
             System.out.println("Sorry, You need a higher SAT score");
    }
    else if(answer.compareToIgnoreCase("ACT")==0){
        System.out.println("enter your score");
        Scanner input4=new Scanner(System.in);
         int youract=input4.nextInt();
        if(this.act<=youract){
         System.out.println("You're ACT score has met the requirement");
         System.out.println("Great!");
         //
         }
         else
             System.out.println("Sorry, You need a higher ACT score");
    }
    
    
    
         }
         else
             System.out.println("Sorry, You need a higher GPA");
    }
    
    
}
