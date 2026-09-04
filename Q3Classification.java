import java.util.Scanner;
public class Q3Classification {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        int positive = 0;
        int negative = 0;
        int zero = 0;
        int count = 0;
        System.out.println("Enter the numbers : ");
        for(int i = 0 ; i < n ; i++){
            int numbers = sc.nextInt();
            if(numbers > 0){
                positive++;
            }
            if(numbers < 0){
                negative++;
            }
            if(numbers == 0){
                zero++;
            }
        }
        System.out.println("The positive numbers are : " + positive);
        System.out.println("the negative numbers are : " + negative);
        System.out.println("The zeero counts are : " + zero);
    }
}
