import java.util.Scanner;

public class ReverseNumber
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter starting point of reverse number : ");
        int reverseNumber=sc.nextInt();

        int num=reverseNumber;

        while( num >= 1 )
        {
            System.out.println(num);
            num--;
        }
    }
}