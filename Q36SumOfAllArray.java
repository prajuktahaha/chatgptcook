import java.util.Scanner;
public class Q36SumOfAllArray {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        int sum = 0;
        int [] arr = new int [n];
        System.out.println("enter the elements : ");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        System.out.println("sum of the array is : " + sum);
    }
}
