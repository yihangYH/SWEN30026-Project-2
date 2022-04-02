package Strategies;

import ch.aplu.jcardgame.Hand;

public class Surs implements ScoreStrategy {

    
    /** 
     * get score if there is a sur
     * @param hand the pickedCards card list
     * @param surs the surs card list
     * @return int return final score
     */
    @Override
    public int getScore(Hand hand, Hand surs) {
        return surs.getNumberOfCards() * 5;
    }
    
}
