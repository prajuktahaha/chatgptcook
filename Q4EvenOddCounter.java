import java.util.Scanner;
public class Q4EvenOddCounter {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the value of n : ");
        int n = sc.nextInt();
        int even = 0;
        int odd = 0;
        System.out.println("Enter the numbers : ");
        for(int i = 0 ; i < n ; i++){
            int numbers = sc.nextInt();
            if(numbers % 2 == 0){
                even++;
                System.out.println("this number is even");
            }
            else{
                odd++;
                System.out.println("this number is odd");
            }
        }
        System.out.println("Even numbers occurance : " + even);
        System.out.println("Odd numbers occurance : " + odd);
    }
}
