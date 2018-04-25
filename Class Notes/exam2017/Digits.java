/*Developer: Lu Jiayu Instructor: Mr.Daniel Date April 25th
Exam2017
 */
package exam2017;
import java.util.ArrayList;
/**
 *
 * @author leolu
 */
public class Digits {
    private ArrayList<Integer> digitList;
   // 1.a
public Digits(int num){
    ArrayList digitList=new ArrayList<Integer>();
    if(num!=0){
    while(num>0){
    int i=num%10;
    digitList.add(0,i);
    num=num/10;

}}
    else if(num==0){
    digitList.add(0,0);
}
}
  //1.b
public boolean isStrictlyIncreasing(){
    for(int i=0;i<digitList.size();i++){
    if(digitList.get(i).compareTo(digitList.get(i+1))>=0)
    {return false;}

}
return true;
   }
}
