package csci305.javalab;
import java.util.Random;

/**
 *
 * @author Taylor Koth
 */
public class MyBot extends Player{
    //This is this player's first time playing Rock, Paper, Scissors, Lizard, Spock.
    //It assumes that since Lizard and Spock are new, they must be super strong and will never lose. So it will always choose one or the other.
    //This bot is not smart.

    Random random = new Random();
    //We will use another array like we do in the Player class. This array will only have Lizard and Spock in it though
    Element [] choices = new Element[2];
    Lizard lizard = new Lizard("Lizard");
    Spock spock = new Spock("Spock");

    public MyBot(String name){
        super(name);
        choices[0] = lizard;
        choices[1] = spock;
    }

    @Override
    public Element Play(){
        int num = (int)(Math.random()*2);
        Element move = choices[num];
        return move;
    }

}
