import java.util.Scanner;
import java.util.Arrays;
public class Q46FirstDuplication {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        int duplicate = -1;
        System.out.println("Enter the elements : ");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < i ; j++){
                if(arr[i] == arr[j]){
                    duplicate = arr[i];
                    break;
                }
            }
            if(duplicate != -1){
            break;
        }
        }
        System.out.println("the duplicate number is : " + " " + duplicate);
    }
}
