import java.util.Scanner;
public class Q35CountEvenandOddElements {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value n : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        int even = 0;
        int odd = 0;
        System.out.println("Enter the elements : ");
        for(int i = 0 ; i  < arr.length ; i++){
            arr[i] = sc.nextInt();
            if(arr[i] % 2 == 0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("Even count is : " + even);
        System.out.println("Odd count is : " + odd);
    }
}
