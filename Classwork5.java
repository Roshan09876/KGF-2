//Take two integer inputs from user.First calculate the sum of two then product.
//Finally,calculate the division of thus obtained sum and product and  print the result.
import java.util.Scanner;

public class Classwork5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first number :");
        int a = sc.nextInt();
        System.out.println("Enter a second number :");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("The sum is :" +sum);
        int product = a*b;
        System.out.println("The product is :" +product);
        double division = sum/product;
        System.out.println("The division of thus obtained sum and product is ;" +division);

    }
}
