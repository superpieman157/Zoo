package Animals;
import Main.*;
import Types.*;
import Qualities.*;
public class Alligator extends Reptile
{
    private String age;

    public Alligator()
    {
        super("Alligatot", "Greenish brown, looks calm but dangerous");
        this.age = "middle aged";
    }
    public String makeNoise()
    {
        return "Looks and hisses at you";
    }
    
}
