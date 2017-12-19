/*Developer: LeoLUJIAYU Instructor: Mr.Daniel Date: Nov 23rd, 2017
This program helps two users to play TicTacToe.
 */
package tictactoe;

/**
 *
 * @author leolu
 */
import java.util.Scanner;
public class LeoLuTicTacToeVersion2 {
    
    private String[][] board;
    private static final int ROWS = 3; 
    private static final int COLS = 3;
    /** Construct an empty board. */ 
    public LeoLuTicTacToeVersion2()
    {
    board = new String[ROWS][COLS]; for (int r = 0; r < ROWS; r++)
    for (int c = 0; c < COLS; c++) board[r][c] = " ";
       }
    /** @param r the row number
    * @param c the column number
    * @param symbol the symbol to be placed on board[r][c]
    * Precondition: Thesquareboard[r][c]isempty.
    * Postcondition:symbolplacedinthatsquare. */
    public void makeMove(int r, int c, String symbol) {
    board[r][c] = symbol; }
    /** Creates a string representation of the board, e.g. * |o|
    * |xx|
    * |o|
    * @return the string representation of board
    */
    public String toString() {
    String s = ""; 
    for(int r=0;r<ROWS;r++) {
    s = s + "|";
    for (int c = 0; c < COLS; c++)
    s = s + board[r][c]; s = s + "|\n";
    }
    return s;
    }
    
    public static void main(String[] args) {
        System.out.println("welcome to TicTacToe");
        System.out.println("enter the row and column of your move");
        LeoLuTicTacToeVersion2 game=new LeoLuTicTacToeVersion2();
        Scanner input=new Scanner(System.in);
        int i=0;  
        String player2="O"; 
        String player1="X";
        int x=0;
        int y=0;
        int c=0;
        while(i<9){int a=input.nextInt();
        int b=input.nextInt();
        if(i%2==0){
            
            game.makeMove(a,b,player2);
            System.out.println("player2's turn");
        }
            
        else if(i%2==1){
            
            game.makeMove(a,b,player1);
            System.out.println("player1's turn");
            
        } i++;
        
        System.out.println(game.toString());
        if(game.board[0][0]=="O"&&game.board[0][1]=="O"&&game.board[0][2]=="O"){c++;}
        else if(game.board[1][0]=="O"&&game.board[1][1]=="O"&&game.board[1][2]=="O"){c++;}
        else if(game.board[2][0]=="O"&&game.board[2][1]=="O"&&game.board[2][2]=="O"){c++;}
        
        else if(game.board[0][0]=="X"&&game.board[0][1]=="X"&&game.board[0][2]=="X"){c+=2;}
        else if(game.board[1][0]=="X"&&game.board[1][1]=="X"&&game.board[1][2]=="X"){c+=2;}
        else if(game.board[2][0]=="X"&&game.board[2][1]=="X"&&game.board[2][2]=="X"){c+=2;}
        
       
        else if(game.board[0][0]=="O"&&game.board[1][0]=="O"&&game.board[2][0]=="O"){c++;}
        else if(game.board[0][1]=="O"&&game.board[1][1]=="O"&&game.board[2][1]=="O"){c++;}
        else if(game.board[0][2]=="O"&&game.board[1][2]=="O"&&game.board[2][2]=="O"){c++;}
        
        else if(game.board[0][0]=="X"&&game.board[1][0]=="X"&&game.board[2][0]=="X"){c+=2;}
        else if(game.board[0][1]=="X"&&game.board[1][1]=="X"&&game.board[2][1]=="X"){c+=2;}
        else if(game.board[0][2]=="X"&&game.board[1][2]=="X"&&game.board[2][2]=="X"){c+=2;}
        
        else if(game.board[0][0]=="O"&&game.board[1][1]=="O"&&game.board[2][2]=="O"){c++;}
        else if(game.board[0][2]=="O"&&game.board[1][1]=="O"&&game.board[2][0]=="O"){c++;}
        
        else if(game.board[0][0]=="X"&&game.board[1][1]=="X"&&game.board[2][2]=="X"){c+=2;}
        else if(game.board[0][2]=="X"&&game.board[1][1]=="X"&&game.board[2][0]=="X"){c+=2;}
        
        
        if(c==1){System.out.println("player 1 (O) wins");
        i+=9;}
        else if(c==2){System.out.println("player2 (X) wins");
        i+=9;}
        
        }
        if(c==0){System.out.println("tie");}
    }
    
}
