/*Creator: Leo LUJIAYU Instructor: Mr. Daniel Date:Oct, 10th, 2017
This program is a game similar to creat your own adventure, the player inputs different options 
to make his or her own story. The story is about a cop chasing thieve and more.
  
 */
package javaapplication19;

/**
 *
 * @author leolu
 */
import java.util.Scanner;

public class LeoLuCatchGameAdventureMethod {
    
    
    
 public static void yourSeletion1(int answerisgetoutofcar){
            
            System.out.println();
            System.out.println("You ran towards the market but the thieve noticed and began to run straight outside the back door with the wallet");
            System.out.println("your are chasing after him outside the market and after 3 hours of chasing he got tired and slowed down");
            System.out.println("Its your chance! He looked back while still running slowler and slower");
            System.out.println();
            
            System.out.println("what will you do?"+" Officer ");
            System.out.println("1.Throw your burger at his head");
            System.out.println("2.Shoot him");
            System.out.println("3.Give up chasing cause you're tired");
 
 }
 
 public static void yourSelection2(int answeriseatburgerkeep){
            System.out.println();
            System.out.println("You stayed there and the thieve took the wallet and got away");
            System.out.println("The man called the police");
            System.out.println("The police department called you through the radio to catch the thieve");
            System.out.println("But you already missed him");
            System.out.println("So you went back to the station and got fired");
 
 }
 
 public static void yourselectionof3(int answerfor123z1){
                System.out.println();
                System.out.println("you hit him, he fell down, fainted");
                System.out.println("You put a hancuff on his hands and brought him back to the station by foot because you couldn't find the way back to the car");
                System.out.println("You are awarded and became the chief officer");
                System.out.println("The Government ask you whether you want to join the FBI");
                 System.out.println();
                System.out.println("what will you do?"+" Officer ");
                System.out.println("1. become a FBI");
                System.out.println("2. continue to be an officer");
                
                Scanner input=new Scanner(System.in);
                int answer3=input.nextInt();
                if(answer3==1){
                     System.out.println();
                    System.out.println("You are sent to North Korea");
                    System.out.println("Since you are Asian and look like the locals, nobody thought you are from abroad");
                    System.out.println("a local speaks to you");
                    
                     System.out.println();
                    System.out.println("what will you do?"+" agent ");
                    System.out.println("1.speak to him in English");
                    System.out.println("2.don't say a word and pretend to be deaf");
                    int answer4=input.nextInt();
                    if(answer4==1){
                         System.out.println();
                        System.out.println("he reported to the authorities and the soldiers killed you");
                        
                    }
                    else if(answer4==2){
                         System.out.println();
                        System.out.println("he went away");
                        System.out.println("You stayed there for the rest of your life pretending to be deaf");
                        
                    }
                    
                 
                
                
                }
                else if(answer3==2){
                     System.out.println();
                    System.out.println("You continued to be an officer and kept on chasing thieves for the rest of your life");
                    
                }
            

                
 }
 public static void Yourselectionof123z3(int z3){
   System.out.println();
                System.out.println("you killed the thieve");
                System.out.println("You went to jail for killing him ");
                System.out.println("Since you were a policeman, all the cell mates hate you");
                System.out.println("The jail bully is trying to beat you");
                
                
                 System.out.println();
                System.out.println("what will you do?"+" Officer ");
                System.out.println("1. fight with him");
                System.out.println("2. run away");
                Scanner input=new Scanner(System.in);
                int answer5=input.nextInt();
                if(answer5==1){
                     System.out.println();
                    System.out.println("you won!");
                    System.out.println("You became the boss of the jail");
                    System.out.println("Yeeeeeeeees");
                }
                else if(answer5==2){
                     System.out.println();
                    System.out.println("you couldn't run away, they grabbed you and you got beaten up");
                    System.out.println("They beat you to death");
                    System.out.println("NOOOOOOOOOOOOOOOO");
                }
               
                
              
                
                
 }
 
 public static void selectionof3z3(int z4){

                 System.out.println();
                System.out.println("The thieve got away");
                System.out.println("You sat there and began to eat your half finished burger and cry with all the people watching you");
                System.out.println("You became famous because you are the first policeman crying and eating burger on the ground");
                System.out.println("You became a movie star and made more money than ever can an officer make");
            
 }
 
 public static void main(String[] args) {
        System.out.println("Catch me if you can");
        System.out.println("Welcome to the Catch me if you can!");
        System.out.println("Select the options shown to decide your move and storyline");
        System.out.println();
        System.out.println("What's your name?");
        Scanner input=new Scanner(System.in);
        String name=input.nextLine();
        System.out.println("Hi, officer "+name+"! You are trying to catch a thieve and he is stealing a man's wallet in the market, ");
        System.out.println("now you are outside the market in your car watching his movement while having burgers");
        System.out.println();
        
        System.out.println("what will you do?"+" Officer "+name);
        System.out.println("1. Get out of the car with your burger and rush into the market");
        System.out.println("2. Stay there and continue eating your burger as if nothing happened");
        
        int answer1=input.nextInt();
        if (answer1==1){
        LeoLuCatchGameAdventureMethod.yourSeletion1(1);
            int answer2=input.nextInt();
            if(answer2==1){
                LeoLuCatchGameAdventureMethod.yourselectionof3(3);
            
            }
            else if(answer2==2){
                LeoLuCatchGameAdventureMethod.Yourselectionof123z3(3);
                
            }
            else if(answer2==3){
                LeoLuCatchGameAdventureMethod.selectionof3z3(4);
            }
        
        }
        else if(answer1==2){
        LeoLuCatchGameAdventureMethod.yourSelection2(2);
        }
        
        
 }

}

