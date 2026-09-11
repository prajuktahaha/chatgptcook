import java.util.Scanner;
public class Q22Countdigitsgreaterthan5 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value : ");
        int n = sc.nextInt();
        int count = 0;
        while(n>0){
            int digit = n % 10;
            n = n / 10;
            if(digit > 5){
                count++;
            }
        }
        System.out.println("number of digits greater than 5 is " + count);
    }
}
