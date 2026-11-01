import java.util.Scanner;
public class Q72SumofTwoDArray {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows  : ");
        int rows = sc.nextInt();
        System.out.println("Enter the columns : ");
        int col = sc.nextInt();
        int sum = 0;
        int [][] arr = new int [rows] [col];
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < col ; j++){
                arr[i][j] = sc.nextInt();
                sum = sum + arr[i][j];
            }
        }
        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < col ; j++){
                System.out.print( arr [i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("The sum of matrix is :  " + sum);
    }
}
