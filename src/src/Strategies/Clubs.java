package Strategies;

import ch.aplu.jcardgame.Hand;
import pasur.Suit;

public class Clubs implements ScoreStrategy{

    
    /** 
     * implment >= 7 cube score strategy
     * @param hand the pickedCards card list
     * @param surs the surs card list
     * @return int return final score
     */
    @Override
    public int getScore(Hand hand, Hand surs) {
       
        int count = 0;
        // count cubes
        for(int i = 0; i < hand.getNumberOfCards(); i++){
            if(hand.get(i).getSuit() == Suit.CLUBS){
                count ++;
            }
        }
        // if score >= 7 score 7 otherwise score 0
        if(count >= 7){
           
            return 7;
        }
        return 0;
    }
    
    
}
