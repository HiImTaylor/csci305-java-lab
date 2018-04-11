package csci305.javalab;
import java.util.Scanner;

/**
 *
 * @author Taylor Koth
 */
public class Human extends Player{
    public Human(String name){
        super(name);
    }
    Scanner scanner = new Scanner(System.in);

    @Override
    public Element Play(){
        int choice = 0;
        while(choice < 1 || choice > 5){
            //Print out the list of options for the user.
            System.out.println("Please choose a move: \n" +
                    "(1) : Rock\n" +
                    "(2) : Paper\n" +
                    "(3) : Scissors\n" +
                    "(4) : Lizard\n" +
                    "(5) : Spock\n");

            choice = scanner.nextInt();
            //If the user input is bad, have them try again.
            if(choice < 1 || choice > 5){
                System.out.println("Invalid move. Please try again.");
            }
        }
        Element move = options[choice - 1];
        return move;
    }
}
