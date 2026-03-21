package Arrays;

import static java.lang.Math.abs;

public class ContainDuplicate_III {
    boolean duplicate(int[] nums, int indexDiff, int valueDiff) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(abs(i - j) <= indexDiff && abs(nums[i] - nums[j]) <= valueDiff){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ContainDuplicate_III obj = new ContainDuplicate_III();
        System.out.println(obj.duplicate(new int[]{1,5,9,1,5,9}, 2, 3));
    }
}