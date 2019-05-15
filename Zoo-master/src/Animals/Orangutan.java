

package Animals;
import Main.*;
import Types.*;
import Qualities.*;

/**
 * Write a description of class Orangutan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Orangutan extends Primate
{
    private String age;

    public Orangutan()
    {
        super("Orangutan", "Orange fur, Quite happy");
        this.age = "A little old";
    }
    public String makeNoise()
    {
        return "Ooks and eats bannana";
    }

}
