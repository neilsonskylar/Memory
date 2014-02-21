/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memory.game;

/**
 *
 * @author Aaron
 */
public class Grid {
   private Card[] cards;
   
}
int indx;
        	for (int r = 0 ; r < SIZE ; r++)
        	{
              	for (int c = 0 ; c < SIZE ; c++)
              	{
                    	indx = r * SIZE + c;
                    	card [indx] = new Card ();
              	  	. . .
              	}
        	}

         
         for (int i = 1 ; i <= SIZE * SIZE / 2 ; i++)
        	{
              	for (int j = 0 ; j < 2 ; j++)
              	{
                    	do
                    	{
                          	indx = (int) (Math.random () * SIZE * SIZE);
                    	}
                    	while (card [indx].getValue () != 0);
                    	card [indx].setValue (i);
              	}
        	}
