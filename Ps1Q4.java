// Signing in
import java.util.Scanner;

public class Ps1Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance in kilometers: ");
        double kilometers = sc.nextDouble();

        double miles = kilometers * 0.621371; // 1 kilometer = 0.621371 miles

        System.out.println(kilometers + " kilometers is equal to " + miles + " miles.");

        sc.close();
    }
}
// Signing off
