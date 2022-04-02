package Strategies;

import ch.aplu.jcardgame.Hand;

public class Jack implements ScoreStrategy{
    
    /** 
     * get score if the card is Jack
     * @param hand the pickedCards card list
     * @param surs the surs card list
     * @return int return final score
     */
    @Override
    public int getScore(Hand hand, Hand surs) {
        int score = 0;
        // iterate both hand and surs to check is there is Jack
        for(int i = 0; i < hand.getNumberOfCards(); i++){
            if( hand.get(i).getValue() == 11){
                score += 1;
            }
        }
        for(int i = 0; i < surs.getNumberOfCards(); i++){
            if( surs.get(i).getValue() == 1){
                score += 1;
            }
        }
        return score;
    }
    
    
}
