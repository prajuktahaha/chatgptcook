import java.util.Scanner;
public class Q39CountOccurrencesofTarget {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        int [] arr = new int [n];
        System.out.println("Enter the target element : ");
        int target = sc.nextInt();
        int count = 0;
        System.out.println("Enter the elements : ");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
            if(target == arr[i]){
                count++;
            }
        }
        System.out.println(target + " " + "occured" + " " + count + "" +"times");
    }
}
