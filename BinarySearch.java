// this is the iterative method of binary search implementation 

public class BinarySearch{
    public static void main(String[] args){
        int[] array = {1,3,5,7,9};

        System.out.println(binarSearch(array,4));
    }

    public static int binarSearch(int[] array, int key){
        int low = 0;
        int high = array.length - 1;

        while(high >= low){
            int mid = (high + low)/2;

            if(key == array[mid]){
                return mid;
            }

            else if(key > array[mid]){
                low = mid + 1;
            }

            else{
                high = mid - 1;
            }
        }
        return -low - 1;
    }
}