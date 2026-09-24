import java.util.Scanner;
public class Q45DuplicateDetection {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        boolean duplication = false;
        System.out.println("Enter the elements : ");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = i + 1 ; j < arr.length ; j++){
               if(arr[i] == arr[j]){
                    duplication = true;
                }
            }
        }
        if(duplication){
            System.out.println("Duplication found");
        }
        else{
            System.out.println("Duplication not found");
        }
    }
}
