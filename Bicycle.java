/*Developer: Leo LUJIAYU Instructor: Mr.Daniel Date Feb 28th, 2018
This program simulates bicycles.
 */
package bicycle;

/**
 *
 * @author leolu
 */
public class Bicycle {

    /**
     * @param args the command line arguments
     */
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
    massBicycle=10;
        numofshifts=1;
        numofseats=1;
        maxvelocity=7;
        bell=true;
    
    }
    
    public Bicycle(double mass, int shift, int seats, double v, boolean b){
        
        massBicycle=mass;
        numofshifts=shift;
        numofseats=seats;
        maxvelocity=v;
        bell=b;
        
        
    }
    public void run(double distance, String name){
    double time=0;
    time=distance/maxvelocity;
    System.out.println("it should take at least "+time+" hours for the bicycle ("+name+") to arrive at its destination");
    
    
    }
    
    public void highway(String name){
        
    if(numofshifts>=3||bell==false){
    System.out.print("this bycicle ("+name+") cannot go on highway");}
    else
    System.out.print("this bycicle ("+name+") can go on highway");
    System.out.println();
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
    
    public void testbell(String name){
    if(bell==true){System.out.println("this bycicle ("+name+") has a bell");}
    else if(bell==false){System.out.println("this bicycle ("+name+") does not have a bell");}
    }
    
    public void setbell(){
    if(bell==false){bell=true;
    }
    }
    
     public static void main(String[] args) {
        Bicycle ferrari=new Bicycle(10, 2, 2, 8, true);
        Bicycle Giant=new Bicycle(13, 3, 1,12,false);
        Bicycle ofo;
        Bicycle mobike;
        System.out.println("ferrari's mass is "+ferrari.getmass()+" kg");
        ferrari.setmassmodify(8);
        System.out.println("ferrari's mass is modified to"+ferrari.getmass()+" kg");
        ferrari.setbell();
        ferrari.testbell("ferrari");
        Giant.testbell("Giant");
        Giant.setbell();
        Giant.testbell("Giant");
       Giant.highway("Giant");
       ferrari.highway("ferrari");
       ferrari.run(10, "Giant");
    }
    
    
}
