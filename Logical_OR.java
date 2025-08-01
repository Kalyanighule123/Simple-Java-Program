import java.util.Scanner;
public class Logical_OR{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First_number");
        int First_number=sc.nextInt();
        System.out.println("Enter the Second_number");
        int Second_number=sc.nextInt();
        int result=First_number | Second_number;
        System.out.println("Result is"+ " " +result);
    }
}