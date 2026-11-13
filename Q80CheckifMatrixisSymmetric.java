import java.util.Scanner;
public class Q80CheckifMatrixisSymmetric {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the rows : ");
        int rows = sc.nextInt();
        System.out.println("Enter the columns");
        int cols = sc.nextInt();
        int [][] arr = new int [rows][cols];
        System.out.println("Enter the Elements : ");
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < cols ; j++){
                arr [i] [j] = sc.nextInt();
            }
        }

        if (rows != cols){
            System.out.println("Matrix is not symmetric");
            return;
        }

        boolean isSymmetric = true;

        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < cols ; j++){
                if (arr[i][j] != arr[j][i]){
                    isSymmetric = false;
                    break;
                }
            }
            if(!isSymmetric){
                break;
            }
            
        }
        if(isSymmetric){
            System.out.println("Matrix is Symmetric");
        }
        else{
            System.out.println("Matrix is Not Symmetric");
        }
    }
}
