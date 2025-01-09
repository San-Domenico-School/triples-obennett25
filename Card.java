import greenfoot.*; 

/**
 * Game Board for Triples
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Card extends Actor
{
   private Shape shape;
   private Color color;
   private boolean isSelected;
   private GreenfootImage image, selectedImage;
   private int numberOfShapes, shading;
   
   public enum Shape
   {
       TRIANGLE, CIRCLE, SQUARE, NO_SHAPE;
   }
   
   public enum Color
   {
        RED, GREEN, BLUE, NO_COLOR;
   }
   
   public Card(Shape shape, Color color, int numberOfShapes, int shading, GreenfootImage cardImage, GreenfootImage selectedCardImage) 
   {
        this.shape = shape;
        this.color = color;
        this.numberOfShapes = numberOfShapes;
        this.shading = shading;
        this.image = cardImage;
        this.selectedImage = selectedCardImage;
        this.isSelected = false;
        setImage(cardImage);
    }
    
    public Shape getShape() 
    {
        return shape;
    }

    public Color getColor() 
    {
        return color;
    }

    public int getNumberOfShapes() 
    {
        return numberOfShapes;
    }

    public int getShading() 
    {
        return shading;
    }

    public GreenfootImage getCardImage() 
    {
        return image;
    }

    public GreenfootImage getSelectedCardImage() 
    {
        return selectedImage;
    }

    public boolean getIsSelected() 
    {
        return isSelected;
    }

    // Setter for isSelected
    public void setIsSelected(boolean isSelected) 
    {
        this.isSelected = isSelected;
    }
}

