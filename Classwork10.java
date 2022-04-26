import java.util.Scanner;

//Write a JAVA program to check whether a number is divisible by 5 and 11 or not.
public class Classwork10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        if ((a%5==0)&&(a%11==0))
        {
            System.out.println("Divisible by 5 and 11");
        }
        else
        {
            System.out.println("Cannot divisible by 5 & 11");
        }
    }
}