import java.util.*;
public class Q60SecondLargestDistinctElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        System.out.println("Enter the elements : ");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
            if(arr[i] > largest){
            secondLargest = largest;
            largest = arr[i];
            }
            else if(arr[i] < largest && arr[i] > secondLargest){
            secondLargest = arr[i];
          }
            if(secondLargest == Integer.MIN_VALUE){
             System.out.println("Second largest distinct element: -1");
            }
            else{
            System.out.println("Second largest distinct element: " + secondLargest);
            }

          System.out.println("Largest number in array: " + largest);
        }
        System.out.println("Largest no in array is : " + " " + largest);
        System.out.println("Seccond Largest Number in array is : " + " " + secondLargest);
    }
}
