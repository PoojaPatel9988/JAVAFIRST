import java.util.Scanner;
/*
print table in any number.
 */
public class Table
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter starting number in table : ");
        int firstNumber= sc.nextInt();

        int middleNumber=1;

        System.out.print("enter ending number of table :");
        int endNumber=sc.nextInt();


        while(middleNumber <= endNumber)
        {
            int result = firstNumber * middleNumber;
            System.out.println(firstNumber + " x " + middleNumber + " = " + result);
            middleNumber++;
        }
    }
}

