import java.util.Scanner;
public class Q42Distincelementlargestsecondlargest {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value n : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        int largest = arr[0];
        int secondlargest = arr[0];
        System.out.println("Enter the elements : ");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
            if(arr[i] > largest){
                secondlargest = largest;
                largest = arr[i];
            }
            else if(arr[i] > secondlargest && largest != arr[i]){
                secondlargest = arr[i];
            }
        }
        System.out.println("Largest is : " + largest);
        System.out.println("SecondLargest is : " + secondlargest);

    }
}
 