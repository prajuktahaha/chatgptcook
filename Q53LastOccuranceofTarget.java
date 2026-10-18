import java.util.Scanner;
public class Q53LastOccuranceofTarget {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int index = 0;
        int[] arr = new int[n];
        System.out.println("Enter the target : ");
        int target = sc.nextInt();
        System.out.println("Enter all the elements : ");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
            if(arr[i] == target){
                index = i;
            }
        }
        System.out.println("The last ocurance is at index : " + index);
    }
}
