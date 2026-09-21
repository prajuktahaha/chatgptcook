import java.util.Scanner;
import java.util.Arrays;
public class ArraysBeginners{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements : ");
        int [] arr = new int[n];
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
}