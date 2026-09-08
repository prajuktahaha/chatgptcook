import java.util.Scanner;
public class Q11SumofDigits {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the value : ");
        int n = sc.nextInt();
        int sum = 0 ;
        while(n>0){
            int digit = n % 10;
            n = n / 10;
            sum = sum + digit;
        }
        System.out.println("sum of digits : " + sum);
    }
}
