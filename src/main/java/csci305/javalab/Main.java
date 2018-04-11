package csci305.javalab;
import java.util.Scanner;
/**
 *
 * @author Taylor Koth
 */
public class Main {
    static Scanner scanner;

    /*Idea for game implementation:
    * Welcome the user to the game, and prompt the user to choose two players.
    * Create player objects based on the users inputs
    * Have the two players play vs each other 5 times
    * Each game, output the winner, and behind the scenes keep track
    * After the 5 games, announce the winner and exit program.
    */
    public static void main(String[] args) {
        int rounds = 5; //We are told we are to play 5 rounds
        System.out.println("Welcome to Rock, Paper, Scissors, Lizard, Spock, implemented by Taylor Koth.");
        System.out.println("Please choose two players: \n" +
                "   (1) Human\n" +
                "   (2) StupidBot\n" +
                "   (3) RandomBot\n" +
                "   (4) IterativeBot\n" +
                "   (5) LastPlayBot\n" +
                "   (6) MyBot\n");

        //first choice. Outsource the prompt to another method.
        System.out.print("Select Player 1: ");
        Player p1 = playerPrompt();
        //second choice. Outsource the prompt to another method. This saves alot of code by making a method call twice
        System.out.print("Select Player 2: ");
        Player p2 = playerPrompt();
        //the only bot that cares what the other person played is LastPlay bot. We need to set that up
        p1.opponent = p2;
        p2.opponent = p1;
        System.out.println("\n" + p1.getName() + " vs. " + p2.getName() + "\n");
        int curRound = 1;
        int p1Score = 0, p2Score =0;    //Set both player's round score to 0 at the start of the game.
        //let's play!
        while(curRound <= rounds){
            System.out.println("Round " + curRound + ": ");
            Element p1Play = p1.Play();
            Element p2Play = p2.Play();
            //Again, if lastPlayBot is playing, we need to update each players' last move
            p1.lastMove(p1Play);
            p2.lastMove(p2Play);

            System.out.println("Player 1 chose " + p1Play.getName());
            System.out.println("Player 2 chose " + p2Play.getName());

            String winner = (p1Play.compareTo(p2Play));

            String phrase = winner.substring(0, winner.indexOf('-'));
            System.out.println(phrase);

            //look to see who won the round
            //if player 1 wins, increment their score
            //if player 2 wins, do the same
            //This is formatted like the example output
            if(winner.contains("Tie")){
                System.out.println("Round was a tie");
            }else if(winner.contains("Win")){
                System.out.println("Player 1 won the round");
                p1Score++;
            }else if(winner.contains("Lose")){
                System.out.println("Player 2 won the round");
                p2Score++;
            }
            curRound++;
            System.out.println();
        }
        //display the score after the games This is formatted like the example output
        System.out.println("The score is " + p1Score + " to " + p2Score + ".");
        if(p1Score > p2Score){
            System.out.println("Player 1 wins!");
        }else if(p1Score < p2Score){
            System.out.println("Player 2 wins!");
        }else{
            System.out.println("The game ended in a draw.");
        }

    }

    public static Player playerPrompt(){
        int choice = -1;
        scanner = new Scanner(System.in);

        while(choice < 1 || choice > 6){
            choice = scanner.nextInt();
            if(choice < 1 || choice > 6){
                System.out.println("Error, please choos a valid option for a player.");
            }else{
                break;
            }
        }
        if(choice == 1){
            return new Human("Human");
        }else if(choice == 2){
            return new StupidBot("StupidBot");
        }else if(choice == 3){
            return new RandomBot("RandomBot");
        }else if(choice == 4){
            return new IterativeBot("IterativeBot");
        }else if(choice == 5){
            return new LastPlayBot("LastPlayBot");
        }else{
            return new MyBot("MyBot");
        }
    }
}
