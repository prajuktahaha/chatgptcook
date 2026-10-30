import java.util.Scanner;
public class Q70FirstElementGreaterthanElement {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : " );
        int n = sc.nextInt();
        int [] arr = new int[n];
        boolean found = false;
        int sum = 0;
        int result = 0;
        System.out.println("Enter the elements : ");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }

        double avg = (double) sum / (double) n;
        System.out.println("Average is : " + avg);

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] > avg ){
                result = arr[i];
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("First element greater than average: " + result);
        }
        else{
            System.out.println("No match element");
        }
    }
}
