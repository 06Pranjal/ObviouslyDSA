package Arrays;

class MoveZerosOptimised {
    public void moveZeroes(int[] nums) {
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[j]=nums[i];
                j++;
            }
        }
        while(j<nums.length){
            nums[j]=0;
            j++;
        }
    }

    public static void main(String[] args) {
        MoveZerosOptimised obj = new MoveZerosOptimised();
        int[] arr=new int[]{0,1,0,3,12};
        obj.moveZeroes(arr);
        System.out.print("[ ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }
        System.out.print("]");
    }
}

