/*Developer: Leo Lu, Clarence Jiang. Instructor: Mr.Daniel.  Date: Feb.25th, 2018
This program is a simulation of the classical game mine sweeping by using two
dimensional arrays. The details are in the instruction parts once running the program
 */
package javaapplication64;
import java.util.Scanner;
/**
 *
 * @author leolu
 */
public class Project2LeoClarence {

    /**
     * @param args the command line arguments
     */
    public static void printmap(int[][] yo){
    for(int i=0;i<yo.length;i++){
    for(int j=0;j<yo[i].length;j++){
        if(yo[i][j]>=100){
    System.out.print("[@]");}
    else if(yo[i][j]<100){
    System.out.print("["+yo[i][j]+"]");}
        
        
    }System.out.println();
    }
    }
        public static void printplay(int[][] yo, int[][] map){
    
    Scanner input=new Scanner(System.in);
    int c=0;
    while(c==0){
        System.out.println("please enter the number of the row(start from 1 meaning the first row)");
    int x=input.nextInt();
        System.out.println("please enter the number of the column(start from 1 meaning the first column)");
    int y=input.nextInt();
    for(int i=0;i<yo.length;i++){
        
    for(int j=0; j<yo[i].length;j++){
    if(x-1==i&&y-1==j&&map[x-1][y-1]<100&&map[x-1][y-1]!=0){
    System.out.print("["+map[x-1][y-1]+"]");
    
    }
    else if(x-1==i&&y-1==j&&map[x-1][y-1]<100&&map[x-1][y-1]==9){
    System.out.print("[O]");
     
    }
    else if(x-1==i&&y-1==j&&map[x-1][y-1]>=100){
    System.out.print("[@]"); c++;
    }
    else{System.out.print("["+yo[i][j]+"]");}
    
    yo[x-1][y-1]=map[x-1][y-1];
    
    }
    System.out.println();
    }
    
    }
    System.out.println("Gameover, did you touch the mine?");
    System.out.println("Map shown below, please compare with your performance to see how well you did!!");
    for(int i=0;i<map.length;i++){
    for(int j=0;j<map[i].length;j++){
        if(map[i][j]>=100){
    System.out.print("[@]");}
    else if(map[i][j]<100){
    System.out.print("["+map[i][j]+"]");}
        
        
    }System.out.println();
    }   }
    
        
    public static void main(String[] args) {
        System.out.println("Welcome to Mine Sweeping!");
        System.out.println("M I N E   S W E E P I N G ");
        for(int i=0; i<30; i++){
                System.out.print("- ");}
                System.out.println();
        System.out.println("INSTRUCTIONS # ON # THE # GAME(MUST READ)");
        System.out.println("1. First ask someone else to follow the instructions to burry the mines for you");
        System.out.println("so that he/she and the computer know where it is burried but you do not know");
        System.out.println("2. Second, when you see the sign M I N E M A P  G E N E R A T E D, start the game following the instructions ");
        System.out.println("3. Please note that the gameboard is originally set to have a number 9 on each space");
        System.out.println("Obviously, there could be at most 8 mines around a space so 9 is impossible.");
        System.out.println("That is because the number 9 represent spaces you haven't checked yet, the spot you haven't accessed");
        System.out.println("Once you have checked a spot, it will become 0 if there is no mine around it, or");
        System.out.println("numbers from 1 to 8 if there is a corresponding number of mines around it, or");
        System.out.println("the symbol @ if it is a mine");
        System.out.println("Leave the spaces intact if you are certain that a mine is under it");
                System.out.println("Enjoy by starting the game");
        for(int i=0; i<30; i++){
                System.out.print("- ");}
                System.out.println();
        Scanner size=new Scanner(System.in);
                System.out.println("please enter number of mines");
                int numOfMines=size.nextInt();
                for(int i=0; i<30; i++){
                System.out.print("* ");}
                System.out.println();
                System.out.println("please enter size of map");
                int mapSize=size.nextInt();
	
		int[][] map = new int [mapSize][mapSize];
                int[][] play=new int[mapSize][mapSize];
                for(int a=0;a<play.length;a++){
                for(int b=0;b<play[a].length;b++)
                    play[a][b]=9;
                }
                System.out.println("Please give the coordinates of you mines");
                for(int k=0;k<numOfMines;k++){
                System.out.println("Please enter the horizontal coordinate for which you want to put you mine, for example: 1 means the first row");
                int h=size.nextInt();
                int z=k+1;
                
                
                System.out.println("Please enter the vertical coordinate for which you want to put your mine, for example: 1 means the first column");
                int v=size.nextInt();
                
                System.out.println("your mine number "+z+" is burried at the "+h+"th row and the "+v+"th column");
                for(int i=0; i<30; i++){
                System.out.print("* ");}
                System.out.println();
                
                int corx=h-1;
                int cory=v-1;
                if(corx<mapSize-1&&cory<mapSize-1){
                if(corx!=0&&cory!=0){
                map[corx][cory]=100;
                map[corx-1][cory]+=1;
                map[corx-1][cory-1]+=1;
                map[corx+1][cory]+=1;
                map[corx+1][cory-1]+=1;
                map[corx][cory+1]+=1;
                map[corx][cory-1]+=1;
                map[corx+1][cory+1]+=1;
                map[corx-1][cory+1]+=1;}
                
                else if(corx==0&&cory!=0){
                map[corx][cory]=100;
                
                map[corx+1][cory]+=1;
                map[corx+1][cory-1]+=1;
                map[corx][cory+1]+=1;
                map[corx][cory-1]+=1;
                map[corx+1][cory+1]+=1;
                
                }
                
                else if(corx!=0&&cory==0){
                map[corx][cory]=100;
                map[corx-1][cory]+=1;
                
                map[corx+1][cory]+=1;
                
                map[corx][cory+1]+=1;
                
                map[corx+1][cory+1]+=1;
                map[corx-1][cory+1]+=1;
                }
                
                else if(corx==0&&cory==0){
                map[corx][cory]=100;
                
                
                map[corx+1][cory]+=1;
                
                map[corx][cory+1]+=1;
                
                map[corx+1][cory+1]+=1;
                
                }}
                
                
                
                else if(corx==mapSize-1&&cory!=mapSize-1&&cory!=0){
                map[corx][cory]=100;
                map[corx-1][cory]+=1;
                map[corx-1][cory-1]+=1;
                
                
                map[corx][cory+1]+=1;
                map[corx][cory-1]+=1;
                
                map[corx-1][cory+1]+=1;
                }
                
                else if(corx==mapSize-1&&cory==0){
                map[corx][cory]=100;
                map[corx-1][cory]+=1;
                
                
                
                map[corx][cory+1]+=1;
                
                
                map[corx-1][cory+1]+=1;
                }
                
                else if(corx==mapSize-1&&cory==mapSize-1){
                map[corx][cory]=100;
                map[corx-1][cory]+=1;
                map[corx-1][cory-1]+=1;
                
                map[corx][cory-1]+=1;
               
                }
                else if(corx==0&&cory==mapSize-1){
                    map[corx][cory]=100;
                
                map[corx+1][cory]+=1;
                map[corx+1][cory-1]+=1;
                
                map[corx][cory-1]+=1;
                }
                else if(corx!=mapSize-1&&corx!=0&&cory==mapSize-1){
                
                map[corx][cory]=100;
                map[corx-1][cory]+=1;
                map[corx-1][cory-1]+=1;
                map[corx+1][cory]+=1;
                map[corx+1][cory-1]+=1;
                
                map[corx][cory-1]+=1;
               }
                
                
                }
                System.out.println("M I N E M A P  G E N E R A T E D");
                
                System.out.println("Enter the coordinates to see your game board");
                printplay(play,map);
                System.out.println("Thank you for playing!");
    }
    
}
