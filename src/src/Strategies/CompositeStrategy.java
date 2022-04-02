package Strategies;

import java.util.ArrayList;

import ch.aplu.jcardgame.Hand;


public class CompositeStrategy implements ScoreStrategy{
    // create ScoreStrategy array list to store different types strategy
    private final ArrayList<ScoreStrategy> strategies = new ArrayList<>();

    
    /** 
     * implment all score strategy
     * @param hand the pickedCards card list
     * @param surs the surs card list
     * @return int return final score
     */
    @Override
    public int getScore(Hand hand, Hand surs) {
        int score = 0;
        for(ScoreStrategy strategy : strategies){
            // based on the current hand and surs to caculate 
            // score by different strategy
            score += strategy.getScore(hand, surs);
        }
        return score;
    }
    /**
     * add valid score strategy to the strategies list
     */
    public void addStraegy(){
        strategies.add(new Strategies.Ace());
        strategies.add(new Strategies.Clubs());
        strategies.add(new Strategies.TenOfDiamond());
        strategies.add(new Strategies.Surs());
        strategies.add(new Strategies.Jack());
        strategies.add(new Strategies.TwoOfClub());
    }

    
    
}
