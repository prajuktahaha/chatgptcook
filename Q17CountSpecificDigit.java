import java.util.Scanner;
public class Q17CountSpecificDigit {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        System.out.println("enter the target number : ");
        int target = sc.nextInt();
        int count = 0;
        while(n>0){
            int digit = n % 10;
            n = n/10;
            if(digit == target){
                count++;
            }
        }
        System.out.println("the target value" + " " + target + " " + "ocuured" + " " + count + " " + "times");
    }
}
