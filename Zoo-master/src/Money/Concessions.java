package Money;
import java.util.Scanner;
import Money.Wallet;
public class Concessions
{
    public static void displayMenu()
    {
        int choice;
        int pop = -3;
        int hotdog = -4;
        int candy = -2;
        int skittles = -6;
        int mystery_meat_pie = -7;
        int candy_thumbs = -4;
        Scanner input = new Scanner(System.in);
        m("Welcome, Feel free to order");
        m("1)Pop");
        m("2)hotdog");
        m("3)Chocolate bar");
        m("4)Skittles");
        m("5)Mystery meat pie");
        m("6)\"Candy\" thumbs");
        choice = input.nextInt();
        Wallet wallet1 = new Wallet();
        switch(choice)
        {
            case 1:
                wallet1.getWallet(pop);
                break;
            case 2:
                wallet1.getWallet(hotdog);
                break;
            case 3:
                wallet1.getWallet(candy);
                break;
            case 4:
                wallet1.getWallet(skittles);
                break;
            case 5:
                wallet1.getWallet(mystery_meat_pie);
                break;
            case 6:
                wallet1.getWallet(candy_thumbs);
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
