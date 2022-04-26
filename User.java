import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        System.out.println("Enter the second number:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = num1 + num2;
        System.out.println(num3);
        System.out.println("The sum of two number is : " +num3);




    }
}
