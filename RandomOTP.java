/* 
PROGRAM TO GENERATE AN OTP FOR A VERIFICATION PURPOSE
METHOD1 - Random character between 'a' and 'z'
METHOD2 - Random character betwenn 'A' and 'Z'
METHOD3 - process to choose between method1 and method2

METHOD4 - asking user the lenght of the string and using all previous method in this method
*/

import java.util.Scanner;
public class RandomOTP {
    public static void main(String[] args){
        System.out.print("Enter the lenght of OTP you want to generate : ");
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        System.out.println(string(length));
    }

    public static char lowerCase(){
        return (char)('a' + ('z'-'a'+1)*Math.random());
    }

    public static char upperCase(){
        return (char)('A' + ('Z'-'A'+1)*Math.random());
    }

    public static char randomChar(){
        int number = (int)(10*Math.random());
        char character;
        if(number >= 0 && number <= 4)
            character = lowerCase();
        else
            character = upperCase();
        return character;
    }

    public static String string(int length){
        String OTP = "";
        for(int i=0;i<length;i++){
            OTP = OTP + randomChar();
        }
        return OTP;
    }
    
}
