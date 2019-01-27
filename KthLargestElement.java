public class KthLargestElement {
    public static void main(String[] args){
        System.out.println(findKthLargest(new int[]{1,2,3,4,5,6,5,5}, 2));
    }

    public static int findKthLargest(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        for(int i : nums){
            if(i > max){
                max = i;
            }
        }
        int[] occurrence = new int[max+1];
        for(int i : nums){
            occurrence[i]++;
        }
        max = Integer.MIN_VALUE;
        for(int i : occurrence){
            if(i > max){
                max = i;
            }
        }
        int[] buckets = new int[max+1];
        for(int i = 0; i < max+1; i++){
            buckets[i] = -1;
        }
        for(int i = 0; i < occurrence.length; i++){
            if(occurrence[i] != 0){
                buckets[occurrence[i]] = i;
            }
        }
        for(int i = buckets.length - 1; i >= 0; i--){
            if(buckets[i] != -1){
                if(k > i){
                    k = k - i;
                }
                else {
                    return buckets[i];
                }
            }
        }
        return -3;
    }
}
