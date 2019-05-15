package Types;
import Qualities.Flying;
import Main.*;

public class Bird extends Animal implements Flying
{
    public Bird()
    {
        super("Birds", "They fly around up in the sky");
    }
    public Bird(String name, String desc)
    {
        super(name, desc);
    }
    public String makeNoise()
    {
        return "Squaking noise";
    }
    public String eat()
    {
        return "Worms, and seeds";
    }
    public String fly() {return "Flying like a beautiful bird";}


}


