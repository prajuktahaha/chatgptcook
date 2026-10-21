import java.util.Scanner;
public class SecondSmallestDistinctElement {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your size of array : ");
        int n = sc.nextInt();
        int [] arr = new int [n];
        int smallest = Integer.MAX_VALUE;
        int SecondSmallest = Integer.MAX_VALUE;
        System.out.println("Enter the elements : ");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
            if(arr[i] < smallest){
                SecondSmallest = smallest;
                smallest = arr[i];
            }
            else if (arr[i] > smallest && arr[i] < SecondSmallest){
                SecondSmallest = arr[i];
            }
        }
        if(SecondSmallest == Integer.MAX_VALUE){
            System.out.println("The Second largest is -1");
        }
        else{
            System.out.println("Second largest is : " + " " + SecondSmallest);
        }
        System.out.println("Smallest is  : " + smallest);
    }
}
