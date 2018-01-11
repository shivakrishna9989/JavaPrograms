
package Game_BlackJack;

import java.util.Arrays;


public class Dealer implements TurnPlayer {

    private final String dealer = "Dealer";

    Decks[] dealerHand = new Decks[0];

    Dealer(){
        dealerHand = Arrays.copyOf(dealerHand, dealerHand.length + 2);
        dealerHand[0] = new Decks();
        dealerHand[1] = new Decks();

        System.out.println("The dealer has a " + dealerHand[0].getValue() + " showing, and a hidden card.");
        System.out.println("Dealer total is hidden too.\n");
    }

    
    @Override
    public void gameStartup(){
        System.out.println("Ok, Dealer's turn!\n");

        int total = getTotal();
        System.out.println("Dealer hidden card was a " + dealerHand[1].getValue() + "\n" +
                            "Dealer total was " + total + ".\n");
    }

    @Override
    public void drawCard() {
        dealerHand = Arrays.copyOf(dealerHand, dealerHand.length + 1);
        dealerHand[dealerHand.length - 1] = new Decks();

        int lastCard = dealerHand.length - 1;
        System.out.println("Dealer drew a " + dealerHand[lastCard].getValue());
    
    }

    
    @Override
    public boolean wantToStay() {
        boolean stay = false;
        int total = getTotal();

        if(total > 16){// condition for staying on > or equal to 17
            stay = true;
            System.out.println("Dealer stays.\n");
        }
        else{
            System.out.println("Dealer hits.");
        }
        return stay;
    }

    
    @Override
    public int getTotal() {
        int totalValue = 0;

        for (Decks c : dealerHand) {
            int cardValue = c.getValue();
            totalValue = totalValue + cardValue;
        }

        return totalValue;
    }

    
    @Override
    public String toString(){
        return dealer;
    } 
}

