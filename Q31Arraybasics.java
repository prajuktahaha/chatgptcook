import java.util.Scanner;
import java.util.Arrays;
public class Q31Arraybasics {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value n : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the elements : ");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
}
