/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingbat;

/**
 *
 * @author leolu
 */
public class Logic2 {
    public static boolean makeBricks(int small, int big, int goal) {
    if((small+big*5)<goal){
    return false;
    }
    else if(small<(goal%5)){
    return false;
    
    }
    return true;
  
  
  
}

}
