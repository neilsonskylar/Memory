package memorygame;

import java.util.Scanner;

/**
 *
 * @author Skylar
 */
public class MemoryGame {
    String name;
    String instructions = "This is the memory game. You must begin by selecting two boxes 1)by selecting \n"
            +"the letter column with the number row to select the square to be turned over. After the first \n"
            + "selection press enter and then select your second option and press enter again. If the two \n"
            + "squares are the same then the squares stay facing up. If the squares are not a match then they \n"
            + "flip back over until they are matched with their pair. \n";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      MemoryGame myGame = new MemoryGame();
      myGame.getName();
      myGame.displayHelp();
        // TODO code application logic here
    }
    public void getName(){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your name: ");
    this.name = input.next();
    }
    
    public void displayHelp() {
        System.out.println("\nWelcome " + this.name + "\n");
        System.out.println(this.instructions);
    }
    
}
