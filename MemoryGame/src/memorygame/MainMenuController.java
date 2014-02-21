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
    
public MainMenuController() {}
        
    public void displayHelpBorder() {       
        System.out.println(
        "\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
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
    
     public void createPlayerList() {
        GetPlayersListView getPlayersListView = new GetPlayersListView();
        String[] listOfPlayersNames = getPlayersListView.getInput();
        
        // create the list of players named
        Player[] playerList = new Player[listOfPlayersNames.length];
                               
        for (int i = 0; i < playerList.length; i++) {
            String playersName = listOfPlayersNames[i];
            Player newPlayer = new Player();
            newPlayer.name = playersName;
            // add new player to player list
            playerList[i] = newPlayer;          
        }   
     }}
     

