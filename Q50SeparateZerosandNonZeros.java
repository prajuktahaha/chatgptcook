import java.util.Arrays;
import java.util.Scanner;
public class Q50SeparateZerosandNonZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        int position = n - 1;
        System.out.println("Enter the elements : ");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = n - 1 ; i >= 0 ; i--){
            if(arr[i] != 0){
                arr[position] = arr[i];
                position--;
            }
        }
        while(position >= 0){
            arr[position] = 0;
            position--;
        }
        System.out.println((Arrays.toString(arr)));
    }
}
