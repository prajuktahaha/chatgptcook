import java.util.Scanner;
public class Q16ProductofDigits {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int product = 1;
        while(n>0){
            int digit = n % 10;
            n =  n / 10;
            product = product * digit;
        }
        System.out.println("the product of the number is : " + product);
    }
}
