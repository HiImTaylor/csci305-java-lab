package csci305.javalab;
import java.util.Random;
/**
 *
 * @author Taylor Koth
 */
public class RandomBot extends Player{
    //This bot is simply going to choose a move at random. Yay Math.random
    Random random = new Random();

    public RandomBot(String name){
        super(name);
    }

    @Override
    public Element Play(){
        int num = (int)(Math.random()*5);
        Element move = options[num];
        return move;
    }
}
