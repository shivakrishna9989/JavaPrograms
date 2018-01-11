package Game_BlackJack;


import java.util.Scanner;

// used for printing the turns between player and dealer

public class BJ_Game {
    private final TurnPlayer[] players = new TurnPlayer[2];

    // player interface is to implement the both players reusable methods 
    
    public static void main(String[] args){

        BJ_Game gm = new BJ_Game();
       Scanner sc = new Scanner(System.in);

        System.out.println(" Hello, Welcome to BlackJack ");

        TurnPlayer user = new User();
        gm.players[0] = user;
        
        TurnPlayer dealer = new Dealer();
        gm.players[1] = dealer;

        user.gameStartup();
        boolean userLoseByDefault = gm.playerTurn(user, dealer);

        if(userLoseByDefault){
            gm.lostByDefault(sc);
        }
        // Dealer's turn
        dealer.gameStartup();
        boolean dealerLoseByDefault = gm.playerTurn(dealer, user);

        if(dealerLoseByDefault){
            gm.lostByDefault(sc);
        }

        TurnPlayer winner = gm.whoWon(gm.players, dealer);

        System.out.println(user + "'s total is: " + user.getTotal() + ".\n" +
                           dealer + "'s total is : " + dealer.getTotal() + ".\n");
        
        System.out.printf("winner is "+winner);

        if (gm.playAgain(sc) == true){
            main(null);// return to playagain as passing null to main function
        }
    }
// turns the player from turning choices
private boolean playerTurn(TurnPlayer player, TurnPlayer otherPlayer){
        boolean endTurn = false;
        boolean loseByDefault = false;
        
        //checking for condition of black jack >21
 if(player.getTotal() > 21){
            System.out.println(player + "'s total is more than 21, " + player + " lose by default.\n" +
                               otherPlayer + " WIN!\n");
            loseByDefault = true;
        }
        while(endTurn == false){
            
            if(player.getTotal() > 21){
            System.out.println(player + "'s total is more than 21, " + player + " lose by default.\n" +
                               otherPlayer + " WIN!\n");
            loseByDefault = true;
            break;
        }
               
            
            endTurn = player.wantToStay();

            if(endTurn == false){
                player.drawCard();
                System.out.println(player + "'s total is: " + player.getTotal() + "\n");
            }
        }
       
        return loseByDefault;
    }

    private void lostByDefault(Scanner sc){
        if(playAgain(sc) == true){
            main(null);
        }
        System.exit(0);
    }
    
    
// this method executes for winning after staying and completing draws from user end
    private TurnPlayer whoWon(TurnPlayer[] players, TurnPlayer dealer){
        TurnPlayer winner = players[0];

        for(int i = 1; i < players.length; i++){
            TurnPlayer elem = players[i];

            if(elem.getTotal() > winner.getTotal()){
                winner = elem;
            }
            else if(elem.getTotal() == winner.getTotal()){
                winner = dealer;
            }
        }
        return winner;
    }
    
// to repeat the game again
    private boolean playAgain(Scanner sc){
        Boolean goAgain = null;

        while(goAgain == null){
            System.out.println("Would you like to play another round? \"yes\"/\"no\": ");
            String input = sc.nextLine();

            String answer = input.toLowerCase();

            switch(answer){
                case "y":
                case "yes":
                    goAgain = true;
                    break;
                case "n":
                case "no":
                    goAgain = false;
                    break;
                default:
                    System.out.println("Please chopose yes or no ");
                    break;
            }
            System.out.println();
        }
        return goAgain;
    }
 
   
}