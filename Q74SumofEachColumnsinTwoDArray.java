import java.util.Scanner;
public class Q74SumofEachColumnsinTwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the rows : ");
        int rows = sc.nextInt();
        System.out.println("Enter the cols : ");
        int cols = sc.nextInt();
        int [][] arr = new int[rows][cols];
        for(int i = 0  ; i<rows ; i++){
            int sum = 0;
            for(int j = 0 ; j < cols ; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int j = 0  ; j  <  cols ; j++){
            int sum = 0;
            for(int i = 0 ; i < rows ; i++){
                sum = sum + arr[i][j];
            }
            System.out.println("Columns " + (j+1) + "sum = " + sum);
        }
    }
}
