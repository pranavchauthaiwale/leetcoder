import java.util.Arrays;

public class ArrayAccess {

    private static String myStr = " abcd   ";
    public static void main(String[] args){

        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
        int[] nums = new int[arr.length];
        int i = 0;
        int j = arr.length - 1;
        int k = 0;
        while(i < j){
                nums[k] = arr[i];
                nums[k+1] = arr[j];
                i++;
                j--;
                k+=2;
        }
        if(i == j){
            nums[k] = arr[i];
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(myStr.length());
    }
}
