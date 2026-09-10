import java.util.Scanner;
public class Q13PalindromeNumbers {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the value : ");
        int n = sc.nextInt();
        int original = n;
        int rev = 0;
        while(n>0){
            int digit = n % 10;
            n = n / 10;
            rev = rev * 10 + digit;
        }
        if(original == rev){
            System.out.println ( rev + " , Its a plaindrome");
        }
        else{
            System.out.println("Its not an palindrome");
        }    
    }
}
