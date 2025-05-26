// Signing in 
import java.util.Scanner;

public class Ps4Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your income in Lakhs per annum:");
        float income = sc.nextFloat();
        float tax = 0;

        if (income <= 2.5f) {
            tax = 0;
        } else if (income <= 5.0f) {
            tax = 0.05f * (income - 2.5f);
        } else if (income <= 10.0f) {
            tax = 0.05f * (5.0f - 2.5f);              // Tax for income between 2.5 to 5 lakhs
            tax += 0.2f * (income - 5.0f);            // Tax for income between 5 to current income
        } else {
            tax = 0.05f * (5.0f - 2.5f);              // 5% for 2.5L to 5L
            tax += 0.2f * (10.0f - 5.0f);             // 20% for 5L to 10L
            tax += 0.3f * (income - 10.0f);           // 30% for income above 10L
        }

        System.out.println("The total tax paid by the employee is: ₹" + tax + " lakhs");
    }
}
// Signing off