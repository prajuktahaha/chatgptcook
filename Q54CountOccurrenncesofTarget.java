import java.util.Scanner;
public class Q54CountOccurrenncesofTarget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n  = sc.nextInt();
        System.out.println("Enter the target : ");
        int target = sc.nextInt();
        int [] arr = new int[n];
        int count = 0;
        System.out.println("Enter the elements : ");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
            if(arr[i] == target){
                count++;
            }
        }
        System.out.println("The target occured for : " + count + "" + "times");
    }
}
