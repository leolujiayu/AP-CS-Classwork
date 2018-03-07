/*Developer: Leo LUJIAYU Instructor: Mr.Daniel Date Feb 28th, 2018 March 7th, 2018
This program simulates bicycles in which uses the knowledge of
inheritance and polymorphism
It is composed of a superclass bicycle and subclass mountain bicycles in which
they have the same characteristics as bicycle but one more characteristic: their 
type, or category in which they belong to, like corss country, trail, all mountain.

 */
package bicycle;

/**
 *
 * @author leolu
 */
public class LeoBicycle {

    /**
     * @param args the command line arguments
     */
    
    
     public static void main(String[] args) {
        Bicycle ferrari=new Bicycle("ferrari",10, 2, 2, 8, true);
        Bicycle Giant=new Bicycle("Giant",13, 3, 1,12,false);
        Bicycle EMMELLE=new MountainBike("Emmelle", 8, 3, 1, 15, false, "cross country");
        Bicycle merida=new MountainBike("Merida", 9, 3, 1, 15, false, "trail");
        
        Bicycle ofo;
        Bicycle mobike;
        System.out.println("ferrari's mass is "+ferrari.getmass()+" kg");
        ferrari.setmassmodify(8);
        System.out.println("ferrari's mass is modified to"+ferrari.getmass()+" kg");
        ferrari.setbell();
        ferrari.testbell();
        Giant.testbell();
        Giant.setbell();
        Giant.testbell();
       Giant.highway();
       ferrari.highway();
       Giant.run(10);
       System.out.println();
       
       ferrari.printDetails();
       
       Giant.printDetails();
       
       merida.printDetails();
       System.out.println();
       merida.highway();
       System.out.println();
       EMMELLE.testbell();
       EMMELLE.printDetails();
    }
    
    
}
