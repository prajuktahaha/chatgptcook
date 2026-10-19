import java.util.Scanner;
public class Q59LargestElementSmallerthanTarget {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        int index = -1;
        int Greatest = Integer.MIN_VALUE;
        System.out.println("Enter the target : ");
        int target = sc.nextInt();
        System.out.println("Enter the Element : ");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] < target && arr[i] > Greatest){
                Greatest = arr[i];
                index = i;
            }
        }
        System.out.println("largest value smaller than the target is at index : " + "" + index);
    }
}
