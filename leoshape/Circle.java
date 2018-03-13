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
public class Circle extends Superclassshape {
        private double radius;
        
        public Circle(String name, double r){
            super(name);
            radius=r;

      }
        public double getarea(){
        double a=radius*radius*Math.PI;
        return a;
        }
        public double getperimeter(){
        double p=radius*2*Math.PI;
        return p;
        
        }
        public void printdetail(){
        super.printdetail();
        System.out.println("The area is "+getarea());
        System.out.println("The perimeter is "+getperimeter());
        
        }
        public double getradius(){
        return radius;
        }
        public void setradius(double r){
        radius=r;
        
        }
        public boolean equals(Circle obj){
            return (this.radius==obj.getradius());
        
        }
}
