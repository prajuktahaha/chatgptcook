import java.util.Scanner;
public class Q52FirstOccurenceSearch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int index = -1;
        int count = 0;
        int[] arr = new int[n];
        System.out.println("Enter the target : ");
        int target = sc.nextInt();
        System.out.println("Enter all the elements : ");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
            if(arr[i] == target && count == 0){
                index = i;
                count++;
                break;
            }
        }
        System.out.println("The first ocurance is at index : " + index);
    }
}