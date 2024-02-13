import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter your age");

        int userAge = in.nextInt();

        if(userAge >= 21)
        {
            System.out.println("You get a wrist band");
        }
        else
        {

        }
    }
}