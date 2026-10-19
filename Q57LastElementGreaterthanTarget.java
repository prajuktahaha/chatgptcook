import java.util.Scanner;
public class Q57LastElementGreaterthanTarget {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the target : ");
        int target = sc.nextInt();
        int index = -1;
        System.out.println("Enter the elements : ");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > target){
                index = i;
            }
        }
        System.out.println("Element greateer than target is at index : " + "" + index);
    }
}
