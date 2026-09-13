import java.util.Scanner;
public class Q25gcdorhcf {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number : ");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd number : ");
        int b = sc.nextInt();
        int high = 1;
        for(int i = 1 ; i <= Math.min(a , b) ; i++){ 
            if(a % i == 0 && b % i == 0){
                if(i > high){
                    high = i;
                }
            }
        }
        System.out.println("The GCD of" + " " + a + " ; " + b + "is " + " " + high);
    }
}
