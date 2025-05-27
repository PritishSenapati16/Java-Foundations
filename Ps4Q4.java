// Signing in 
import java.util.Scanner;
public class Ps4Q4 {
    public static void main(String[] args) {
        System.out.println("Enter The Number");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        switch (day){
            
            case 1 -> System.out.println("MONDAY");
            case 2 -> System.out.println("TUESDAY");
            case 3 -> System.out.println("WEDNESDAY");
            case 4 -> System.out.println("THURSDAY");
            case 5 -> System.out.println("FRIDAY");
            case 6 -> System.out.println("SATURDAY");
            case 7 -> System.out.println("SUNDAY");
        }
        System.out.println("END OF THE PROGRAM");
    }
}
// Signing off     
