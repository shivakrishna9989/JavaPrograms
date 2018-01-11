package Game_BlackJack;
import java.util.Scanner;

public class Connect4_Vertical{
    
    final static int WIDTH = 8;
    final static int HEIGHT = 8;
    final static int BOTTOM_ROW = WIDTH - 1;
    static char[][] board = new char[WIDTH][HEIGHT];
    
    
    
    
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        CreateBoard(); // prints the game board 8 by 8 matrix
        
        System.out.println("Below is the 8*8 with labels 0 to 7 tiles game");
        displayBoard(); // display
        boolean flag = true;
        while(flag){ // loop 
            //activates player 1s turn, then prints board
            player1Turn();
            displayBoard();
            //determines if player 1 has won
            if(!isPlayerX_Won()){
               // flag = false; 
                break; //break to skip player 2s turn if won
            }
            //activates player 2s turn, then prints board
            player2Turn();
            displayBoard();
            //determines if player 1 has won
            if(!isPlayerY_Won()){
                //flag = false; 
                break; // break for consistency
            }
        }
    }
    
    public static void CreateBoard() {
        //fills board with '.' for the width and height
        for (int w = 0; WIDTH > w; w += 1) {
            for (int h = 0; HEIGHT > h; h += 1) {
                board[w][h] = '_';
            }
        }
    }

    public static void displayBoard() {
        for (int w = 0; WIDTH > w; w += 1) {
            System.out.print("| ");
            for (int h = 0; HEIGHT > h; h += 1) {
                
                System.out.print(board[w][h]+ "| ");
            }
            System.out.println();
        }
        System.out.println();
    }

    
    // turns the player 1 choice to put the column number to insert
    public static void player1Turn(){
        //creates a counter
        int counter = 1;

        //shows whos turn
        System.out.println("Player X turn");
        System.out.println("Pick 0 to 7 numbers to place X in the bottom unoccupied place of a column");

        //gets input
        int column = scanner.nextInt();

        while(true){
            if(column > WIDTH){
                System.out.println("That's not a valid column, Please choose again");
                break;
            }

            if (board[BOTTOM_ROW][column] == '_') { 
                board[BOTTOM_ROW][column] = 'X';
                break; //breaks loop after placing
            }else if(board[BOTTOM_ROW][column] == 'X' || board[BOTTOM_ROW][column] == 'Y'){ 
                if(board[BOTTOM_ROW - counter][column] == '_'){ //puts X if blank
                    board[BOTTOM_ROW - counter][column] = 'X';
                    break; //breaks loop after placing
                }
            }
            counter += 1; //adds one to counter if the space wasn't blank, then loops again
            if(counter == WIDTH){ 
                System.out.println("That column is full");
                break;
            }
        } 
    }

// this method is to let the player2 which is Y to put Y in the column
    public static void player2Turn(){
        //creates a counter
        int counter = 1;

        //shows whos turn
        System.out.println("Player Y turn");
System.out.println("Pick 0 to 7 numbers to place Y in the bottom unoccupied place of a column");
        
        //gets input
        int column = scanner.nextInt();

        while(true){
            if(column > WIDTH){
                System.out.println("That's not a valid column, Please choose again");
                break;
            }

            if (board[BOTTOM_ROW][column] == '_') { 
                board[BOTTOM_ROW][column] = 'Y';
                break; //breaks loop after placing
            }else if(board[BOTTOM_ROW][column] == 'X' || board[BOTTOM_ROW][column] == 'Y'){ 
                if(board[BOTTOM_ROW - counter][column] == '_'){ 
                    board[BOTTOM_ROW - counter][column] = 'Y';
                    break; //breaks loop after placing
                }
            }
            counter += 1; //adds one to counter if the space wasn't blank, then loops again
            if(counter == WIDTH){ //checks to see if at end of column
                System.out.println("That column is full");
                break;
            }
        }
    }

// this method checks weather player X has won or not by checking 4 consecutive X's in a column down to base
    public static boolean X_Winning_Checker(){
        
        boolean flag = true;
            int counter = 0;
        while(flag){

            for(int h = 0; HEIGHT > h; h += 1){
                for(int w = 0; WIDTH > w; w += 1){
                    if(board[w][h] == 'X'){
                        counter += 1;
                    }else{
                        counter = 0; 
                    }
                    if(counter >= 4){
                        System.out.println(" **  Player X wins  ** "); 
                        flag = false;
                    }
                }
            }
            break;
        }
        return flag;
    }

    // this method checks weather player Y has won or not by checking 4 consecutive Y's in a column down to base
    public static boolean Y_Winning_Checker(){
        //creates boolean to act as flag
        boolean flag = true;

        //creates counter
        int counter = 0;
        while(flag){

            //goes through board vertically
            for(int h = 0; HEIGHT > h; h += 1){
                for(int w = 0; WIDTH > w; w += 1){
                    if(board[w][h] == 'O'){ //if it finds an O, add 1 to counter
                        counter += 1;
                    }else{
                        counter = 0; // if next piece is not an O, set counter to 0
                    }
                    if(counter >= 4){
                        System.out.println("Player 2 wins"); //if counter is greater or equal to 4, player wins
                        flag = false;
                    }
                }
            }
            break;
        }
        return flag;
    }
//this method is checking for player X is won or not. 
    public static boolean isPlayerX_Won(){
                boolean flag = true;

        if(!X_Winning_Checker()){
            flag = false;
        }
        return flag;
    }
//this method is checking for player Y is won or not. 
    public static boolean isPlayerY_Won(){
        //creates flag
        boolean flag = true;

        if(!Y_Winning_Checker()){
            flag = false;
        }
        return flag;
    }
}
