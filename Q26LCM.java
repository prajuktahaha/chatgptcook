import java.util.Scanner;
public class Q26LCM {
    public static void main(String [] args){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        int a  = sc.nextInt();
        System.out.println("Enter the value of b : ");
        int b = sc.nextInt();
        int high = 1;
        for(int i = 1 ; i <= Math.min(a , b) ; i++){ 
         while(a != 0){
            int t = b % a;
            b = a;
            a = t;
          }
        }
        int lcm = (a*b / high);
        System.out.println("The LCM is " + " " + lcm);
    }
}
