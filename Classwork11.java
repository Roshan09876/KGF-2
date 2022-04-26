import java.util.Scanner;

//Write a JAVA program to check whether a number is even or odd.
public class Classwork11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int a = sc.nextInt();
        if (a%2==0)
        {
            System.out.println("Number is even");
        }
        else
        {
            System.out.println("Number is odd");
        }
    }
}
