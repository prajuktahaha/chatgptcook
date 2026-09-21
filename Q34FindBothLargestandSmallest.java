import java.util.Scanner;
import java.util.Arrays;
public class Q34FindBothLargestandSmallest {
    public static void main(String[]main){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        System.out.println("Enter the elements : ");
        int [] arr = new int[n];
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
            if(arr[i] > largest){
                largest = arr[i];
            }
            if(arr[i] < smallest){
                smallest = arr[i];
                
            }
        }
        System.out.println ("largest is : " + largest);
        System.out.println("smallest is : " + smallest);
    }
}
