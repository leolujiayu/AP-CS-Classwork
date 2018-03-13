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
public abstract class Superclassshape {
        private String sname;
        public Superclassshape(String name){
           sname=name;
           
        }
        
        public abstract double getarea();
        public abstract double getperimeter();
        
        public String getname(){
        return sname;
        
        
        }
        
        public void printdetail(){
        System.out.println();
        System.out.println("Shape is a "+getname());
        
        }
        
        
    
    
    
    
    
}
