package Strategies;

import ch.aplu.jcardgame.Hand;

public class Ace implements ScoreStrategy {
    
    
    /** 
     * get score if card is Ace
     * @param hand the pickedCards card list
     * @param surs the surs card list
     * @return int return final score
     */
    @Override
    public int getScore(Hand hand, Hand surs) {
        int score =0;
        // iterate both hand and surs to check if there is Ace
        for(int i = 0; i < hand.getNumberOfCards(); i++){
            if(hand.get(i).getValue() == 1){
                score ++;
            }
        }
        for(int i = 0; i < surs.getNumberOfCards(); i++){
            if(surs.get(i).getValue() == 1){
                score ++;
            }
        }
        return score;

    }
    
    
}
