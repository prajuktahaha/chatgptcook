import java.util.Scanner;
public class Q41FindSmallestandSecondSmallest {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the number value : ");
        int n = sc.nextInt();
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        int [] arr = new int[n];
        System.out.println("Enter the elements : ");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
            if(arr[i] < smallest){
                secondSmallest = smallest;
                smallest = arr[i];
            }
            else if(arr[i] < secondSmallest){
                secondSmallest = arr[i];
            }
        }
        System.out.println("Second Smallest is : " + secondSmallest);
        System.out.println("Smallest is : " + smallest);
    }
}
