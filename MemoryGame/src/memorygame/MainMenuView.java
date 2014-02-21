/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package memorygame;

import java.util.Scanner;

/**
 *
 * @author Skylar
 */
public class MainMenuView {
private final static String[][] menuItems = {
        {"N", "Enter the names of the players"},
        {"A", "Start Game"},
        {"B", "Help Menu"},
        {"C", "Player"},
        {"Q", "Quit Help"}        
    };
    
    // Create instance of the HelpMenuControl (action) class
    private MainMenuController MainMenuController = new MainMenuController();
    
    // default constructor
    public MainMenuView() {
        
    } 
    
    // display the help menu and get the end users input selection
    public void getInput() {       
              
        String command;
        Scanner inFile = new Scanner(System.in);
        
        do {
            
            this.display(); // display the menu
            
            // get commaned entered
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
            switch (command) {
                case "A":
                    this.MainMenuController.displayStartGame();
                    break;
                case "B":
                    this.MainMenuController.displayHelpMenu();
                    break;                  
                case "C":
                    this.MainMenuController.displayPlayer();
                    break;
                case "N":
                    this.MainMenuController.createPlayerList();
                    break;
                case "Q": 
                    break;
                default: 
                    new MemoryGameError().displayError("Invalid command. Please enter a valid command.");
                    continue;
            }
        } while (!command.equals("Q"));  
        
         return;
    }

        // displays the help menu
    public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < MainMenuView.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }
  
}
 
