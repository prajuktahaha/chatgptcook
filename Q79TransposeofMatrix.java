import java.util.Scanner;
public class Q79TransposeofMatrix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows : ");
        int rows = sc.nextInt();
        System.out.println("Enter the Columns : ");
        int cols = sc.nextInt();
        int [][] arr = new int [rows][cols];
        int [][] transpose = new int [cols][rows];
        System.out.println("Enter the elements for matrix : ");
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < cols ; j++){
                arr[i][j] = sc.nextInt();
                
            }
        }
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < cols ; j++){
                transpose[j][i] = arr[i][j];
            }
        }
        for(int i = 0; i < cols; i++){
          for(int j = 0; j < rows; j++){
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
