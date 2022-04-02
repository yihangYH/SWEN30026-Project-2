package Strategies;

import ch.aplu.jcardgame.Hand;
import pasur.Suit;

public class TenOfDiamond implements ScoreStrategy{

    
    /** 
     * get score if there is 10 of diamon
     * @param hand the pickedCards card list
     * @param surs the surs card list
     * @return int return final score
     */
    @Override
    public int getScore(Hand hand, Hand surs) {
        int score = 0;
        // iterate both hand and surs to check if there is 10 of diamond
        for(int i = 0; i < hand.getNumberOfCards(); i++){
            if(hand.get(i).getSuit() == Suit.DIAMONDS && hand.get(i).getValue() == 10){
                score += 3;
            }
        }
        for(int i = 0; i < surs.getNumberOfCards(); i++){
            if(surs.get(i).getSuit() == Suit.DIAMONDS && surs.get(i).getValue() == 10){
                score += 3;
            }
        }
        return score;
    }
    
    
}
