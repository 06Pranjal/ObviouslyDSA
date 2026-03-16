package Arrays;

public class Minimum {
    public static void main(String[] args) {
        int[] arr={4,-56,5,-56,3,0};
        int min=arr[0];
        for(int j=1;j<arr.length;j++){
            if(arr[j]<min){
                min=arr[j];
            }
        }
        System.out.println("The Minimum Number is: "+min);
    }
}
