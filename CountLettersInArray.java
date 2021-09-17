// array to store 100 randomly generated characters
// method to generate random characters
// array to store the frequency of occurence of the characters in the main array 
// finally printing the characters with their frequencies of occurence
// finding the max occurence of the character 

public class CountLettersInArray{
    public static void main(String[] args){
        int[] array1 = new int[100];
        for(int i=0;i<array1.length;i++){
            array1[i] = randomChar();
        }

        int[] count = countingFrequency(array1);
        for(int i = 0;i<count.length;i++){
            System.out.print(count[i] + "" + (char)('a' + i) + " ");
        }

        System.out.println("\nThe most occuring character is: " + "" + (char)('a' + maxOccurence(count))+ " " + count[maxOccurence(count)]);
    }

    public static char randomChar(){
        char randomChar = (char)('a' + (int)(Math.random()*('z' - 'a' + 1))); // explicit typecasting is needed here
        return randomChar;
    }

    public static int[] countingFrequency(int[] array){
        int[] arrayCount = new int[26];

        for(int i=0;i<array.length;i++){
            arrayCount[array[i] - 'a']++;
        }

        return arrayCount;
    }
    public static int maxOccurence(int[] array){
        int max = array[0];
        int index = 0;
        for(int i=1;i<array.length;i++){
            if(array[i] > max){
                max = array[i];
                index = i;
            }
        }
        return index;
    }
}