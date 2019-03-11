import java.util.Random;

/**
 *  Player class for the game of Cho-Han
 */

public class Player
{
    private String name;    // The player's name
    private String guess;   // The player's guess
    private int points;     // The player's points
    private int numGuess;

    /**
     *  Constructor
     *  Accepts the player's name as an argument
     */

    public Player(String playerName)
    {
        name = playerName;
        guess = "";
        points = 0;
    }

    /**
     * The newGuess method causes the player to guess
     * either "Cho or Han".
     */

    public void player1Guess(int newGuess)
    {
        numGuess=newGuess;

        if((numGuess%2)==0)
            guess="Cho (even";
        else
            guess="Han (odd)";
    }
    /**
     *  The makeGuess method causes the player to guess
     *  either "Cho (even)" or "Han (odd)".
     */

    public void makeGuess()
    {
        // Create a Random object.
        Random rand = new Random();

        // Get a random number, either 0 or 1.
        int guessNumber = rand.nextInt(2);

        // Convert the random number to a guess of
        // either "Cho (even)" or "Han (odd)".
        if (guessNumber == 0)
            guess = "Cho (even)";
        else
            guess = "Han (odd)";

        numGuess=guessNumber;
    }

    /**
     *  The addPoints method adds a specified number of
     *  points to the player's current balance. The number
     *  of points is passed as an argument.
     */

    public void addPoints(int newPoints)
    {
        points += newPoints;
    }

    /**
     The getName method returns the player's name.
     */

    public String getName()
    {
        return name;
    }

    /**
     The getGuess method returns the player's guess.
     */

    public String getGuess()
    {
        return guess;
    }

    /**
     The getPoints method returns the player's points
     */

    public int getPoints()
    {
        return points;
    }

    public int getNumGuess()
    {
        return numGuess;
    }
}