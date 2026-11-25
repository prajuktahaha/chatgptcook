import java.util.Scanner;
public class Q89reverseeachrowofmatrix {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows : ");
        int rows = sc.nextInt();
        System.out.println("Enter the cols : ");
        int cols = sc.nextInt();
        int [][] arr = new int[rows][cols];
        System.out.println("Enter the ELements : ");
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < cols ; j++){
               arr[i][j] = sc.nextInt();
            }
        }
        for(int i = 0 ; i < rows ; i++){
            int left = 0 ;
            int right = cols - 1;
            while(left < right){
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;
                left++;
                right--;
            }
        }
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < cols ; j++){
               System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}
