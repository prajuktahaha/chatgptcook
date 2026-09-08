import java.util.Scanner;
public class Q10Reverseanumber {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int rev = 0;
        while(n>0){
            int digit = n % 10 ;
            n = n / 10;
            rev = rev*10+digit;
        }
        System.out.println(rev);
    }
}
