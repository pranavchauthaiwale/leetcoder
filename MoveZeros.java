public class MoveZeros {

    public static void main(String[] args){
        int[] arr = new int[]{1};
        moveZeros(arr);
        for(int i : arr){
            System.out.print(" " + i);
        }

    }

    public static void moveZeros(int[] nums){
        int i = 0;
        while(i < nums.length && nums[i] !=0){
            i++;
        }
        for(int j = i; j < nums.length;){
            if(nums[i] != 0){
                i++;
            }
            else {
                if(nums[j] != 0){
                    nums[i] = nums[j];
                    nums[j] = 0;
                }
                j++;
            }
        }
    }
}
