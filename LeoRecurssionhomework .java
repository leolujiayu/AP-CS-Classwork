/*Developer: Leo LUJIAYU Instructor: Mr.Daniel Date: Oct 24th, 2017
This program performs functions that include factorial, fibonacci sequence, 
finding the number of zeroes, and converting the number into strings.
 */
package javaapplication25;

/**
 *
 * @author leolu
 */
import java.util.Scanner;
public class LeoRecurssionhomework {

    /**
     * @param args the command line arguments
     */
    public static int factorial(int a){
        
        
        if(a==1)
         return 1;   
        
        
        
        return factorial(a-1)*a;
    
    }
    public static int fibonacci(int b){
          if(b==1)
              return 0;
          else if(b==2)
              return 1;
          else
          return fibonacci(b-1)+fibonacci(b-2);
          
    
    }
    public static int zero(int c){
        
        
    if(c>0&c<10)
        return 0;
    else if(c==0)
        return 1;
    else if (c%10==0)
        return zero(c/10)+1;
    else 
        return zero(c/10);
    }
    public static String num (int a){
    
        if(a==0)
            return "";
        else if(a%10==0)
            return num(a/10)+"Zero ";
        else if(a%10==1)
            return num(a/10)+"One ";
        else if(a%10==2)
            return num(a/10)+"Two ";
        else if(a%10==3)
            return num(a/10)+"Three ";
        else if(a%10==4)
            return num(a/10)+"Four ";
        else if(a%10==5)
            return num(a/10)+"Five ";
        else if(a%10==6)
            return num(a/10)+"Six ";
        else if(a%10==7)
            return num(a/10)+"Seven ";
        else if(a%10==8)
            return num(a/10)+"Eight ";
        else 
            return num(a/10)+"Nine ";
       
        
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("factorial");
        int a=input.nextInt();
        factorial(a);
        System.out.println("factorial is equal to "+factorial(a));
        System.out.println("fibonacci");
        int x=input.nextInt();
        System.out.println("the "+x+"th term is "+fibonacci(x));
        
        System.out.println("zeroes");
        int b=input.nextInt();
        System.out.println("number of zeroes "+zero(b));
        
        System.out.println("input number to convert to string");
        int c=input.nextInt();
        System.out.println("string= "+num(c));
    }
    
}
