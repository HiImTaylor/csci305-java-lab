package csci305.javalab;

/**
 *
 * @author Taylor Koth
 */
public class Rock extends Element{
    //This class will be for Rock moves and will hold the Outcome override and use a switch block
    public Rock(String name){
        super(name);
    }

    @Override
    public String compareTo(Element x) {
        Outcome outcome = new Outcome(this, x);
        return outcome.outcome + " -- " + outcome.result;
    }

}
