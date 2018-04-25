/*Developer: Lu Jiayu Instructor: Mr.Daniel Date April 25th
Exam2017
 */
package exam2017;

/**
 *
 * @author leolu
 */
public class Phrase {
    private String currentPhrase;
    public Phrase(String p){
    currentPhrase = p;
    }
    public int findNthOccurence(String s, int n){
    return 1;
    }
    public void replaceNthOccurrence(String str, int n, String repl){
      int a=findNthOccurence(str,n);
      if(a!=-1){
          currentPhrase=currentPhrase.substring(0,a)+repl+currentPhrase.substring(n+str.length());
          
      }
      
        
    }
    public int findLastOccurrence(String str){
    for(int i=1; findNthOccurence(str,n)!=-1;){
    if(n==1){return -1;
    }
    else{return findNthOccurence(str,n-1);}
    }
    
    }
    public String toString(){
        return currentPhrase;
    } 
    
    
}
