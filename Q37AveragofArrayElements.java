import java.util.Scanner;
public class Q37AveragofArrayElements {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        double average = 0;
        double sum = 0;
        System.out.println("Enter the elements : ");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        average = sum / n;
        System.out.println("Average of the array is : " + average);
    }
}
