// Signing in 
import java.util.Scanner;

public class Ps4Q2 {
    public static void main(String[] args) {
        byte m1,m2,m3 ;
        System.out.println("Enter Your Marks");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your marks in subject 1");
        m1 = sc.nextByte();
        System.out.println("Enter your marks in subject 2");
        m2= sc.nextByte();
        System.out.println("Enter your marks in subject 3");
        m3 = sc.nextByte();

        float avg = (m1+m2+m3)/3.0f;
        System.out.println(avg);
        if(m1>=33 && m2>=33 && m3>=33 && avg>=40){
            System.out.println("Congo, You are paromoted");
        }
        else{
            System.out.println("You are not promoted");
        }
    }
}
// Signing off 
