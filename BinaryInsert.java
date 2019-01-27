public class BinaryInsert {

    public static void main(String[] args){
        int[] input = new int[]{1,3,5,7};
        int target = 4;
        int insertPosition = searchInsert(input, target);
        System.out.println("Insert position: " + insertPosition);
    }

    public static int searchInsert(int[] nums, int target) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        return binarySearchInsert(nums, target, 0, nums.length - 1);
    }

    public static int binarySearchInsert(int[] nums, int target, int start, int end){
        if(start > end){
            return end;
        }
        int mid = start + (end - start) / 2;
        if(nums[mid] == target){
            return mid;
        }
        if(nums[mid] > target){
            return binarySearchInsert(nums, target, start, mid - 1);
        }
        return binarySearchInsert(nums, target, mid + 1, end);
    }
}
