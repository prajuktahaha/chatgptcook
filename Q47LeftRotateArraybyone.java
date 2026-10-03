import java.util.*;
import java.util.Arrays;
public class Q47LeftRotateArraybyone {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the array elements :  ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int temp = arr[0];
        for(int i = 1 ; i < n ; i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
        System.out.println((Arrays.toString(arr)));
    }
}
