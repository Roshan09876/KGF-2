//Write a program to take two integer inputs from user and print sum and product of them.
import java.util.Scanner;

public class Classwork4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first number :");
        int a = sc.nextInt();
        System.out.println("Enter a second number :");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("The sum of two integer is :" +sum);
        int product = a*b;
        System.out.println("The product of two integer is :" +product);
    }
}
