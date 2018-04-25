/*Developer: Lu Jiayu Instructor: Mr.Daniel Date April 25th
Exam2017
 */
package exam2017;

/**
 *
 * @author leolu
 */
public class Position {
    public Position(int r, int c){}
    
     public static Position findPosition(int num, int[][] intArr){
     for(int i=0;i<intArr.length;i++){
     for(int j=0;j<intArr[0].length;j++){
     if(intArr[i][j]==num){
     Position answer=new Position(i,j);
     return answer;
     }
     
     }
     
     
     }
     return null;
     
     }
     public static Position[][] getSuccessorArray(int[][] intArr){
     Position[][] successor=new Position[intArr.length][intArr[0].length];
     for(int i=0;i<successor.length;i++){
     for(int j=0;j<successor[0].length;j++){
     successor[i][j]=findPosition(intArr[i][j]+1,intArr);
     
     }
     }
     return successor;
     }
}
