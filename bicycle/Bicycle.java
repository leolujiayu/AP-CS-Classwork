/*Developer: Leo LUJIAYU Instructor: Mr.Daniel Date Feb 28th, 2018 March 7th, 2018
This program simulates bicycles in which uses the knowledge of
inheritance and polymorphism
It is composed of a superclass bicycle and subclass mountain bicycles in which
they have the same characteristics as bicycle but one more characteristic: their 
type, or category in which they belong to, like corss country, trail, all mountain.
This is the bicycle superclass.
 */
package bicycle;

/**
 *
 * @author leolu
 */
public class Bicycle {
    private String name;
    private double massBicycle;
    // mass of the bicycle
    private int numofshifts;
    // number of shifts a bicycle can switch between
    private int numofseats;
    private double maxvelocity;
    // velocity is measured in km/h
    private boolean bell;
    // whether a bicycle has a bell 
    public Bicycle(){
        name=null;
    massBicycle=10;
        numofshifts=1;
        numofseats=1;
        maxvelocity=7;
        bell=true;
    
    }
    
    public Bicycle(String bname,double mass, int shift, int seats, double v, boolean b){
        name=bname;
        massBicycle=mass;
        numofshifts=shift;
        numofseats=seats;
        maxvelocity=v;
        bell=b;
        
        
    }
    public void run(double distance){
    double time=0;
    time=distance/maxvelocity;
    System.out.println("it should take at least "+time+" hours for the bicycle ("+this.getname()+") to arrive at its destination");
    
    
    }
    
    public void highway(){
        
    if(numofshifts>=3||bell==false){
    System.out.print("this bycicle ("+this.getname()+") cannot go on highway");}
    else
    System.out.print("this bycicle ("+this.getname()+") can go on highway");
    System.out.println();
    }
    
    public String getname(){
    return name;
    }
    
    public double getmass(){
    return massBicycle;
    }
    
    public void setmassmodify(double mass){
         massBicycle=mass;
    }
    
    public int getshift(){
    return numofshifts;}
    
    public void setshiftsmodify(int shifts){
    numofshifts=shifts;
    }
    
    
    public double getseats(){
    return numofseats;
    }
    
    public void setseatsmodify(int seats){
         numofseats=seats;
    }
    
    public double getvelocity(){
    return maxvelocity;}
    
    public void setvelocitymodify(double velocity){
    maxvelocity=velocity;
    
    }
    
    public void testbell(){
    if(bell==true){System.out.println("this bycicle ("+this.getname()+") has a bell");}
    else if(bell==false){System.out.println("this bicycle ("+this.getname()+") does not have a bell");}
    }
    
    public void setbell(){
    if(bell==false){bell=true;
    }
    }
    
    public void printDetails() {
        System.out.println();
    System.out.println("name: "+getname());
    System.out.println("mass: "+getmass()+" kg");
    System.out.println("number of seats: "+getseats());
    System.out.println("maximum velocity: "+getvelocity()+" km/h");
    testbell();
    
    
    }
    
}
