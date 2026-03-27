package Arrays;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    int[] product(int[] nums){
        int r=nums.length;
        int[] arr=new int[r];
        int product=1;
        for(int i=0;i<r;i++){
            product=1;
            for(int j=0;j<r;j++){
                if(i!=j){
                    product=product*nums[j];
                    arr[i]=product;
                }
            }


        }
        return arr;
    }

    public static void main(String[] args) {
        ProductOfArrayExceptSelf obj=new ProductOfArrayExceptSelf();
        System.out.println(Arrays.toString(obj.product(new int[]{1, 2, 3, 4})));
    }
}
