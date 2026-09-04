import java.util.Scanner;
public class Q6SumofOddNumbers {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        int odd = 0;
        int sum = 0;
        System.out.println("Enter the numbers : ");
        for(int i = 0 ; i < n ; i++){
            int numbers = sc.nextInt();
            if(numbers % 2 != 0){
                odd++;
                sum += numbers;
            }
        }
        System.out.println(" sum of odd numbers is " + sum);
    }
}
