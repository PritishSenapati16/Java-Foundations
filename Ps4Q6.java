// Signing in 
import java.util.Scanner;
public class Ps4Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Website = sc.next();

        if(Website.endsWith(".com")){
            System.out.println("A Commercial Website");
        }
        else if(Website.endsWith(".org")){
            System.out.println("An Organizational Website");
        }
        else if(Website.endsWith(".in")){
            System.out.println("An Indian Website");
        }
    }
}
// Signing off