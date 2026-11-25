import java.util.Scanner;
public class Q90ReverseEachColumnsofMatrix {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows : ");
        int rows = sc.nextInt();
        System.out.println("Enter the cols : ");
        int cols = sc.nextInt();
        int [][] arr = new int[rows][cols];
        System.out.println("Enter the elements : ");
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < cols ; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int j = 0 ; j < cols ; j++){
            int top = 0;
            int bottom = rows - 1;
            while(top < bottom){
                int temp = arr[top][j];
                arr[top][j] = arr[bottom][j];
                arr[bottom][j] = temp;
                top++;
                bottom--;
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
