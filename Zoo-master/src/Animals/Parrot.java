

package Animals;
import Main.*;
import Types.*;
import Qualities.*;

/**
 * Write a description of class Parrot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Parrot extends Bird
{
    private String age;

    public Parrot()
    {
        super("Parrot", "Multi colored with mostly green, looks like it's dancing");
        this.age = "Young";
    }
    public String makeNoise()
    {
        return "Squaks and jums up and down";
    }

}
