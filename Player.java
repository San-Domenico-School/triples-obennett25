import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;


/**
 * This is the User. It interacts with the Dealer and handles selecting cards,
 * managing the selected cards, and resetting card selections.
 * 
 * @author Oliver Bennett
 * @version 1/28/25
 */
public class Player extends Actor
{
    
    Dealer dealer = new Dealer(81);
    private Card[] cardsSelected = new Card[3];;
    private ArrayList<Card> cardsOnBoard;
    private ArrayList<Integer> selectedCardsIndex = new ArrayList<>();;
    
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        selectCards();
        boolean threeCardsHaveBeenSelected = setCardsSelect();
        if (threeCardsHaveBeenSelected) 
        {
            dealer.setCardsSelected(cardsOnBoard, selectedCardsIndex, cardsSelected);
            dealer.checkIfTriple(cardsSelected);
            resetCardsSelected();
        }
    }
    
    public void addedToWorld(World world)
    {
        cardsOnBoard = (ArrayList) getWorld().getObjects(Card.class);
    }
    
    private void selectCards() 
    {
        for (int i = 0; i < cardsOnBoard.size(); i++)
        {
            Card card = cardsOnBoard.get(i);
            
                if (Greenfoot.mouseClicked(card)) 
                {
                    if (selectedCardsIndex.contains(i)) 
                    {
                        
                        card.setIsSelected(false); 
                        card.setImage(card.getCardImage()); 
                        selectedCardsIndex.remove(Integer.valueOf(i)); 
                        } else 
                        {
                        
                        card.setIsSelected(true); 
                        card.setImage(card.getSelectedCardImage());
                        selectedCardsIndex.add(i); 
                }
            
            }
        }
    }
    
    private void resetCardsSelected() 
    {
        for (Card card : cardsOnBoard) 
        {
            card.setImage(card.getCardImage());
    
            card.setIsSelected(false);
        }

        selectedCardsIndex.clear();
    }
    
    private boolean setCardsSelect() 
    {
        if (selectedCardsIndex.size() == 3) 
        {
        
            for (int i = 0; i < 3; i++) 
            {
                int index = selectedCardsIndex.get(i); 
                cardsSelected[i] = cardsOnBoard.get(index); 
            }
            return true; 
        } 
        else 
        {
            return false;
        }
    }
    
}
