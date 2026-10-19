import java.util.Scanner;
public class Q58SmallestElementGreaterthanTarget {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        System.out.println("Enter the target : ");
        int target = sc.nextInt();
        int [] arr = new int[n];
        int index = -1;
        int smallest = Integer.MAX_VALUE;
        System.out.println("Enter the elements : ");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > target && arr[i] < smallest){
                smallest = arr[i];
                index = i;
            }
        }
        System.out.println("Smallest Element Greater Than Target : " + "" + index);
    }
}
