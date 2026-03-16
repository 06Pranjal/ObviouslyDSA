package Arrays;

public class Maximum {
    public static void main(String[] args) {
        int[] arr={20,10,9,-100,1,7};
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
            System.out.println("The Maximum Number is: "+max);
    }
}

