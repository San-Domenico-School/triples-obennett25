import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * This is the dealer class. It can check tosee if something is a triple and deal new cards from the deck.
 * 
 * @author Oliver Bennett
 * @version 1/28/25
 */
public class Dealer extends Actor
{
    Deck deck = new Deck(81);
    private ArrayList<Card> cardsOnBoard;
    private ArrayList<Integer> selectedCardsIndex;
    private Card[] cardsSelected;
    private int numCardsInDeck;
    private int triplesRemaining; 
    
    /**
     * Act - do whatever the Dealer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    
    
    /**
     * Constructor for objects of class Dealer
     */
    public Dealer(int numCardsInDeck)
    {
       this.numCardsInDeck = numCardsInDeck;
       this.triplesRemaining = numCardsInDeck / 3;
       this.deck = new Deck(numCardsInDeck);
       this.cardsOnBoard = new ArrayList<>();
       this.selectedCardsIndex = new ArrayList<>();
       this.cardsSelected = new Card[3];
    }
    
    public void addedToWorld(World world) 
    {
        dealBoard();
        setUI();
    }
    
     public void dealBoard() 
    {
        Greenfoot.playSound("shuffle.wav");
        int boardWidth = 430;
        int boardHeight = 600;
        int rows = 5;
        int cols = 3;
        int cardWidth = 123;  
        int cardHeight = 65; 
        int horizontalSpacing = (boardWidth - (cols * cardWidth)) / (cols + 1);
        int verticalSpacing = 20; 
        int startX = 77;
        int startY = 40; 

        
            for (int row = 0; row < rows; row++) 
            {
                for (int col = 0; col < cols; col++) 
                {
                    if (deck.getNumCardsInDeck() == 0) 
                    {
                        return; 
                    }
    
                    int x = startX + col * (cardWidth + horizontalSpacing);
                    int y = startY + row * (cardHeight + verticalSpacing);
    
                    Card card = deck.getTopCard();
                    cardsOnBoard.add(card);
                    World world = getWorld();
                    if (world != null) 
                    {
                        world.addObject(card, x, y);
                    }
                }
        }
    }
    
    public void setUI() 
    {
        if (getWorld() == null)
        {
            return;
        }
        
        
        GreenfootImage cardsImage = new GreenfootImage(String.valueOf(numCardsInDeck), 24, Color.BLACK, new Color(255, 255, 255, 0));
        Actor cardsRemainingActor = new Actor() 
        {
            {
                setImage(cardsImage);
            }
        };
        getWorld().addObject(cardsRemainingActor, 315, 470);

        GreenfootImage scoreImage = new GreenfootImage(String.valueOf(Scorekeeper.getScore()), 24, Color.BLACK, new Color(255, 255, 255, 0));
        Actor scoreActor = new Actor() 
        {
            {
                setImage(scoreImage);
            }
        };
        getWorld().addObject(scoreActor, 315, 505);
            
    }
    
    public void endGame() 
    {
        // Implementation here
    }

    
    public boolean checkIfTriple(Card[] selectedCards)
    {
        Card one = selectedCards[0];
        Card two = selectedCards[1];
        Card three = selectedCards[2];
        
        if (one.getColor().ordinal() + two.getColor().ordinal() + three.getColor().ordinal() % 3 == 0 &&
        one.getShape().ordinal() + two.getShape().ordinal() + three.getShape().ordinal() % 3 == 0 &&
        one.getNumberOfShapes() + two.getNumberOfShapes() + three.getNumberOfShapes() % 3 == 0 &&
        one.getShading() + two.getShading() + three.getShading() % 3 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public void setCardsSelected(ArrayList<Card> cards, ArrayList<Integer> indices, Card[] selectedCards) {
        this.cardsSelected = selectedCards;
        this.selectedCardsIndex = indices;
    }

}
