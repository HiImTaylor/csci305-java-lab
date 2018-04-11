package csci305.javalab;

/**
 *
 * @author Taylor Koth
 */
public abstract class Player {
    private String name;
    private Element lastMove;
    public Player opponent;

    //create a list of all possible moves for future use
    Element [] options = new Element[5];
    Rock rock = new Rock("Rock");
    Paper paper = new Paper("Paper");
    Scissors scissors = new Scissors("Scissors");
    Lizard lizard = new Lizard("Lizard");
    Spock spock = new Spock("Spock");

    public Player(String name){
        this.name = name;
        //populate the list with the options for moves
        options[0] = rock;
        options[1] = paper;
        options[2] = scissors;
        options[3] = lizard;
        options[4] = spock;
    }

    public String getName(){
        return this.name;
    }

    //We need to keep track of our last move so that the LastPlayBot can work
    public void lastMove(Element move){
        lastMove = move;
    }

    //This simply returns our last move for the LastPlayBot
    public Element returnLastMove(){
        return lastMove;
    }

    public abstract Element Play();
}
