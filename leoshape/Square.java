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
public class Square extends Superclassshape {
    private double length;
    public Square(String name, double len){
    super(name);
    length=len;
    }
    public double getlength(){
    return length;}
    public double getarea(){
    return length*length;
    }
    public double getperimeter(){
    return length*4;
    }
    public void setlength(double len){
    length=len;
    }
    public void printdetail(){
    super.printdetail();
    System.out.println("Area is "+getarea());
    System.out.println("Perimeter is "+getperimeter());
    
    }
    public boolean equals(Square obj){
            return (this.length==obj.getlength());
        
        }
}
