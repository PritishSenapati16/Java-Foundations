// Signing in  
import java.util.Scanner;

public class Ps1Q3 {
    public static void main(String[] args) {
        System.out.println("What is your name?");
        
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine(); // Use nextLine() to capture full name if needed
        
        System.out.println("Hello " + name + ", have a good day!");
        
        sc.close();
    }
}
// Signing off 