// Signing in 
import java.util.Scanner;
public class Prog15 {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter your age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if (age>36){
            System.out.println("You are noob");
        }
        else if(age>46){
            System.out.println("You are pro");
        }
        else if(age>66){
            System.out.println("You are hacker");
        }
        else{
            System.out.println("Get out");
        }
    }
}
// Signing off 