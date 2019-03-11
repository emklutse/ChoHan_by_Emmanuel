/**
 *  Dealer class for the game of Cho-Han
 */

public class Dealer
{
    private int die1Value;  // The value of die #1
    private int die2Value;  // The value of die #2

    /**
     * Constructor
     */

    public Dealer()
    {
        die1Value = 0;
        die2Value = 0;
    }

    /**
     *  The rollDice method rolls the dice and saves
     *  their values.
     */

    public void rollDice()
    {
        final int SIDES = 6; // Number of sides for the dice

        // Create the two dice. (This also rolls them.)
        Die die1 = new Die(SIDES);
        Die die2 = new Die(SIDES);

        // Record their values.
        die1Value = die1.getValue();
        die2Value = die2.getValue();
    }

    /**
     *  The getChoOrHan method returns the result of the dice
     *  roll. If the sum of the dice is even, the method returns
     *  "Cho (even)". Othewise, it returns "Han (odd)".
     */

    public String getChoOrHan()
    {
        String result; // To hold the result

        // Get the sum of the dice.
        int sum = die1Value + die2Value;

        // Determine even or odd.
        if (sum % 2 == 0)
            result = "Cho (even)";
        else
            result = "Han (odd)";

        // Return the result.
        return result;
    }

    /**
     *  The getDie1Value method returns the value of
     *  die #1.
     */

    public int getDie1Value()
    {
        return die1Value;
    }

    /**
     *  The getDie2Value method returns the value of
     *  die #2.
     */

    public int getDie2Value()
    {
        return die2Value;
    }

    public int getDieSum()
    {
        return(die1Value+die2Value);
    }
}