package Arrays;

import java.util.Arrays;

public class ReverseArray {
    public int[] reverseArray(int[] arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            i++;
            j--;
        }
        return arr;
    }

    public static void main(String[] args) {
        ReverseArray obj=new ReverseArray();
        System.out.println(Arrays.toString(obj.reverseArray(new int[]{1, 2, 3, 4, 5})));
    }
}
