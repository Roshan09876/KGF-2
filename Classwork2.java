//Write a program to calculate sum of four numbers taking user input
import java.util.Scanner;

public class Classwork2 {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int a = var.nextInt();
        System.out.println("Enter the second number :");
        int b = var.nextInt();
        System.out.println("Enter the third number :");
        int c = var.nextInt();
        System.out.println("Enter the fourth number :");
        int d = var.nextInt();
        int sum = a+b+c+d;
        System.out.println("The sum of four number is :" + sum);

    }
}
