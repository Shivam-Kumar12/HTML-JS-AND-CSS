
import java.util.Scanner;
public class second
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide number of rows to print... ");
        int n = scanner.nextInt();
        System.out.println("\nThe star pattern is... ");
        for (int i= 1; i<=n; i++)
        {
            for (int j= n; j>=i ; j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

