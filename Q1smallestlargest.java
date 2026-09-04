import java.util.Scanner;
public class Q1smallestlargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of input : ");
        int n = sc.nextInt();
        System.out.println("Enter the value of Numbers : ");
        int largest = sc.nextInt();
        int smallest = largest;
        for(int i = 1 ; i < n ; i++){
            int numbers = sc.nextInt();
            if(numbers > largest){
                largest = numbers;
            }
            if(numbers < smallest){
                smallest = numbers;
            }
        }
        System.out.println("the smallest number is : " + smallest);
        System.out.println(" the largest number is : " + largest);
    }
}
