// Signing in
import java.util.Scanner;

public class Prog6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks of 5 subjects (out of 100):");

        System.out.print("Subject 1: ");
        int sub1 = sc.nextInt();

        System.out.print("Subject 2: ");
        int sub2 = sc.nextInt();

        System.out.print("Subject 3: ");
        int sub3 = sc.nextInt();

        System.out.print("Subject 4: ");
        int sub4 = sc.nextInt();

        System.out.print("Subject 5: ");
        int sub5 = sc.nextInt();

        int totalMarksGot = sub1 + sub2 + sub3 + sub4 + sub5; // Corrected variable name
        int totalMarks = 500; // 5 subjects * 100 marks each

        float percentage = (totalMarksGot * 100.0f) / totalMarks; // Corrected percentage formula

        System.out.println("Total Marks = " + totalMarksGot + " out of 500");
        System.out.println("Percentage = " + percentage + "%");

        sc.close();
    }
}
// Signing off