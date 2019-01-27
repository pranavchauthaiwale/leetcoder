import java.util.Arrays;

public class BinarySearch {

    // Simple method that implements binary search over an integer array
    public static void main(String[] args){
        int[] arr = new int[]{1,2,3,4,6,7};
//        System.out.println(binarySearch(12, arr));
        System.out.println(binarySearch(arr, 4, 0, arr.length - 1));
    }

    public static boolean binarySearch(int key, int[] input){
        int i = 0;
        int j = input.length - 1;

        while(i <= j){
            if(i == j){
                return input[i] == key;
            }
            int mid = (j + i) / 2;
            if(input[mid] == key){
                return true;
            }
            if(key > input[mid]){
                i = mid + 1;
            }
            else{
                j = mid - 1;
            }
        }
        return false;
    }

    public static boolean binarySearch(int[] input, int key, int start, int end){
        if(start<=end) {
            int mid = (start + end) / 2;
            if(input[mid] == key){
                return true;
            } else if(key > input[mid]){
                return binarySearch(input, key, mid + 1, end);
            }
            return binarySearch(input, key, start, mid -1);
        }
        return false;
    }
}
