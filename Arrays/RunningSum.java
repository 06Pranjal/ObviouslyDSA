package Arrays;

import java.util.Arrays;

public class RunningSum {
    int[] Runsum(int arr[]){
        int[] arr2=new int[arr.length];
        int sum;
        for(int i=0;i<arr.length;i++){
            sum=0;
            for(int j=0;j<=i;j++){
                sum+=arr[j];
            }
            arr2[i]=sum;
        }
        return arr2;
    }

    public static void main(String[] args) {
        RunningSum rs=new RunningSum();
        System.out.println(Arrays.toString(rs.Runsum(new int[]{1, 2, 3, 4, 5})));
    }
}
