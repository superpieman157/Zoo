package Animals;
import Main.*;
import Types.*;
import Qualities.*;

public class Ring_Tailed_Lemurs extends Primate
{
    private String age;

    public Ring_Tailed_Lemurs()
    {
        super("Lemur", "Gray with black stripes on its tail, Its jumping all over the place");
        this.age = "middle aged";
    }
    public String makeNoise()
    {
        return "It loves to jump all over";
    }

}
