/*Developer: Lu Jiayu Instructor: Mr.Daniel Date April 25th
Exam2017
 */
package exam2017;

/**
 *
 * @author leolu
 */
public interface StudyPractice {
    // 2
    public class MultPractice implements StudyPractice{
    private int first;
    private int second;
    
    public MultPractice(int a, int b){
    first=a;
    second=b;
    
    }
    public String getProblem(){
    return first+" TIMES "+second;
    }
    public void nextProblem(){
    second+=1;
    }
    
    
    
    }
}
