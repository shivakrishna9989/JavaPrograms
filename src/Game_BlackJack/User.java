package Game_BlackJack;


import java.util.Scanner;
import java.util.Arrays;

public class User implements TurnPlayer {

    private final String user;

    private Decks[] userHand = new Decks[0];

    User(){
        user = "I";

        userHand = Arrays.copyOf(userHand, userHand.length + 2);
        userHand[0] = new Decks();userHand[1] = new Decks();

        System.out.println("I get a " + userHand[0].getValue() + " and a " + userHand[1].getValue() + ".");
        int total = getTotal();// returns the total of cards 
        System.out.println("MY total is: " + total + "\n");
    }

    @Override
    public void gameStartup(){
        
        System.out.println("MY turn!");
                
    }

    @Override
    public int getTotal(){
        int totalValue = 0;

        for (Decks c : userHand) {
            int cardValue = c.getValue(); // loops through the decks of cards available to print total of them.
            totalValue = totalValue + cardValue;
        }

        return totalValue; // returns total
    }

    @Override
    public void drawCard() {
        userHand = Arrays.copyOf(userHand, userHand.length + 1);
        userHand[userHand.length - 1] = new Decks();
        int lastCard = userHand.length - 1;
        System.out.println("I drew a " + userHand[lastCard].getValue());
    }

    
    @Override
    public boolean wantToStay() {
        Boolean stay = null;

        while(stay == null){
            Scanner sc = new Scanner(System.in);

            System.out.print("You like to \"hit\" or \"stay\"? ");
            String input = sc.nextLine();

            String hitOrStay = input.toLowerCase();

            switch(hitOrStay){
                case "hit":
                    stay = false;
                    break;
                case "stay":
                    stay = true;
                    break;
                default:
                    System.out.println("Please choose a valid option.");
                    break;
            }
        }
        return stay;
    }

    @Override
    public String toString(){
        return user;
    }
}
