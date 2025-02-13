import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the Game Board for Triples
 * 
 * @author Oliver Bennett
 * @version 1.1.1
 */
public class GameBoard extends World
{
    private final int NUM_CARDS_IN_DECK = 27;
    private Dealer dealer;
    
    public GameBoard()
    {   
        super(430, 600, 1, false); 
        new Tester(NUM_CARDS_IN_DECK);
        
        dealer = new Dealer(NUM_CARDS_IN_DECK);
        addObject(dealer, -100, -100);
        addObject(new Player(dealer), -30, -30);
    }
}
