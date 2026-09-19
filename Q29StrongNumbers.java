import java.util.Scanner;
public class Q29StrongNumbers {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        while( temp > 0){
           int digit = temp % 10;
           temp = temp / 10;
           int extracted = 1;
        
           for(int i = 1 ; i <= digit  ; i++){
              extracted = extracted * i;
            }
            sum = sum + extracted;
        }
        if(sum == n){
            System.out.println("Its a Strong number");
        }
        else{
            System.out.println("Its not a Strong Number");
        }
    }
}
