package csci305.javalab;

/**
 *
 * @author Taylor Koth
 */
public class IterativeBot extends Player{
    //This bot will choose its next move by passing through the list of options 1 at a time

    private int current = 0; //where the bot is currently in the list

    public IterativeBot(String name){
        super(name);
    }

    @Override
    public Element Play(){
        if(current > 4){
            current = 0;
        }
        Element next = options[current];
        current++;
        return(next);
    }
}
