import java.util.Scanner;
import java.util.Arrays;
public class Q32LargestElementinArray {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value : ");
        int n = sc.nextInt();
        int largest = Integer.MIN_VALUE;
        int [] arr = new int[n];
        System.out.println("Enter the elements : ");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        System.out.println("largest is : " + largest);
    }
}
