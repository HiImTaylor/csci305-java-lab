package csci305.javalab;

/**
 *
 * @author Taylor Koth
 *
 */
public abstract class Element {
    //This is a super class that will be used for the in game moves.
    private String name;

    public Element(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public abstract String compareTo(Element e);
}
