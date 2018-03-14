/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leoshape;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author leolu
 */
public class LeoShape {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Square m=new Square("square m",5);
        Square n=new Square("square n",5);
        Circle k=new Circle("Circle k", 3);
        Superclassshape u=new Triangle("triangle u", 3,4,5);
        m.printdetail();
        n.printdetail();
        k.printdetail();
        u.printdetail();
        System.out.println();
        System.out.println("Is m the same shape and size as n?");
        System.out.println(m.equals(n));
        
        
        List a=new ArrayList();
        a.add(new Circle("one",6));
        a.add(new Circle("two",2));
        a.add(new Circle("three",3));
        Collections.sort(a);
        System.out.println(a);
    }
    
}
