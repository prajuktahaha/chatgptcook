import java.util.Scanner;
public class Q27PerfectNumber {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input : ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1 ; i < n ; i++){
            if(n % i == 0){
                sum = sum + i;
            }
        }
        if(sum == n){
            System.out.println("Its a perfect number");
        }
        else{
            System.out.println("Its not a perfect number");
        }
    }
}
