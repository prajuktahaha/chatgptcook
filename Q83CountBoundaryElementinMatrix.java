import java.util.Scanner;
public class Q83CountBoundaryElementinMatrix {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows : ");
        int rows = sc.nextInt();
        System.out.println("Enter the cols : ");
        int cols = sc.nextInt();
        int [][] arr = new int [rows][cols];
        int count = 0;
        System.out.println("enter the  elements : ");
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < cols ; j++){
                arr [i][j] = sc.nextInt();
                if(i==0 || i == rows - 1 || j == 0 || j == cols - 1 ){
                    count++;
                }
            }
        }
        System.out.println("Boundary is : " + count);
    }
}
