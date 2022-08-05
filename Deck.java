/**
 * Write a description of class Deck here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import greenfoot.*;

public class Deck 
{
    /****************************************************
    ***   Leave as comment until ready to implement   ***
    *****************************************************
       
    private void populateUnshuffledDeckWithCards(int numOfCardsInDeck)        
    {
        mOrderedDeck[0] = new Card(Card.Shape.NO_SHAPE, Card.Color.NO_COLOR,0,0,
                new GreenfootImage("Triplets_0/blank_0_0_0.png"), 
                new GreenfootImage("Triplets_0/blank_0_0_0.png"));
        mOrderedDeck[1] = new Card(Card.Shape.CIRCLE, Card.Color.BLUE,1,0,
                new GreenfootImage("Triplets_0/circle_blue_1_0.png"), 
                new GreenfootImage("Triplets_0/circle_blue_1_0_selected.png"));
        mOrderedDeck[2] = new Card(Card.Shape.CIRCLE, Card.Color.BLUE,2,0,
                new GreenfootImage("Triplets_0/circle_blue_2_0.png"), 
                new GreenfootImage("Triplets_0/circle_blue_2_0_selected.png"));
        mOrderedDeck[3] = new Card(Card.Shape.CIRCLE, Card.Color.BLUE,3,0,
                new GreenfootImage("Triplets_0/circle_blue_3_0.png"), 
                new GreenfootImage("Triplets_0/circle_blue_3_0_selected.png"));
        mOrderedDeck[4] = new Card(Card.Shape.CIRCLE, Card.Color.GREEN,1,0,
                new GreenfootImage("Triplets_0/circle_green_1_0.png"), 
                new GreenfootImage("Triplets_0/circle_green_1_0_selected.png"));
        mOrderedDeck[5] = new Card(Card.Shape.CIRCLE, Card.Color.GREEN,2,0,
                new GreenfootImage("Triplets_0/circle_green_2_0.png"), 
                new GreenfootImage("Triplets_0/circle_green_2_0_selected.png"));
        mOrderedDeck[6] = new Card(Card.Shape.CIRCLE, Card.Color.GREEN,3,0,
                new GreenfootImage("Triplets_0/circle_green_3_0.png"), 
                new GreenfootImage("Triplets_0/circle_green_3_0_selected.png"));
        mOrderedDeck[7] = new Card(Card.Shape.CIRCLE, Card.Color.RED,1,0,
                new GreenfootImage("Triplets_0/circle_red_1_0.png"), 
                new GreenfootImage("Triplets_0/circle_red_1_0_selected.png"));
        mOrderedDeck[8] = new Card(Card.Shape.CIRCLE, Card.Color.RED,2,0,
                new GreenfootImage("Triplets_0/circle_red_2_0.png"), 
                new GreenfootImage("Triplets_0/circle_red_2_0_selected.png"));
        mOrderedDeck[9] = new Card(Card.Shape.CIRCLE, Card.Color.RED,3,0,
                new GreenfootImage("Triplets_0/circle_red_3_0.png"), 
                new GreenfootImage("Triplets_0/circle_red_3_0_selected.png"));
         mOrderedDeck[10] = new Card(Card.Shape.SQUARE, Card.Color.BLUE,1,0,
                new GreenfootImage("Triplets_0/square_blue_1_0.png"), 
                new GreenfootImage("Triplets_0/square_blue_1_0_selected.png"));
        mOrderedDeck[11] = new Card(Card.Shape.SQUARE, Card.Color.BLUE,2,0,
                new GreenfootImage("Triplets_0/square_blue_2_0.png"), 
                new GreenfootImage("Triplets_0/square_blue_2_0_selected.png"));
        mOrderedDeck[12] = new Card(Card.Shape.SQUARE, Card.Color.BLUE,3,0,
                new GreenfootImage("Triplets_0/square_blue_3_0.png"), 
                new GreenfootImage("Triplets_0/square_blue_3_0_selected.png"));
        mOrderedDeck[13] = new Card(Card.Shape.SQUARE, Card.Color.GREEN,1,0,
                new GreenfootImage("Triplets_0/square_green_1_0.png"), 
                new GreenfootImage("Triplets_0/square_green_1_0_selected.png"));
        mOrderedDeck[14] = new Card(Card.Shape.SQUARE, Card.Color.GREEN,2,0,
                new GreenfootImage("Triplets_0/square_green_2_0.png"), 
                new GreenfootImage("Triplets_0/square_green_2_0_selected.png"));
        mOrderedDeck[15] = new Card(Card.Shape.SQUARE, Card.Color.GREEN,3,0,
                new GreenfootImage("Triplets_0/square_green_3_0.png"), 
                new GreenfootImage("Triplets_0/square_green_3_0_selected.png"));
        mOrderedDeck[16] = new Card(Card.Shape.SQUARE, Card.Color.RED,1,0,
                new GreenfootImage("Triplets_0/square_red_1_0.png"), 
                new GreenfootImage("Triplets_0/square_red_1_0_selected.png"));
        mOrderedDeck[17] = new Card(Card.Shape.SQUARE, Card.Color.RED,2,0,
                new GreenfootImage("Triplets_0/square_red_2_0.png"), 
                new GreenfootImage("Triplets_0/square_red_2_0_selected.png"));
        mOrderedDeck[18] = new Card(Card.Shape.SQUARE, Card.Color.RED,3,0,
                new GreenfootImage("Triplets_0/square_red_3_0.png"), 
                new GreenfootImage("Triplets_0/square_red_3_0_selected.png"));
        mOrderedDeck[19] = new Card(Card.Shape.TRIANGLE, Card.Color.BLUE,1,0,
                new GreenfootImage("Triplets_0/triangle_blue_1_0.png"), 
                new GreenfootImage("Triplets_0/triangle_blue_1_0_selected.png"));
        mOrderedDeck[20] = new Card(Card.Shape.TRIANGLE, Card.Color.BLUE,2,0,
                new GreenfootImage("Triplets_0/triangle_blue_2_0.png"), 
                new GreenfootImage("Triplets_0/triangle_blue_2_0_selected.png"));
        mOrderedDeck[21] = new Card(Card.Shape.TRIANGLE, Card.Color.BLUE,3,0,
                new GreenfootImage("Triplets_0/triangle_blue_3_0.png"), 
                new GreenfootImage("Triplets_0/triangle_blue_3_0_selected.png"));
        mOrderedDeck[22] = new Card(Card.Shape.TRIANGLE, Card.Color.GREEN,1,0,
                new GreenfootImage("Triplets_0/triangle_green_1_0.png"), 
                new GreenfootImage("Triplets_0/triangle_green_1_0_selected.png"));
        mOrderedDeck[23] = new Card(Card.Shape.TRIANGLE, Card.Color.GREEN,2,0,
                new GreenfootImage("Triplets_0/triangle_green_2_0.png"), 
                new GreenfootImage("Triplets_0/triangle_green_2_0_selected.png"));
        mOrderedDeck[24] = new Card(Card.Shape.TRIANGLE, Card.Color.GREEN,3,0,
                new GreenfootImage("Triplets_0/triangle_green_3_0.png"), 
                new GreenfootImage("Triplets_0/triangle_green_3_0_selected.png"));
        mOrderedDeck[25] = new Card(Card.Shape.TRIANGLE, Card.Color.RED,1,0,
                new GreenfootImage("Triplets_0/triangle_red_1_0.png"), 
                new GreenfootImage("Triplets_0/triangle_red_1_0_selected.png"));
        mOrderedDeck[26] = new Card(Card.Shape.TRIANGLE, Card.Color.RED,2,0,
                new GreenfootImage("Triplets_0/triangle_red_2_0.png"), 
                new GreenfootImage("Triplets_0/triangle_red_2_0_selected.png"));
        mOrderedDeck[27] = new Card(Card.Shape.TRIANGLE, Card.Color.RED,3,0,
                new GreenfootImage("Triplets_0/triangle_red_3_0.png"), 
                new GreenfootImage("Triplets_0/triangle_red_3_0_selected.png"));
        if(mNumOfCardsInDeck > 27)
        {
            mOrderedDeck[28] = new Card(Card.Shape.CIRCLE, Card.Color.BLUE,1,1,
                    new GreenfootImage("Triplets_1/circle_blue_1_1.png"), 
                    new GreenfootImage("Triplets_1/circle_blue_1_1_selected.png"));
            mOrderedDeck[29] = new Card(Card.Shape.CIRCLE, Card.Color.BLUE,2,1,
                    new GreenfootImage("Triplets_1/circle_blue_2_1.png"), 
                    new GreenfootImage("Triplets_1/circle_blue_2_1_selected.png"));
            mOrderedDeck[30] = new Card(Card.Shape.CIRCLE, Card.Color.BLUE,3,1,
                    new GreenfootImage("Triplets_1/circle_blue_3_1.png"), 
                    new GreenfootImage("Triplets_1/circle_blue_3_1_selected.png"));
            mOrderedDeck[31] = new Card(Card.Shape.CIRCLE, Card.Color.GREEN,1,1,
                    new GreenfootImage("Triplets_1/circle_green_1_1.png"), 
                    new GreenfootImage("Triplets_1/circle_green_1_1_selected.png"));
            mOrderedDeck[32] = new Card(Card.Shape.CIRCLE, Card.Color.GREEN,2,1,
                    new GreenfootImage("Triplets_1/circle_green_2_1.png"), 
                    new GreenfootImage("Triplets_1/circle_green_2_1_selected.png"));
            mOrderedDeck[33] = new Card(Card.Shape.CIRCLE, Card.Color.GREEN,3,1,
                    new GreenfootImage("Triplets_1/circle_green_3_1.png"), 
                    new GreenfootImage("Triplets_1/circle_green_3_1_selected.png"));
            mOrderedDeck[34] = new Card(Card.Shape.CIRCLE, Card.Color.RED,1,1,
                    new GreenfootImage("Triplets_1/circle_red_1_1.png"), 
                    new GreenfootImage("Triplets_1/circle_red_1_1_selected.png"));
            mOrderedDeck[35] = new Card(Card.Shape.CIRCLE, Card.Color.RED,2,1,
                    new GreenfootImage("Triplets_1/circle_red_2_1.png"), 
                    new GreenfootImage("Triplets_1/circle_red_2_1_selected.png"));
            mOrderedDeck[36] = new Card(Card.Shape.CIRCLE, Card.Color.RED,3,1,
                    new GreenfootImage("Triplets_1/circle_red_3_1.png"), 
                    new GreenfootImage("Triplets_1/circle_red_3_1_selected.png"));
             mOrderedDeck[37] = new Card(Card.Shape.SQUARE, Card.Color.BLUE,1,1,
                    new GreenfootImage("Triplets_1/square_blue_1_1.png"), 
                    new GreenfootImage("Triplets_1/square_blue_1_1_selected.png"));
            mOrderedDeck[38] = new Card(Card.Shape.SQUARE, Card.Color.BLUE,2,1,
                    new GreenfootImage("Triplets_1/square_blue_2_1.png"), 
                    new GreenfootImage("Triplets_1/square_blue_2_1_selected.png"));
            mOrderedDeck[39] = new Card(Card.Shape.SQUARE, Card.Color.BLUE,3,1,
                    new GreenfootImage("Triplets_1/square_blue_3_1.png"), 
                    new GreenfootImage("Triplets_1/square_blue_3_1_selected.png"));
            mOrderedDeck[40] = new Card(Card.Shape.SQUARE, Card.Color.GREEN,1,1,
                    new GreenfootImage("Triplets_1/square_green_1_1.png"), 
                    new GreenfootImage("Triplets_1/square_green_1_1_selected.png"));
            mOrderedDeck[41] = new Card(Card.Shape.SQUARE, Card.Color.GREEN,2,1,
                    new GreenfootImage("Triplets_1/square_green_2_1.png"), 
                    new GreenfootImage("Triplets_1/square_green_2_1_selected.png"));
            mOrderedDeck[42] = new Card(Card.Shape.SQUARE, Card.Color.GREEN,3,1,
                    new GreenfootImage("Triplets_1/square_green_3_1.png"), 
                    new GreenfootImage("Triplets_1/square_green_3_1_selected.png"));
            mOrderedDeck[43] = new Card(Card.Shape.SQUARE, Card.Color.RED,1,1,
                    new GreenfootImage("Triplets_1/square_red_1_1.png"), 
                    new GreenfootImage("Triplets_1/square_red_1_1_selected.png"));
            mOrderedDeck[44] = new Card(Card.Shape.SQUARE, Card.Color.RED,2,1,
                    new GreenfootImage("Triplets_1/square_red_2_1.png"), 
                    new GreenfootImage("Triplets_1/square_red_2_1_selected.png"));
            mOrderedDeck[45] = new Card(Card.Shape.SQUARE, Card.Color.RED,3,1,
                    new GreenfootImage("Triplets_1/square_red_3_1.png"), 
                    new GreenfootImage("Triplets_1/square_red_3_1_selected.png"));
            mOrderedDeck[46] = new Card(Card.Shape.TRIANGLE, Card.Color.BLUE,1,1,
                    new GreenfootImage("Triplets_1/triangle_blue_1_1.png"), 
                    new GreenfootImage("Triplets_1/triangle_blue_1_1_selected.png"));
            mOrderedDeck[47] = new Card(Card.Shape.TRIANGLE, Card.Color.BLUE,2,1,
                    new GreenfootImage("Triplets_1/triangle_blue_2_1.png"), 
                    new GreenfootImage("Triplets_1/triangle_blue_2_1_selected.png"));
            mOrderedDeck[48] = new Card(Card.Shape.TRIANGLE, Card.Color.BLUE,3,1,
                    new GreenfootImage("Triplets_1/triangle_blue_3_1.png"), 
                    new GreenfootImage("Triplets_1/triangle_blue_3_1_selected.png"));
            mOrderedDeck[49] = new Card(Card.Shape.TRIANGLE, Card.Color.GREEN,1,1,
                    new GreenfootImage("Triplets_1/triangle_green_1_1.png"), 
                    new GreenfootImage("Triplets_1/triangle_green_1_1_selected.png"));
            mOrderedDeck[50] = new Card(Card.Shape.TRIANGLE, Card.Color.GREEN,2,1,
                    new GreenfootImage("Triplets_1/triangle_green_2_1.png"), 
                    new GreenfootImage("Triplets_1/triangle_green_2_1_selected.png"));
            mOrderedDeck[51] = new Card(Card.Shape.TRIANGLE, Card.Color.GREEN,3,1,
                    new GreenfootImage("Triplets_1/triangle_green_3_1.png"), 
                    new GreenfootImage("Triplets_1/triangle_green_3_1_selected.png"));
            mOrderedDeck[52] = new Card(Card.Shape.TRIANGLE, Card.Color.RED,1,1,
                    new GreenfootImage("Triplets_1/triangle_red_1_1.png"), 
                    new GreenfootImage("Triplets_1/triangle_red_1_1_selected.png"));
            mOrderedDeck[53] = new Card(Card.Shape.TRIANGLE, Card.Color.RED,2,1,
                    new GreenfootImage("Triplets_1/triangle_red_2_1.png"), 
                    new GreenfootImage("Triplets_1/triangle_red_2_1_selected.png"));
            mOrderedDeck[54] = new Card(Card.Shape.TRIANGLE, Card.Color.RED,3,1,
                    new GreenfootImage("Triplets_1/triangle_red_3_1.png"), 
                    new GreenfootImage("Triplets_1/triangle_red_3_1_selected.png"));
            if(mNumOfCardsInDeck > 54)
            {
                mOrderedDeck[55] = new Card(Card.Shape.CIRCLE, Card.Color.BLUE,1,2,
                        new GreenfootImage("Triplets_2/circle_blue_1_2.png"), 
                        new GreenfootImage("Triplets_2/circle_blue_1_2_selected.png"));
                mOrderedDeck[56] = new Card(Card.Shape.CIRCLE, Card.Color.BLUE,2,2,
                        new GreenfootImage("Triplets_2/circle_blue_2_2.png"), 
                        new GreenfootImage("Triplets_2/circle_blue_2_2_selected.png"));
                mOrderedDeck[57] = new Card(Card.Shape.CIRCLE, Card.Color.BLUE,3,2,
                        new GreenfootImage("Triplets_2/circle_blue_3_2.png"), 
                        new GreenfootImage("Triplets_2/circle_blue_3_2_selected.png"));
                mOrderedDeck[58] = new Card(Card.Shape.CIRCLE, Card.Color.GREEN,1,2,
                        new GreenfootImage("Triplets_2/circle_green_1_2.png"), 
                        new GreenfootImage("Triplets_2/circle_green_1_2_selected.png"));
                mOrderedDeck[59] = new Card(Card.Shape.CIRCLE, Card.Color.GREEN,2,2,
                        new GreenfootImage("Triplets_2/circle_green_2_2.png"), 
                        new GreenfootImage("Triplets_2/circle_green_2_2_selected.png"));
                mOrderedDeck[60] = new Card(Card.Shape.CIRCLE, Card.Color.GREEN,3,2,
                        new GreenfootImage("Triplets_2/circle_green_3_2.png"), 
                        new GreenfootImage("Triplets_2/circle_green_3_2_selected.png"));
                mOrderedDeck[61] = new Card(Card.Shape.CIRCLE, Card.Color.RED,1,2,
                        new GreenfootImage("Triplets_2/circle_red_1_2.png"), 
                        new GreenfootImage("Triplets_2/circle_red_1_2_selected.png"));
                mOrderedDeck[62] = new Card(Card.Shape.CIRCLE, Card.Color.RED,2,2,
                        new GreenfootImage("Triplets_2/circle_red_2_2.png"), 
                        new GreenfootImage("Triplets_2/circle_red_2_2_selected.png"));
                mOrderedDeck[63] = new Card(Card.Shape.CIRCLE, Card.Color.RED,3,2,
                        new GreenfootImage("Triplets_2/circle_red_3_2.png"), 
                        new GreenfootImage("Triplets_2/circle_red_3_2_selected.png"));
                 mOrderedDeck[64] = new Card(Card.Shape.SQUARE, Card.Color.BLUE,1,2,
                        new GreenfootImage("Triplets_2/square_blue_1_2.png"), 
                        new GreenfootImage("Triplets_2/square_blue_1_2_selected.png"));
                mOrderedDeck[65] = new Card(Card.Shape.SQUARE, Card.Color.BLUE,2,2,
                        new GreenfootImage("Triplets_2/square_blue_2_2.png"), 
                        new GreenfootImage("Triplets_2/square_blue_2_2_selected.png"));
                mOrderedDeck[66] = new Card(Card.Shape.SQUARE, Card.Color.BLUE,3,2,
                        new GreenfootImage("Triplets_2/square_blue_3_2.png"), 
                        new GreenfootImage("Triplets_2/square_blue_3_2_selected.png"));
                mOrderedDeck[67] = new Card(Card.Shape.SQUARE, Card.Color.GREEN,1,2,
                        new GreenfootImage("Triplets_2/square_green_1_2.png"), 
                        new GreenfootImage("Triplets_2/square_green_1_2_selected.png"));
                mOrderedDeck[68] = new Card(Card.Shape.SQUARE, Card.Color.GREEN,2,2,
                        new GreenfootImage("Triplets_2/square_green_2_2.png"), 
                        new GreenfootImage("Triplets_2/square_green_2_2_selected.png"));
                mOrderedDeck[69] = new Card(Card.Shape.SQUARE, Card.Color.GREEN,3,2,
                        new GreenfootImage("Triplets_2/square_green_3_2.png"), 
                        new GreenfootImage("Triplets_2/square_green_3_2_selected.png"));
                mOrderedDeck[70] = new Card(Card.Shape.SQUARE, Card.Color.RED,1,2,
                        new GreenfootImage("Triplets_2/square_red_1_2.png"), 
                        new GreenfootImage("Triplets_2/square_red_1_2_selected.png"));
                mOrderedDeck[71] = new Card(Card.Shape.SQUARE, Card.Color.RED,2,2,
                        new GreenfootImage("Triplets_2/square_red_2_2.png"), 
                        new GreenfootImage("Triplets_2/square_red_2_2_selected.png"));
                mOrderedDeck[72] = new Card(Card.Shape.SQUARE, Card.Color.RED,3,2,
                        new GreenfootImage("Triplets_2/square_red_3_2.png"), 
                        new GreenfootImage("Triplets_2/square_red_3_2_selected.png"));
                mOrderedDeck[73] = new Card(Card.Shape.TRIANGLE, Card.Color.BLUE,1,2,
                        new GreenfootImage("Triplets_2/triangle_blue_1_2.png"), 
                        new GreenfootImage("Triplets_2/triangle_blue_1_2_selected.png"));
                mOrderedDeck[74] = new Card(Card.Shape.TRIANGLE, Card.Color.BLUE,2,2,
                        new GreenfootImage("Triplets_2/triangle_blue_2_2.png"), 
                        new GreenfootImage("Triplets_2/triangle_blue_2_2_selected.png"));
                mOrderedDeck[75] = new Card(Card.Shape.TRIANGLE, Card.Color.BLUE,3,2,
                        new GreenfootImage("Triplets_2/triangle_blue_3_2.png"), 
                        new GreenfootImage("Triplets_2/triangle_blue_3_2_selected.png"));
                mOrderedDeck[76] = new Card(Card.Shape.TRIANGLE, Card.Color.GREEN,1,2,
                        new GreenfootImage("Triplets_2/triangle_green_1_2.png"), 
                        new GreenfootImage("Triplets_2/triangle_green_1_2_selected.png"));
                mOrderedDeck[77] = new Card(Card.Shape.TRIANGLE, Card.Color.GREEN,2,2,
                        new GreenfootImage("Triplets_2/triangle_green_2_2.png"), 
                        new GreenfootImage("Triplets_2/triangle_green_2_2_selected.png"));
                mOrderedDeck[78] = new Card(Card.Shape.TRIANGLE, Card.Color.GREEN,3,2,
                        new GreenfootImage("Triplets_2/triangle_green_3_2.png"), 
                        new GreenfootImage("Triplets_2/triangle_green_3_2_selected.png"));
                mOrderedDeck[79] = new Card(Card.Shape.TRIANGLE, Card.Color.RED,1,2,
                        new GreenfootImage("Triplets_2/triangle_red_1_2.png"), 
                        new GreenfootImage("Triplets_2/triangle_red_1_2_selected.png"));
                mOrderedDeck[80] = new Card(Card.Shape.TRIANGLE, Card.Color.RED,2,2,
                        new GreenfootImage("Triplets_2/triangle_red_2_2.png"), 
                        new GreenfootImage("Triplets_2/triangle_red_2_2_selected.png"));
                mOrderedDeck[81] = new Card(Card.Shape.TRIANGLE, Card.Color.RED,3,2,
                        new GreenfootImage("Triplets_2/triangle_red_3_2.png"), 
                        new GreenfootImage("Triplets_2/triangle_red_3_2_selected.png"));
                }
          }
    }
    
    **************  END OF COMMENT BLOCK  ***************/
}
