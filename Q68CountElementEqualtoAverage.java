import java.util.Scanner;
public class Q68CountElementEqualtoAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        int sum = 0;
        int count = 0;
        System.out.println("Enter the elements : ");
        for(int i = 0 ; i < arr.length; i++){
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }

        double avg = (double) sum / (double) n;
        System.out.println("average of the array is : " + avg);

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == avg ){
                count++;
            }
        }
        System.out.println("Elements equal to avg : " + count);
    }
}
