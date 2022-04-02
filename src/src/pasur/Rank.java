package pasur;

/**
 * @author Alireza Ostovar
 * 29/09/2021
 */

public enum Rank
{
    // Order of cards is tied to card images
    ACE(1), KING(13), QUEEN(12), JACK(11),
    TEN(10), NINE(9), EIGHT(8), SEVEN(7), SIX(6),
    FIVE(5), FOUR(4), THREE(3), TWO(2);

    private final int value;

    Rank(int value)
    {
        this.value = value;
    }


    public int getValue()
    {
        return value;
    }

    public static int[] getCardValuesArray()
    {
        Rank[] ranks = Rank.values();
        int[] cardValuesArray = new int[ranks.length];

        for(int i = 0, len = ranks.length; i < len; i++)
        {
            cardValuesArray[i] = ranks[i].value;
        }

        return cardValuesArray;
    }

    public String canonical()
    {
        switch (this)
        {
            case ACE:
            case KING:
            case QUEEN:
            case JACK:
                return toString().substring(0, 1);
            default:
                return String.valueOf(value);
        }
    }
}
