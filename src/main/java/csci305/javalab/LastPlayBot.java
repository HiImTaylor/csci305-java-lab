package csci305.javalab;

/**
 *
 * @author Taylor Koth
 */
public class LastPlayBot extends Player{
    //This bot will just play the move that the opponent last played.
    Boolean firstRound = true; //if it's the first round, it needs to have a hard coded move. I'm choosing Spock becuase Spock is cool.
    public LastPlayBot(String name){
        super(name);
    }

    @Override
    public Element Play(){
        if(firstRound == true){
            firstRound = false;
            return new Spock("Spock");
        }else{
            //this will use methods created in the Player class specifically for this bot
            return this.opponent.returnLastMove();
        }
    }
}
