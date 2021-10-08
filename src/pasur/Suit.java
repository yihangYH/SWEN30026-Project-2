package pasur;

/**
 * @author Alireza Ostovar
 * 29/09/2021
 */

public enum Suit
{
    CLUBS, DIAMONDS, HEARTS, SPADES;

    public String canonical()
    {
        return toString().substring(0, 1);
    }
}
