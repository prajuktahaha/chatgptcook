import java.util.Scanner;
public class Q63LastElementSmallerThantheAverage {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        int sum = 0;
        double result = 0;
        boolean found = false;
        System.out.println("Enter the element : ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        double avg = (double) sum / (double) n; 
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] < avg){
                result = arr[i];
                found  = true;
            }
        }
        if(found){
            System.out.println("Last element smaller than avg is : " + " " + result);
        }
        System.out.println("Average is " + " " + avg);
    }
}
