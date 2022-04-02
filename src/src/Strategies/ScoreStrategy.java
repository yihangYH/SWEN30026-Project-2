package Strategies;

import ch.aplu.jcardgame.Hand;

public interface ScoreStrategy {
    
    /** 
     * the method in abstract class, and will be used for other 
     * strategy to override 
     * @param hand the pickedCards card list
     * @param surs the surs card list
     * @return int return final score
     */
    public int getScore(Hand hand, Hand surs);
}
