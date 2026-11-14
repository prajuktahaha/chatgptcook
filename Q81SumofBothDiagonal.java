import java.util.Scanner;
public class Q81SumofBothDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows : ");
        int rows = sc.nextInt();
        System.out.println("Enter the cols : ");
        int cols = sc.nextInt();
        int [][] arr = new int [rows][cols];
        int sum = 0;
        System.out.println("Enter the elements of matrix : ");
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < cols ; j++){
                arr [i][j] = sc.nextInt();
            }
        }
        int mainSum = 0;
        int secondarySum = 0;
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < cols ; j++){
                if(i==j){
                    mainSum = mainSum + arr[i][j];
                }
                if(i+j == rows - 1){
                    secondarySum = secondarySum +  arr[i][j];
                }
            }
        }
        int total = mainSum + secondarySum;
        if(rows % 2 != 0){
            total = total - arr[rows / 2] [rows / 2];
        }
        System.out.println("Main diagonal sum = " + mainSum);
        System.out.println("Secondary diagonal sum = " + secondarySum);
        System.out.println("Total diagonal sum = " + total);
    }
}
