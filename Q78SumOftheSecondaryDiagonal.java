import java.util.Scanner;
public class Q78SumOftheSecondaryDiagonal {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows : ");
        int rows = sc.nextInt();
        System.out.println("Enter the cols : ");
        int cols = sc.nextInt();
        int sum = 0;
        int [][] arr = new int[rows][cols];
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < cols ; j++){
                arr [i][j] = sc.nextInt();
                if(i+j==rows-1){
                    sum = sum + arr[i][j];
                }
                System.out.println();
            }
        }
        System.out.println("Main Diagonal sum is : " + sum);
    }
}
