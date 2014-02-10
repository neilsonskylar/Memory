/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memorygame;

/**
 *
 * @author Skylar
 */
public class MainMenuController {
    
public MainMenuController() {
        
    } 

    public void displayStartGame() {
        System.out.println();
        this.displayHelpBorder();             
        System.out.println( 
                "\t Start Game.");
        displayHelpBorder();
    }
    
    
        
    public void displayHelpMenu() {
        System.out.println();
        displayHelpBorder();     
        System.out.println();
        HelpMenuView mainMenu = new HelpMenuView();

        mainMenu.getInput();
        displayHelpBorder();
    }
            
    public void displayPlayer() {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
                "\t Player Input "
                 ); 
        displayHelpBorder();
    }
    
        

                     
    
    public void displayHelpBorder() {       
        System.out.println(
        "\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }    
}
