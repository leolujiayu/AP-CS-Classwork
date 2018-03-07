/*Developer: Leo LUJIAYU Instructor: Mr.Daniel Date Feb 28th, 2018 March 7th, 2018
This program simulates bicycles in which uses the knowledge of
inheritance and polymorphism
It is composed of a superclass bicycle and subclass mountain bicycles in which
they have the same characteristics as bicycle but one more characteristic: their 
type, or category in which they belong to, like corss country, trail, all mountain.
This is the mountain bicycle subclass.
 */
package bicycle;

/**
 *
 * @author leolu
 */
public class MountainBike extends Bicycle {
       private String category;

    public MountainBike(String bname, double mass, int shift, int seats, double v, boolean b,String category) {
        super(bname,mass, shift, seats, v, b);
        this.category = category;
        
    
        
    }
    public void run(double distance){
    super.run(distance);
    }
    public void highway(){
    super.highway();
    }
    public void setmassmodify(){
    super.setmassmodify(8);
    }
    public void setbell(){
    super.setbell();
    }
    public void printDetails(){
    super.printDetails();
    System.out.println("this Mountain Bicycle is in the category of: "+this.category);
    }
       
}
