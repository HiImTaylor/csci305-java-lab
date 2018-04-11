package csci305.javalab;

/**
 *
 * @author Taylor Koth
 */
public class StupidBot extends Player{
    //StupidBot plays the same move over and over. Hence the name "Stupid"Bot. I am going to have him play Lizard. Lizards are fun.

    public StupidBot(String name){
        super(name);
    }

    @Override
    public Element Play(){
        Element move = new Lizard("Lizard");
        return move;
    }
}
