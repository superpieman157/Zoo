
package Animals;
import Main.*;
import Types.*;
import Qualities.*;


/**
 * Write a description of class Ring_Tailed_Lemurs here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zebra extends Primate
{
    private String age;

    public Zebra()
    {
        super("Zebra", "White with black stripes? or the other way round, It's eating grass");
        this.age = "Youngish";
    }
    public String makeNoise()
    {
        return "It goes neigh and eats grass";
    }

}
