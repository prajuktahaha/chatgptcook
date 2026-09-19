import java.util.Scanner;
public class Q30SpyNumbers {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int sum = 0;
        int product = 1;
        int t = n;
        while(t > 0){
            int digit = t % 10;
            t = t / 10;
            sum  = sum + digit;
            product = product * digit;
        }
        if( sum == product){
            System.out.println("Its a Spy Number");
        }
        else{
            System.out.println("No its not a Spy Number");
        }
    }
}
