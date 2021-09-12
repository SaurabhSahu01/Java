// print first 100 prime numbers in 10 columns fashion 
import java.util.Scanner;
public class NPrime{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the numbers of prime numbers you want to see : ");
        int number = input.nextInt();
        nPrime(number);
    }
    
    public static void nPrime(int numberOfPrimes){
        int count = 0;
        int number = 2;
        while(count < numberOfPrimes){
            if(isPrime(number)){
                count++;
                if(count % 10 == 0){
                    System.out.printf("%-5d\n",number);
                }
                else{
                    System.out.printf("%-5d",number);
                }
            }
            number++;
        }
    }
    
    public static boolean isPrime(int num){
        for(int i=2;i<=num/2;i++){
            if(num % i ==0){
                return false; 
            }
        }
        return true;
    }
}