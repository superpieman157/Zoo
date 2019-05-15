package Types;
import Main.*;
import Qualities.Swimming;

public class Reptile extends Animal implements Swimming
{
    public Reptile()
    {
        super("Reptiles", "They swim through the water");
    }
    public Reptile(String name, String desc)
    {
        super(name, desc);
    }
    public String makeNoise()
    {
        return "Hissing";
    }
    public String eat()
    {
        return "Meat";
    }
    public String swim() {return "Swimming through the water";}


}


