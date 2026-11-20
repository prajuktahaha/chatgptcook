import java.util.Scanner;
public class Q86FindSmallestInteriorElement {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows : ");
        int rows = sc.nextInt();
        System.out.println("Enter the cols : ");
        int cols = sc.nextInt();
        int [][] arr = new int [rows][cols];
        int smallest = Integer.MAX_VALUE;
        System.out.println("Enter the elements : ");
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < cols ; j++){
                arr [i][j] = sc.nextInt();
                if(i!=0 && i != rows - 1 && j != 0 && j != cols - 1){
                    if(arr[i][j] < smallest){
                        smallest = arr[i][j];
                    }
                }
            }
        }
        System.out.println("The Smallest is  : " + smallest);
    }
}
