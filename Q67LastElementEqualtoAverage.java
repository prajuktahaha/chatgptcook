import java.util.Scanner;
public class Q67LastElementEqualtoAverage {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the sie of the array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        int sum = 0 ;
        int result = 0;
        boolean found = false;
        System.out.println("Enter the elements : ");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        double avg = (double) sum / (double) n;
        System.out.println("Average is : " + avg);
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == avg){
                result = arr[i];
                found = true;
            }
        }
        if(found){
            System.out.println("Element found is : " + result);
        }
        else{
            System.out.println("No Matchind element");
        }
    }
}
