import java.util.Scanner;
public class Q18FindLargestdigit {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int largest = 0;
        while(n>0){
            int digit = n % 10;
            n = n / 10;
            if(digit > largest){
                largest = digit;
            }
        }
        System.out.println("The Largest number is : " + " " + largest);
    }
}
