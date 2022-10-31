//Print/Create username by entering email
import java.util.Scanner;
public class email
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the email for which you want to create a Username : ");
        String Email = in.nextLine();
        int x = Email.indexOf('@');
        String Username = new String();
        for(int  i = 0; i<x; i++)
        {
            Username += Email.charAt(i);
        }
        System.out.println("The Username created by the email you entered is : " + Username);
    }
}
