import java.util.Scanner;
public class Q26LCM {
    public static void main(String [] args){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        int a  = sc.nextInt();
        System.out.println("Enter the value of b : ");
        int b = sc.nextInt();
        int x = a;
        int y = b;
        while(a > 0){
            int t = b % a;
            b = a;
            a = t;
        }
        int lcm = ( x * y / b);
        System.out.println("The LCM is " + " " + lcm);
    }
}
