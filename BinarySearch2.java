public class BinarySearch2 {
    public static void main(String[] args){
        int[] array = {1,3,5,7,9};
        System.out.println(binarySearch(array,2,4,0));

    }

    public static int binarySearch(int[] array, int key, int high, int low){
        if(high>=low){
            int mid = (high + low)/2;

            if(key == array[mid]){
                return mid;
            }

            else if(key > array[mid]){
                low = mid + 1;
                return binarySearch(array,key, high, low);
            }

            high = mid - 1;
            return binarySearch(array, key, high, low);
        }
        return -low-1;
    }
    
}
