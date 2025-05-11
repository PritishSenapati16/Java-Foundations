// Signing in
import java.util.Scanner;

public class Prog5 {
    public static void main(String[] args) {
        System.out.println("Taking Input From The User");

        Scanner sc = new Scanner(System.in);

        boolean b1 = sc.hasNextInt();
        System.out.println(b1);

        sc.close(); // Important: Close the Scanner to avoid resource leak
    }
}
// Signing off