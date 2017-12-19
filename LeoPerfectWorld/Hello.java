/**
 *This is the main lass for my hello program
 * @author leolu
 * 
 */
package LeoPerfectWorld;

/**
 *
 * @author leolu
 */
public class Hello {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        /*Person Leo=new Person("English");
        Person Clarence=new Person("French");
        Person George=new Person("Chinese");
      
        George.grow(1);
      
        System.out.println(Leo.GetGreetings());
        System.out.println(Clarence.GetGreetings());
        System.out.println(George.GetGreetings());*/
       Person Adam=new Person("English");
       Person Nick=new Person("English");
       Animal dog=new Animal();
       Person Lee=new Person("Chinese");
       System.out.println("Adam: "+Adam.GetGreetings());
       System.out.println("Nick: "+Nick.GetGreetings());
       System.out.println(dog.Bark());
       Adam.grow(3);
       Nick.grow(2);
       System.out.println(dog.Tail());
       System.out.println("Adam: "+Adam.GetGreetings());
       System.out.println("Nick: "+Nick.GetGreetings());
       System.out.println("Adam: "+Adam.Newguy());
       System.out.println("Lee: "+Lee.GetGreetings());
       System.out.println("Nick: "+Nick.ASK());
       System.out.println("Lee: "+Lee.Originality());
       
       
        
    }
    
}
