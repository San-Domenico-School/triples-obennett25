import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Game Board for Triples
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameBoard extends World
{
    private final int NUM_CARDS_IN_DECK = 81;
    
    public GameBoard()
    {   
        super(430, 600, 1, false); 
        new Tester(NUM_CARDS_IN_DECK);
        addObject(new Dealer(81), -100, -100);
        addObject(new Player(), -30, -30);
    }

    
}
