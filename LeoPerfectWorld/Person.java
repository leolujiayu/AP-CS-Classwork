/**
 *
 * @author leolu
 * This is the Person class for my project
 */
package LeoPerfectWorld;

/**
 *
 * @author leolu
 */
public class Person {
    private int age;
    
    private String language;
    
    public Person(String language){
    this.language=language;
    this.age=17;
    
    }
    
   
    
    
    
    public void grow(int howmanyyears){
    this.age+=howmanyyears;
    System.out.println("As "+howmanyyears+" years gone by");
    }
    
    
    
        
        
        
        
        
        public int getAge(){
         return this.age;
        }
        public String GetGreetings(){
            if(this.language.equals("English")&&this.age<18)
        return "what's up man"+" I am "+this.age+" years old";
        else if(this.language.equals("English")&&this.age==18)
            return "yo"+" I am "+this.age;
        else if(this.language.equals("English")&&this.age>18)
            return "hello, I am already "+this.age+" years old";
        else if(this.language.equals("Chinese"))
        return "你好， 我已经 "+this.age+" 岁了";
        else if(this.language.equals("French"))
        return "Bonjour";   
       else
            return "";
        
        }
        public String Newguy(){
        return "Hey Look, a NEW GUY";
        
        }
        
        
        public String Originality(){
        if(this.language.equals("Chinese")){
        return "I am from CHINA";}
        else if(this.language.equals("English")){
        return "I am from CANADA";}
        else if(this.language.equals("French")){
        return "I am from CANADA";}
        else return "";
        
        
        }
        
        public String ASK(){
        return "WHERE do you come from?";
        }
}
