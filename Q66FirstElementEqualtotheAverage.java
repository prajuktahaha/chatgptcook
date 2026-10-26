import java.util.Scanner;
public class Q66FirstElementEqualtotheAverage {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  size of array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        int sum = 0;
        boolean found = false;
        System.out.println("Enter the element : ");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        double avg = (double) sum / (double) n;
        System.out.println("Average : " + avg);
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == avg){
                System.out.println("First element equal to average is : " + arr[i]);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("no matching element");
        }
    }
}
