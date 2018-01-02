/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ap;

/**
 *
 * @author leolu
 */
public class Codingbat {
    public static boolean scoresIncreasing(int[] scores) {
  int c=0;
  for(int i=0;i<scores.length-1;i++){
    if(scores[i]>scores[i+1]){c++;}
  }
  if(c>0)
  return false;
  else
  return true;
}
    public static boolean scores100(int[] scores) {
  int c=0;
  for(int i=0;i<scores.length-1;i++){
    if(scores[i+1]==100&&scores[i]==100){c++;}
  }
  if(c>0)
  return true;
  else
  return false;
}
 public static boolean scoresClump(int[] scores) {
  int c=0;
  for(int i=0; i<scores.length-2; i++){
    if(scores[i+2]-2<=scores[i])
    {c++;}
  }
  if(c>0)
  return true;
  else
  return false;
}

}
