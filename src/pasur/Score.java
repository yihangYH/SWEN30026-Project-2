package pasur;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import ch.aplu.jcardgame.Card;

public class Score {
    private List<Card> cards = new ArrayList<>();
    private int score;
    private int count = 0;
   

    public Score() {
    }

    public void SetCards(List<Card> c){
        this.cards = c;
    }


    public void UpdateCards(List<Card> c){
        for(int i = 0 ; i < c.size(); i++){
            cards.add(c.get(i));
            
        }
        
    }

    public void caculate(){
        
        for(int i = 0; i < cards.size(); i++){
            
            if(cards.get(i).getSuit() == Suit.DIAMONDS && cards.get(i).getValue() ==10 ){
                score += 3;
                cards.remove(i);
                i = -1;
            }else if(cards.get(i).getSuit() == Suit.CLUBS && cards.get(i).getValue() ==2){
                score += 2;
                cards.remove(i);
                count ++;
                i =-1;
            }else if(cards.get(i).getValue() == 1 || cards.get(i).getValue() == 11){
                score += 1;
                if(cards.get(i).getSuit() == Suit.CLUBS){
                    count++;
                }
                cards.remove(i);
                i = -1;
            }

        }
        cards = cards.stream().distinct().collect(Collectors.toList());
        if(checkCube()){
            score+=7;
        }
        
    }
    // private ArrayList<Card> removeDuplicate(ArrayList<Card> cards){
    //     ArrayList<Card> newCards = new ArrayList<>();
    //     for(Card card : cards){
    //         if(!newCards.contains(card)){
    //             newCards.add(card);
    //         }
    //     }
    //     return newCards;
    // }
    private boolean checkCube(){
        int c = 0;
        for(int i =0 ;i < cards.size(); i++){
            if(cards.get(i).getSuit() == Suit.CLUBS){
                c ++;
            }
        }
        if(count + c >= 7){
            for(int i = 0 ; i < cards.size(); i++){
                if(cards.get(i).getSuit() == Suit.CLUBS){
                    cards.remove(i);
                    i = -1;
                }
            }
            count = 0;
            return true;
        }
        return false;
    }

    public int getScore(){
        caculate();
        reset();
        return this.score;
    }

    public void sur(){
        score += 5;
    }

    private void reset(){
        for(int i = 0 ; i < cards.size(); i++){
            if(cards.get(i).getSuit() != Suit.CLUBS){
                cards.remove(i);
            }
        }
    }

    public void offset(){
        score -= 5;
    }

    
}
