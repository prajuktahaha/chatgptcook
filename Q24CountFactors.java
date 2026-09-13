import java.util.Scanner;
public class Q24CountFactors {
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int c = 0;
        for(int i = 1 ; i <= n ; i++){
            if(n  % i == 0){
                c++;
            }
        }
        System.out.println("The Factor of the number " + n + "is " + c);
    }

}

//optimized:
// for(int i = 1 ; i <= Math.sqrt(n) ; i++){
//             if(n  % i == 0){
//                 if(i == n/i){
//                     c++;
//                 }
//                 else{
//                     c+=2;
//                 }
//             }
//         }