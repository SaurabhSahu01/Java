import java.util.Scanner;
public class Hex2Dec {
    public static void main(String[] args){
        System.out.print("Enter the hexadecimal value : ");
        Scanner input = new Scanner(System.in);
        String hex_value = input.next();
        System.out.println("The decimal value of the entered hexadecimal value is : " + hexToDec(hex_value));

    }
    public static int hexToDec(String hex){
        int decimal = 0;
        for(int i=0;i < hex.length();i++){
            char hexa = hex.charAt(i);
            decimal += Math.pow(16,hex.length()-i-1) * decimalValue(hexa); 
        }
        return decimal;
    }
    public static int decimalValue(char hexa){
        if(hexa >= 'A' && hexa <= 'F'){
            return (10 + hexa - 'A');
        }
        else 
            return (hexa - '0');
    }
}
