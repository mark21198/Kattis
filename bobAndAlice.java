import java.util.Scanner;
public class bobAndAlice
{
    public static void main(String[]args)
    {
       Scanner scan = new Scanner(System.in);
       int a = scan.nextInt();
       if (a%2==0)
       {
           System.out.println("Bob");
       }
       else
       {
           System.out.println("Alice");
       }
    }
}
