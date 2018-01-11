package Game_BlackJack;

import java.util.Scanner;

public class Vinil_Connect4 {

    public static void main(String k[]){
        
      Scanner input = new Scanner(System.in);
      // Declaring array of size 7 in two dimentional 
        char[][] inputArray = new char[7][7];
            
        // Initializing 7by7 array with spaces
        for (int i = 0; i < 7; ++i){
            for (int j = 0; j < 7; ++j){
                inputArray[i][j] = ' '; }
        }
        printField(inputArray);

        // This variable will alternate and mean whose turn is it. It is Red's turn now.
        boolean isRedDisk = true;
        while (true) {
            if (isRedDisk){
                System.out.println("Player 1 turn to place Red disk :-> ");            }
            else{ 
                System.out.println("Player 2 turn to plavce Yellow disk :-> ");
            }
            System.out.print("Choose a number for the column in game:- column (1-7) for a disk to roll down:");
            
          int column = input.nextInt(); // capturing position number to cjheck withing 2 dimentional range
            if (column < 1 || column > 7) {
                System.out.println("player choice column number should be from 1 to 7");
                continue;
            }
             // continuing with same players turn after checking weather player choosen column is full
            
            if (!putDisk(inputArray, column - 1, isRedDisk ? 'R' : 'Y')) {
                System.out.println("This column is filled with disks of R and Y ! Choose another one to roll your disk.");
                continue;
            }

            printField(inputArray);

            // Get winner, this method returns R if player 1 win, Y if Yellow wins, D
            // if it is a draw and space character if we need to continue the game.
            char result = findWinner(inputArray);
            if (result == 'D') {
                System.out.println("It is a draw!, Nobody win or loose :-( :-( :-( :-( :-(. ");
                break;
            }
            else if (result == 'R') {
                System.out.println("************** Player 1 win with Red disk ********************");
                break;
            }
            else if (result == 'Y') {
                System.out.println("************** Player 2 win with Yellow Disk ********************");
                break;
            }
            isRedDisk = !isRedDisk; 
        }
    }
   
    
    
    
    // this method is to print  two dimentional matrix  
    public static void printField(char[][] inputArray) {
        for (int row = 0; row < 7; ++row) {
            System.out.print("| ");
            for (int col = 0; col < 7; ++col)
                System.out.print(inputArray[row][col] + "| ");
            System.out.println();
        }

        System.out.println("---------------------");
        System.out.println();
    }
    
    // this method puts the first player disk red color which is R or second player disk Yelllow color Y. 
     public static boolean putDisk(char[][] inputArray, int column, char color) {
         
        // checking for the first position is filled or not, if filled it would be  
        if (inputArray[0][column] != ' '){
            return false;}

        // Check all elements in the column.
        for (int row = 0; row < 7; ++row) {
            // If we found R or Y which means if the character is not
            // zero character
            if (inputArray[row][column] != ' ') {
                // copy the R or Y disk on top of the current one.
                inputArray[row-1][column] = color;
                return true;
            }
        }
        // If no other disks found, we place this diak at the bottom.
        inputArray[6][column] = color;
        return true;
    }

     // this method is to find the winner disk weither R or Y
     public static char findWinner(char[][] field) {
        
        char   winner = getWinnerInVertical(field);
               
        if (winner != ' ') return winner;

        // Now we need to check if there are empty positions, otherwise it is a draw
        for (int i = 0; i < field.length; ++i)
            for (int j = 0; j < field[i].length; ++j)
                if (field[i][j] == ' ') return ' ';

        return 'D';
    }
    
     //this method checks with the vertical columns on every choice by the 2 players
      //if the count of 4 choices were same in a column returns the letter Y or R or D for a game draw
     private static char getWinnerInVertical(char[][] inputArray) {
        // Check rows and see if there are 4 disks of the same color
        for (int column = 0; column < 7; ++column) {
            int count = 0;
            // We will compare current element with the previous
            for (int row = 1; row < 7; ++row) {
                if (inputArray[row][column] != ' ' &&
                    inputArray[row][column] == inputArray[row-1][column])
                    ++count;
                else
                    count = 1;

                // Check if there are 4 in a row.
                if (count >= 4) {
                    // Return color of the winner
                    return inputArray[row][column];
                }
            }
        }
        // Otherwise return   character, which means nobody win in vertical.
        return ' ';
    }
    
}
