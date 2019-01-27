import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static void main(String[] args){
        int[] input = new int[]{-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6};
        List<List<Integer>> uniqueTriplet = threeSum(input);
        for(List<Integer> list : uniqueTriplet){
            System.out.println(list);
        }
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length < 3){
            return new ArrayList<>();
        }
        List<List<Integer>> set = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i++){
            if(nums[i] > 0){
                break;
            }
            if (i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            int start = i + 1, end = nums.length - 1;
            int key = 0 - nums[i];
            while(start < end){
                if(nums[start] + nums[end] < key){
                    start++;
                } else if(nums[start] + nums[end] > key){
                    end--;
                }else {
                    set.add(Arrays.asList(new Integer[]{nums[i], nums[start], nums[end]}));
                    start++; end--;
                    while (start < end && nums[start] == nums[start - 1]) {
                        start++;
                    }
                    while (start < end && nums[end] == nums[end + 1]) {
                        end--;
                    }
                }
            }
        }
        return set;
    }
}
