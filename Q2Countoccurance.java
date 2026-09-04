import java.util.Scanner;
public class Q2Countoccurance {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        System.out.println("Enter your target number : ");
        int target = sc.nextInt();
        int count = 0;
        System.out.print("Enter the numbers : ");
        for(int i = 0 ; i < n ; i++){
            int number = sc.nextInt();
            if(number == target){
                count++;
            }
        }
        System.out.println("the number " + target + "ocuured" + count + "times");
    }
}
