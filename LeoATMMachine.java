/*Creator(Developer): Leo LUJIAYU Instructor: Mr.Daniel Date: Sept 26th, 2017
This program is a simulation of an ATM machine that helps the user to proceed 
one of the four options(deposit, withdraw, check balance, and exit).
 */
package javaapplication5;

/**
 *
 * @author leolu
 */
import java.util.Scanner;
public class LeoATMMachine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double x=2500.25;
        
        Scanner input=new Scanner(System.in);
        System.out.println("welcome! Enter the number for your transaction");
        System.out.println("withdraw cash please enter 1");
        System.out.println("make a deposit please enter 2");
        System.out.println("check your balance please enter 3");
        System.out.println("exit please enter 4");
        int a=input.nextInt();
        if(a==1){System.out.println("withdraw cash");
            
        System.out.println("how much would you like to withdraw?");
        double b=input.nextDouble();
        if (b<=(x)){System.out.println("cash withdrawn");
       
        }
        else{System.out.println("not enough cash in your account");}
        
        }
        else if (a==2){System.out.println("make a deposit");
        double c=input.nextDouble();
     
        System.out.println("deposit made");
        }
        else if (a==3){System.out.println("check your balance");
        System.out.println("cash in your account=$2500.25");
        }
        else if (a==4){System.out.println("exit");}
        else {System.out.println("error");}
        
        
        
        
        
    }
    
}
