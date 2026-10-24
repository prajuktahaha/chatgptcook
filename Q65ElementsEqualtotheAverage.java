import java.util.Scanner;
public class Q65ElementsEqualtotheAverage{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of thr array : ");
        int n = sc.nextInt();
        int [] arr = new int [n];
        int sum = 0;
        int result = 0;
        boolean found = false;
        System.out.println("Enter the element : ");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        double avg = (double) sum / (double) n;
        System.out.println("Average is : " + avg);
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == avg){
                System.out.println(arr[i]);
                found = true;
            }
        }
        if(!found){
            System.out.println("no matching element");
        }
    }
}
