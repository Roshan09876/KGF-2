import java.util.Scanner;

public class Simple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter principal: ");
        double P = scanner.nextInt();
        System.out.println("Enter time: ");
        double T = scanner.nextInt();
        System.out.println("Enter rate: ");
        double R = scanner.nextInt();
        double SI = (P*T*R)/100;
        System.out.println("The Simple Interest is :" +SI);


    }
}
