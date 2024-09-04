//Sliding window technique
public class HelloWorld {
    public static int subArray(int[] nums, int target) {
        int left = 0, right = 0;
        int min = Integer.MAX_VALUE, sum = 0;
        int n = nums.length;
        while (right < n) {
            sum = sum + nums[right];
            while (target <= sum) {
                min = Math.min(min, right - left + 1);
                sum = sum - nums[left];
                left++;
            }
            right++;
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
    public static void main(String args[]){

        int nums[] = {2,3,1,2,4,3};
        int target = 7;
        System.out.println(subArray(nums,target));
        
    }
}
