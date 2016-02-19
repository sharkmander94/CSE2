//This program chooses a card at random from a standard 52 card deck
import java.lang.Math;
public class CardGenerator{
    public static void main(String[] args){
        //Create variables to store values
        int randNumber;
        int randSuit;
        String number;
        String suit;
        
        //randomly select the suit and value of the card
        randNumber=(int)(Math.random()*12)+2;
        randSuit=(int)(Math.random()*3)+1;
        
        //convert the suit numerical value to a string
        if(randSuit==4){
            suit="Spades";
        }
        else if(randSuit==3){
            suit="Diamonds";
        }
        else if(randSuit==2){
            suit="Hearts";
        }
        else{
            suit="Clubs";
        }
        
        //Convert the card value to a string
        switch (randNumber){
            case 11:
                number="Jack";
                break;
            case 12:
                number="Queen";
                break;
            case 13:
                number="King";
                break;
            case 14:
                number="Ace";
                break;
            default:
                number= Integer.toString(randNumber);
                break;
        }
        //Print result
        System.out.println("You drew the " + number +" of "+ suit + ".");
        
    }
}