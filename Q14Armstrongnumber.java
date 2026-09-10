import java.util.Scanner;
public class Q14Armstrongnumber {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value : ");
        int n = sc.nextInt();
        int original = n;
        int sum = 0;
        while(n>0){
            int digits = n % 10;
            n = n/10;
            sum  = sum + (digits * digits * digits);
        }
        if(original == sum){
            System.out.println("Its an Amstrong number");
        }
        else{
            System.out.println("Its not an Amstrong number");
        }
    }
}
