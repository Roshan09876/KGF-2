import java.util.Scanner;

//Write a JAVA program to find maximum between two numbers.
public class Classwork7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int a = sc.nextInt();
        System.out.println("Enter the second number :");
        int b = sc.nextInt();
        if (a>b)
        {
            System.out.println("a is the maximum number");
        }
        else {
            System.out.println("b is the maximum number");
        }
    }
}
