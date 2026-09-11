import java.util.Scanner;
public class Q21SumofOddDigits {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        int sum = 0;
        while(n>0){
            int digit = n % 10;
            n = n / 10;
            if(digit % 2 != 0){
                sum = sum + digit;
            }
        }
        System.out.println("Sum of the odd digits : " + sum);
    }
}
