//euclidean algorithm
import java.util.Scanner;
public class Q25gcdorhcf {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number : ");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd number : ");
        int b = sc.nextInt();
        while(b > 0){
            int t = a % b;
            a = b;
            b = t;
        }
        System.out.println("The GCD is  : " + a);
    }
}