import java.util.Scanner;
public class Q64countnumberssmallerthanavg {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of thr array : ");
        int n = sc.nextInt();
        int [] arr = new int [n];
        int sum = 0;
        int count = 0;
        System.out.println("Enter the element : ");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        double avg = (double) sum / (double) n;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] < avg){
                count++;
            }
        }
        System.out.println("Average is : " + avg);
        System.out.println("Elements smaller than is : " + count);
    }
}
