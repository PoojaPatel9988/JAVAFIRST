import java.util.Scanner;
/*
print even number for 1 to N.
 */
public class EvenOddNumber

{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num1,num2;
        num1=2;   //num1=1;(print odd number all program same)

        System.out.println("enter ending number of even number : ");
        num2=sc.nextInt();

        while(num1 <= num2)
        {
            System.out.println(num1 );
            num1 += 2;
        }
    }
}