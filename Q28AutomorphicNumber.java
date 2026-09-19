import java.util.Scanner;
public class Q28AutomorphicNumber {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int product = n*n;
        int digit = 0;
        int temp = n;
        while( temp > 0){
            temp = temp / 10;
            digit++;
        }
        int divisor = 1;
        for(int i = 0 ; i < digit ; i++){
            divisor = divisor * 10;
        }
        int lastPart = product % divisor;
        if (lastPart == n){
            System.out.println(n + " is a Automorphic number");
        }
        else{
            System.out.println(n + " is not a Automorphic number");
        }
    }
}
