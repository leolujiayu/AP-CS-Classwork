/*Developer: Leo LUJIAYU Instructor: Mr.Daniel Date: Oct, 22nd, 2017
This program lets the user input the number of time that he or she wants"I Miss You"
to appear and finally print n times of that with a "Love, me" at the end
 */
package leoforgetmenot;

/**
 *
 * @author leolu
 */
import java.util.Scanner;
public class LeoForgetmenot {

    /**
     * @param args the command line arguments
     */
    public static void Forgetmenot(int n){
      System.out.println("I Miss You");
      
      n--;
        if(n>=1){
            Forgetmenot(n);
        
        }
        else{
        System.out.println("Love, me");
        }
       
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter number n, which means printing I Miss You n time");
        int n=input.nextInt();
        Forgetmenot(n);
    }
    
}
