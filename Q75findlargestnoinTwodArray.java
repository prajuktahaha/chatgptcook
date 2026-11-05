import java.util.Scanner;
public class Q75findlargestnoinTwodArray {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows : ");
        int rows = sc.nextInt();
        System.out.println("Enter the columns : ");
        int cols = sc.nextInt();
        int [][] arr = new int [rows][cols];
        int largest = Integer.MIN_VALUE;
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < cols ; j++){
                arr[i][j] = sc.nextInt();
                if(arr[i][j] > largest){
                largest = arr[i][j];}
            }
            System.out.println();
        }
        System.out.println("the largest number in matrix is : " + largest);
    }
}
