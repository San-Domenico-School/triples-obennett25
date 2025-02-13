import greenfoot.*;

/**
 * This Class holds the code for the animations and sounds and is called by the dealer. 
 * It makes cards wobble when the triple is incorrect and slide off in a random direction when correct.
 * 
 * @author Oliver Bennett
 * @version 1/9/25
 */
public class Animations  
{
    public static void wobble(Card[] cards)
    {
        
        Greenfoot.playSound("wobble.wav");
        
        for (Card card : cards) 
        {

            int x = card.getX();
            int y = card.getY();
            
            for (int i = 0; i < 3; i++) 
            {
                card.setLocation(x - 2, y);
                Greenfoot.delay(5);
    
                card.setLocation(x + 2, y);
                Greenfoot.delay(1); 
            }

            card.setLocation(x, y);
        }
    }
    
    public static void slideAndTurn(Card card)
    {
        Greenfoot.playSound("swoosh.wav");
        
        int[] directionsX = {0, 0, -1, 1}; 
        int[] directionsY = {-1, 1, 0, 0}; 

        int worldWidth = 480;
        int worldHeight = 700;

        int x = card.getX();
        int y = card.getY();

        int direction = Greenfoot.getRandomNumber(4);
        int speed = 5;
        int i = 0;
        while (isOnBoard(x, y, worldWidth, worldHeight)) 
        {
            x += directionsX[direction] * speed;
            y += directionsY[direction] * speed;
                
            card.setLocation(x, y);
            
            /**
             * I know this isn't pretty, but it was the only way I could get the cards to move at the speed I want because
             * the delay only accepts an Integer.
             **/
            if (i == 0)
            {
                Greenfoot.delay(1);
                i++;
            }
            else if (i == 1 || i == 2)
            {
                i++;
            }
            else
            {
                i = 0;
            }
        }
    }
    

    private static boolean isOnBoard(int x, int y, int worldWidth, int worldHeight) 
    {
        return x >= -50 && x < worldWidth && y >= -50 && y < worldHeight;
    } 
}
