package Arrays;

class SubarraysSum {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            max=Math.max(sum,max);

            if(sum<0){
                sum=0;
            }
        }
        return max;

    }

    public static void main(String[] args) {
        SubarraysSum obj = new SubarraysSum();
        System.out.println(obj.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}
