package Money;
import java.util.Scanner;
import Money.Wallet;
public class gift_Shop
{
    public static void items()
    {
        int choice;
        int car = -3;
        int stuffed_animal = -4;
        int yoyo = -2;
        int a_bear = -6;
        int a_fish = -2;
        int candy = -3;
        Scanner input = new Scanner(System.in);
        m("Welcome, Feel free to look around");
        m("1)Toy car");
        m("2)Stuffed animal");
        m("3)A yoyo");
        m("4)A bear with a human face..?");
        m("5)A fish with a star pattern");
        m("6)Candy!");
        choice = input.nextInt();
        Wallet wallet1 = new Wallet();
        switch(choice)
        {
            case 1:
                wallet1.getWallet(car);
                break;
            case 2:
                wallet1.getWallet(stuffed_animal);
                break;
            case 3:
                wallet1.getWallet(yoyo);
                break;
            case 4:
                wallet1.getWallet(a_bear);
                break;
            case 5:
                wallet1.getWallet(a_fish);
                break;
            case 6:
                wallet1.getWallet(candy);
                break;
            default :
                m("We don't sell that");
        }
    }
    public static void m(String m)
    {
        System.out.println(m);
    }
}
