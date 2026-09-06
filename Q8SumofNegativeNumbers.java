import java.util.Scanner;
public class Q8SumofNegativeNumbers {
    public static void main(String [] arms){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input value : ");
        int n = sc.nextInt();
        int sum = 0;
        System.out.println("Enter the numbers : ");
        for(int i = 0 ; i < n ; i++){
            int numbers = sc.nextInt();
            if(numbers < 0){
                sum = sum + numbers;
            }
        }
        System.out.println("the sum of negative numbers : " + sum);
    }
}
