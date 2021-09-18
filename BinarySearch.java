// implementation of binary search using recursion 

public class BinarySearch{
    public static void main(String[] args){
        
        int[] array = {1,2,3,4,5,6};

        System.out.println(binarySearch(array, 3, 5, 0));

    }

    public static int binarySearch(int[] array, int key, int high, int low){
        
        if(low <= high){
            int mid = (high + low)/2;

            if(key == array[mid]){
                return mid;
            }

            else if(key > array[mid]){
                low = mid + 1;
                return binarySearch(array, key, high, low);
            }

            high = mid - 1;
            return binarySearch(array, key, high, low);
        }

        return  - 1;
    }
}