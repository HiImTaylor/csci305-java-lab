package csci305.javalab;

/**
 *
 * @author Isaac Griffith
 */
public class TestElements {
    //This class was made by instructor Isaac Griffith to test Element

    public static void main(String args[]) {
    Element rock = new Rock("Rock");
    Element paper = new Paper("Paper");
    System.out.println(rock.compareTo(paper));
    System.out.println(paper.compareTo(rock));
    System.out.println(rock.compareTo(rock));
  }
}
