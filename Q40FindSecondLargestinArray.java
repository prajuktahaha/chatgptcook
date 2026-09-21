import java.util.Scanner;
public class Q40FindSecondLargestinArray {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value n : ");
        int n = sc.nextInt();
        int [] arr = new int [n];
        System.out.println("Enter the elements : ");
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
            if(arr[i] > largest){
                secondlargest = largest;
                largest = arr[i];
            }
            else if(arr[i] > secondlargest && arr[i] < largest){
                secondlargest = arr[i];
            }
        }
        System.out.println("Second Largest is : " + secondlargest);
    }
}
