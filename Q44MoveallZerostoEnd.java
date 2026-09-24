import java.util.Scanner;
import java.util.Arrays;
public class Q44MoveallZerostoEnd {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        int position = 0;
        System.out.println("Enter the elements : ");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
            if(arr[i] != 0){
                int temp = arr[position];
                arr [position] = arr[i];
                arr[i] = temp;
                position++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
