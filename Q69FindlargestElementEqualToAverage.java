import java.util.Scanner;
public class Q69FindlargestElementEqualToAverage {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int sum = 0;
        int [] arr = new int[n];
        System.out.println("enter the elements");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }

        double avg = (double) sum / (double) n;
        System.out.println("Average is : " + avg);
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == avg){
                System.out.println("Largest element equal to average: " + arr[i]);
            }
        }
    }
}
