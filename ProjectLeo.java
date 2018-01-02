/*
Developer: Leo LUJIAYU Instructor: Mr.Daniel  Date: December 2017
This program helps the user to see if he or she can be eligible to get into 
the intended ivy league school he or she wishes to get into
 */
package projectleo;
import java.util.Scanner;
/**
 *
 * @author leolu
 */
public class ProjectLeo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        college Harvard=new college(3.9,1560,35);
        college Columbia=new college(3.8, 1540,33);
        college Cornell=new college(3.6, 1480,32);
        college Penn=new college(3.7, 1510,32);
        college Princeton=new college(3.8, 1540,33);
        college Yale=new college(3.8, 1550,33);
        college Brown=new college(3.7, 1530,33);
        college Dartmouth=new college(3.7,1520,33);
        
        System.out.println("#########@@@@@@@@@@@@@@@##############");
        System.out.println("Thanks for using Ivy match");
        for(int i=0; i<8;i++)
        {        
            System.out.println("which of the following IVY league schools do you intend to apply for:");
        System.out.println("   a. Harvard University");
        System.out.println("   b. Columbia University");
        System.out.println("   c. Cornell University");
        System.out.println("   d. University of Pennsylvania");
        System.out.println("   e. Dartmouth College");
        System.out.println("   f. Brown University");
        System.out.println("   g. Yale University");
        System.out.println("   h. Princeton university");
        
        Scanner input=new Scanner(System.in);
        String mecollege=input.nextLine();
        if(mecollege.compareToIgnoreCase("a")==0){
         
        System.out.println("Please enter your GPA");
        Harvard.compareGPA();}
        else if(mecollege.compareToIgnoreCase("b")==0){
         
        System.out.println("Please enter your GPA");
        Columbia.compareGPA();}
        else if(mecollege.compareToIgnoreCase("c")==0){
         
        System.out.println("Please enter your GPA");
        Cornell.compareGPA();}
        else if(mecollege.compareToIgnoreCase("d")==0){
         
        System.out.println("Please enter your GPA");
        Penn.compareGPA();}
        else if(mecollege.compareToIgnoreCase("e")==0){
         
        System.out.println("Please enter your GPA");
        Dartmouth.compareGPA();}
        else if(mecollege.compareToIgnoreCase("f")==0){
         
        System.out.println("Please enter your GPA");
        Brown.compareGPA();}
        else if(mecollege.compareToIgnoreCase("g")==0){
         
        System.out.println("Please enter your GPA");
        Yale.compareGPA();}
        else if(mecollege.compareToIgnoreCase("h")==0){
         
        System.out.println("Please enter your GPA");
        Princeton.compareGPA();}
        
        System.out.println();
        System.out.println("===============================");
        System.out.println("Did you find the one you like?");
        Scanner input2=new Scanner(System.in);
        String a=input.nextLine();
        if(a.compareToIgnoreCase("yes")==0){
        i+=8;
        System.out.println("***************************************");
        System.out.println("congrats, START TO APPLY");}
        else{
            System.out.println();
        System.out.println("if you didn't find the one you like or mathces you, then please do try other ones");}
        
        
    }}
    
}
