package Arrays;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    int[] removeDuplicates(int[] nums) {
        int c=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                c++;
            }
        }

        int[] result=new int[c];

        int j=0;
        result[j]=nums[0];
        j++;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                result[j]=nums[i];
                j++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray obj=new RemoveDuplicatesFromSortedArray();
        System.out.println(Arrays.toString(obj.removeDuplicates(new int[]{1,1,2})));
    }
}
