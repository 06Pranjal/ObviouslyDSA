package Arrays;

public class TwoSum {

    public boolean twoSum(int[] nums, int target) {

        for(int i = 0; i < nums.length; i++){
            int x = target - nums[i];

            int index = search(x, nums, i);

            if(index != -1){
                return true;
            }
        }
        return false;
    }

    int search(int x, int[] arr, int excludeIndex){
        for(int j = 0; j < arr.length; j++){
            if(j != excludeIndex && arr[j] == x){
                return j;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        TwoSum ts = new TwoSum();
        System.out.println(ts.twoSum(new int[]{2,8,11,-2}, 9));
    }
}