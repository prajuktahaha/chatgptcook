import java.util.Scanner;
public class Q38CountElementsGreaterthanGivenNumbers {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the target number : ");
        int target = sc.nextInt();
        System.out.println("Enter the elements : " );
        int count = 0;
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
            if(target < arr[i]){
                count++;
            }
        }
        System.out.println("Number of elements greater than " + "" + target + "is : " + " " + count);
    }
}
