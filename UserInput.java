import java.util.Scanner;
public class UserInput{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=sc.nextInt();
        System.out.println("Number is " +number);
    }
}