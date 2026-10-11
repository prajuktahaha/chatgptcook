import java.util.Scanner;
import java.util.Arrays;
public class Q49MoveNegativenumtoLeft {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size n : ");
        int n = sc.nextInt();
        int position = 0;
        int [] arr = new int[n];
        System.out.println("Enter the elements : ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
            if(arr[i] < 0){
                int temp = arr[position];
                arr[position] = arr[i];
                arr[i] = temp;
                position++;
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
