import java.util.Scanner;
import java.util.Arrays;
public class Q51LinearSearch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        System.out.println("enter the target : ");
        int target = sc.nextInt();
        int index = -1;
        int [] arr = new int[n];
        System.out.println("Enter the elements:");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
            if(arr[i] == target){
                index = i;
            }
        }
        System.out.println("The target number is at index : " + index);
    }
}