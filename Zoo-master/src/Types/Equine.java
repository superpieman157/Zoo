package Types;
import Main.*;
import Qualities.*;
public class Equine extends Animal implements Walking
{
    public Equine()
    {
        super("Horses", "They Gallop across the enclosure");
    }
    public Equine(String name, String desc)
    {
        super(name, desc);
    }
    public String makeNoise()
    {
        return "Neigh";
    }
    public String eat()
    {
        return "Grass";
    }
    public String walk() {return "Galloping in circles?";}
}
