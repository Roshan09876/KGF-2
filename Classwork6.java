//Ask user to give two double input for length and breadth of a rectangle and print area type casted to int,
import java.util.Scanner;

public class Classwork6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of rectangle :");
        int a = sc.nextInt();
        System.out.println("Enter the breadth of rectangle :");
        int b = sc.nextInt();
        int area = (a*b)/2;
        System.out.println("The area of rectangle is :" +area);
    }
}
