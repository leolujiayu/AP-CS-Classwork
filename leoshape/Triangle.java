/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leoshape;

/**
 *
 * @author leolu
 */
public class Triangle extends Superclassshape {
    private double a;
    private double b;
    private double c;
     
    public Triangle(String tname, double A, double B, double C){
       super(tname);
       a=A;
       b=B;
       c=C;
    }
    public double getarea(){
    double x= 0.5*(a+b+c);
    double areaa= Math.sqrt(x*(x-a)*(x-b)*(x-c));
    return areaa;
    }
    public double getperimeter(){
    return a+b+c;
    
    }
    public void printdetail(){
    super.printdetail();
    System.out.println("Area is "+getarea());
    System.out.println("Perimeter is "+getperimeter());
    
    }
    
}
