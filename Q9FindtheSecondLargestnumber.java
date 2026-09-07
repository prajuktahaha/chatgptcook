import java.util.Scanner;
public class Q9FindtheSecondLargestnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the input value : ");
        int n = sc.nextInt();
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        System.out.println("Enter the numbers : ");
        for(int i = 0 ; i < n ; i++){
            int numbers = sc.nextInt();
            if(numbers > largest){
                secondLargest = largest ;
                largest = numbers;
            }
            else if(numbers > secondLargest & numbers != largest){
                secondLargest = numbers;
            }
        }
        System.out.println("largest number is : " + largest);
        System.out.println("Second Largest number is : " + secondLargest);
    }
} 