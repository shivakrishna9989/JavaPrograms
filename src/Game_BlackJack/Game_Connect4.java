package Game_BlackJack;

import java.util.Scanner;


/**
 *
 *this java program can display the winner of a game Connetct4
 */
public class Game_Connect4 {
       
    //printing game first
    public static void startGame(char[][] input) {
        for (int i = 0; i < 8; ++i){
            for (int j = 0; j < 8; ++j){
                input[i][j] = 'O'; }
        }
    }
    // this method prints the current state of the game
public static void current_Game_Board(char[][] inputArray) {
        for (int row = 0; row < 8; ++row) {
            System.out.print("| ");
            for (int col = 0; col < 8; ++col){
                System.out.print(inputArray[row][col] + "| "); }
            System.out.println();
        }

        System.out.println("---------->");
        System.out.println();
    }


    //main method
    public static void main(String L[]){
          System.out.println("***********************Welcome too Connect4 game *********************");            
      Scanner in = new Scanner(System.in);
      char[][] input = new char[8][8]; // this is the 8*8 grid of game board
      boolean playersTurn = true;
                 startGame(input);
        current_Game_Board(input);

        
        while (true) {

            if (playersTurn){
                System.out.println("Player 1 turn to choose column for placing A ");            }
            else{ 
                System.out.println("Player 2 turn to choose column for placing B");
            }
            System.out.print("Choose a number for the column in game:- column (1-8) to place your disk");
                                            int choice_column = in.nextInt(); 
            if (choice_column < 1 || choice_column > 8) {
                System.out.println("please choose column number which should be from 1 to 8");
                continue;
            }
                        
            if (!choose_column_ForDisk(input, choice_column - 1, playersTurn ? 'A' : 'B')) {
                System.out.println("This column is filled! Choose another column");
                continue;
            }

        current_Game_Board(input);

            char result = resulting_Game(input);
            if (result == 'D') {
                System.out.println("It is a draw!. ");
                break;
            }
            else if (result == 'A') {
                System.out.println("Player 1 win with A disk at "+(choice_column)+" column");
                break;
            }
            else if (result == 'B') {
                System.out.println("Player 2 win with B disk at "+(choice_column)+" column");
                break;
            }
            playersTurn = !playersTurn; // this is to change the turns of players 1 and 2
    }
        
        
    }   

// checking for winning status based on 4As 4Bs or D for drawing game and playing again
 public static char resulting_Game(char[][] field) {
        
        char   winner = getWinnerLogic(field);
               
        if (winner != 'O') return winner;

        // Now we need to check if there are empty positions, otherwise it is a draw
        for (int i = 0; i < field.length; ++i)
            for (int j = 0; j < field[i].length; ++j)
                if (field[i][j] == 'O') return 'O';

        return 'D';
    }
 // writing logic for checking 4 As or 4Bs in column after each choice by players
 private static char getWinnerLogic(char[][] inputArray) {
        // Check rows and see if there are 4 disks of the same color
        for (int column = 0; column < 8; ++column) {
            int count = 0;
            
            for (int row = 1; row < 8; ++row) {// We will compare current element with the previous
                if (inputArray[row][column] != 'O' &&
                    inputArray[row][column] == inputArray[row-1][column])
                    ++count;
                else
                    count = 1;
               
                if (count >= 4) { // Check if there are 4 in a row.
                                        return inputArray[row][column];
                }
            }
        }
        // Otherwise return   character, which means nobody win in vertical.
        return ' ';
    }
    
    
    // choose the column 
 public static boolean choose_column_ForDisk(char[][] inputArray, int column, char color) {
         
        // checking for the first position is filled or not, if filled it would be  
        if (inputArray[0][column] != 'O'){
            return false;}

        // Check all elements in the column.
        for (int row = 0; row < 8; ++row) {
            if (inputArray[row][column] != 'O') {
             inputArray[row-1][column] = color;
                return true;
            }
        }
        inputArray[7][column] = color;
        return true;
    }

}
