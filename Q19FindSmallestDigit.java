import java.util.Scanner;
public class Q19FindSmallestDigit {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int smallestdigit = Integer.MAX_VALUE;
        while(n>0){
            int digit = n % 10;
            n = n / 10;
            if (smallestdigit > digit){
                smallestdigit = digit;
            }
        }
        System.out.println("smallest number is "  + smallestdigit);
    }
}
