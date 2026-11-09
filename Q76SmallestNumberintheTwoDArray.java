import java.util.Scanner;
public class Q76SmallestNumberintheTwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row : ");
        int rows = sc.nextInt();
        System.out.println("Enter colm : ");
        int cols = sc.nextInt();
        int [] [] arr = new int[rows][cols];
        int smallest = Integer.MAX_VALUE;
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < cols ; j++){
                arr[i][j] = sc.nextInt();
                if(arr[i][j] < smallest){
                    smallest = arr[i][j];
                }
                System.out.println();
            }
        }
        System.out.println("Smallest Element in a 2D Array : " + smallest);
    }

}
