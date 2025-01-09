/**
 * Write a description of class Scorekeeper here.
 * 
 * @author Oliver Bennett
 * @version 1/9/25
 */
public class Scorekeeper  
{
    
    private static int deckSize;
    private static int score;
    private static long startTime = System.currentTimeMillis();
    
    public static void setDeckSize(int newDeckSize) 
    {
        deckSize = newDeckSize;
    }

    public static void updateScore() 
    {
        long currentTime = System.currentTimeMillis();
        long timeElapsed = currentTime - startTime;
        
        if (timeElapsed < 5000) 
        { 
            score += 10; 
        } 
        else if (timeElapsed < 10000) 
        { 
            score += 5;
        } 
        else 
        {
            score += 2; 
        }
        
        startTime = System.currentTimeMillis();
    }

    public static int getScore() 
    {
        return score;
    }

}
