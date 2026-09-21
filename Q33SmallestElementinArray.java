import java.util.Scanner;
import java.util.Arrays;
public class Q33SmallestElementinArray {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the value n  : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        int smallest = Integer.MAX_VALUE;
        System.out.println("Enter the elements : ");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
        System.out.println("Smallest is : " + " " + smallest);
    }
}
