package Arrays;

import static java.lang.Math.abs;

public class ContainsDuplicate_II {
    boolean duplicate(int[] nums,int k) {
        for(int i=0;i<nums.length;i++) {
            for(int j=i+1;j<nums.length;j++) {
                if(nums[j]==nums[i]&& abs(i-j)==k) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate_II obj = new ContainsDuplicate_II();
        System.out.println(obj.duplicate(new int[]{99,99},2));

    }
}
