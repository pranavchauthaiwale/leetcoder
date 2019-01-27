public class SearchRange {

    public static void main(String[] args){
        int[] input = new int[]{0,1,2,3,4,4,5,5,6,7,8,8,8,8,8,8,8,9,9,10,10,10,15,16,18,18,18,18,18,18};
        int[] output = searchRange(input, 10, 0, input.length - 1);
        System.out.println(output[0] + " " + output[1]);
    }

    public static int[] searchRange(int[] arr, int value, int start, int end){
        if(start > end || arr[start] > value || arr[end] < value){
            return new int[]{-1, -1};
        }

        if(arr[start] == value && arr[end] == value){
            return new int[]{start, end};
        }

        int mid = (start + end) / 2;
        int[] leftResult = searchRange(arr, value, start, mid);
        int[] rightResult = searchRange(arr, value, mid + 1, end);

        if(leftResult[0] == -1 && rightResult[0] == -1){
            return leftResult;
        }
        if(leftResult[0] == -1){
            return rightResult;
        }
        if(rightResult[0] == -1){
            return leftResult;
        }
        return new int[]{leftResult[0], rightResult[1]};
    }
}
