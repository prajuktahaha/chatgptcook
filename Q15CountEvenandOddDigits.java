import java.util.Scanner;
public class Q15CountEvenandOddDigits {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the numbers : ");
        int n = sc.nextInt();
        int even = 0;
        int odd = 0;
        while(n>0){
            int digit = n % 10;
            n = n / 10;
            if(n % 2 == 0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Total Even numbers are : " + even);
        System.out.println("total Odd numebers are : " + odd);
    }
}
