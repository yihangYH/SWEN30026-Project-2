package Strategies;

import ch.aplu.jcardgame.Hand;
import pasur.Suit;

public class TwoOfClub implements ScoreStrategy {

    
    /** 
     * get score if there is a 2 of club
     * @param hand the pickedCards card list
     * @param surs the surs card list
     * @return int return final score
     */
    @Override
    public int getScore(Hand hand, Hand surs) {
        int score = 0;
        // iterate both hand abd surs to check if there is a 2 of club
        for(int i = 0; i < hand.getNumberOfCards(); i++){
            if(hand.get(i).getSuit() == Suit.CLUBS && hand.get(i).getValue() == 2){
                score += 2;
            }
        }
        for(int i = 0; i < surs.getNumberOfCards(); i++){
            if(surs.get(i).getSuit() == Suit.CLUBS && surs.get(i).getValue() == 2){
                score += 2;
            }
        }
        return score;
    }
    
    
}
