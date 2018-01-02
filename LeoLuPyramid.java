/*Creator: Leo LUJIAYU Instructor: Mr.Daniel Date: Sept 27th, 2017
This program prints * in different geometric order(half pyramid and pyramid)
 */
package javaapplication9;

/**
 *
 * @author leolu
 */
import java.util.Scanner;
public class LeoLuPyramid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner layer=new Scanner(System.in);
        System.out.print("enter the number of layers=");
        int b=layer.nextInt();
        
        
        System.out.println("");
        int d=1;
        while(d<=b){
            
            { int e=1;
            while(e<=d){
                System.out.print("*");
                e++;
            }
        }
            System.out.println("");
            d++;
        }
        
        System.out.println("");
        int a=1;
        while(a<=b){
            {int c=1;
            while(c<=(a*2-1)){
                System.out.print("*");
                c++;
            }
            }
            System.out.println("");
            a++;
        }
        
        System.out.println("");
         
        System.out.println("");
        int x=1;
        while(x<=b){
            int z=1;
            while(z<=(b-x))
            
            {   System.out.print(" ");
                 z++;}
                
                int y=1;
            while(y<=(x*2-1)){
                System.out.print("*");
                y++;
               
            }
            
            
            
            System.out.println("");
            x++;
        }
            
        
        
        
        
        
        
    }
    
}
