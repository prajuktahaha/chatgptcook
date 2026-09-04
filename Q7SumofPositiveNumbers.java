import java.util.Scanner;
public class Q7SumofPositiveNumbers {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        int sum = 0;
        System.out.println("enter the numbers : ");
        for(int i = 0 ; i < n ; i++){
            int numbers = sc.nextInt();
            if(numbers > 0){
                sum = sum + numbers;
            }
        }
        System.out.println("the sum of the positive numbers in series is : " + sum);
    }
}
