
import java.util.Scanner;

public class Quiz3{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = Sc.nextInt();

        int i = 1; // Start from 1 (first natural number)

        System.out.println("\n🌱 First " + n + " natural numbers:");

        do {
            System.out.println(i);
            i++;
        } while (i <= n);

        Sc.close();
    }
}
