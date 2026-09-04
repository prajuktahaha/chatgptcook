import java.util.Scanner;
public class Q5sumofevennumbers {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input : ");
        int n = sc.nextInt();
        int sum = 0;
        int even = 0;
        System.out.println("Enter the numbers : ");
        for(int i = 0 ; i < n ; i++){
            int numbers = sc.nextInt();
            if(numbers % 2 == 0){
                even++;
                sum = sum + numbers;
            }
        }
        System.out.println("Sum of the even numbers is : " + sum);
    }
}
