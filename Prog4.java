// Signing in
import java.util.Scanner;
public class Prog4 {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        Scanner sc = new Scanner(System.in);    
        System.out.println("Enter num 1");
        int a = sc.nextInt();
        System.out.println("Enter num 2");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("The sum of these numbers is");
        System.out.println(sum);
        sc.close();
    }
}
// Signing off

