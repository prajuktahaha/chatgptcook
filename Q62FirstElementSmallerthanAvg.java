import java.util.*;
public class Q62FirstElementSmallerthanAvg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int sum = 0;
        int result = 0;
        int[] arr = new int[n];
        System.out.println("Enter the elements : ");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        double avg = (double) sum / (int) n;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] < avg){
                result = arr[i];
                break;
            }
        }
        System.out.println("Average is : " + "" + avg);
        System.out.println("First element smaller than average" + " " + result);
    }
}
