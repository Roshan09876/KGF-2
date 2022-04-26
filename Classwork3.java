//Write a program to take input of the total marks of four subjects of a student and calculate the total percentage
//secured then display the percentage and final result of the student;
//if more than equals to 70=> First class
//if more ethan equals to 59=> Second class
//if more ethan equals to 49=> Third class and if below than 40 the result
import java.util.Scanner;

public class Classwork3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of subject Math :");
        int a = sc.nextInt();
        System.out.println("Enter marks of subject English :");
        int b = sc.nextInt();
        System.out.println("Enter marks of subject Nepali :");
        int c = sc.nextInt();
        System.out.println("Enter marks of subject Science :");
        int d = sc.nextInt();
        double percentage = ((double) ((a + b + c + d) * 100) / 400);
        System.out.println("Percentage is :" + percentage);
        if (percentage >= 70)
        {
            System.out.println("First class");
        }
        else if(percentage>=59){
            System.out.println("Second class");
        }
        else if(percentage>=49){
            System.out.println("Third class");
        }
        else{
            System.out.println("You are fail");
        }

        }


    }

