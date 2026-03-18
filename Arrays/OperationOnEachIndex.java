package Arrays;

public class OperationOnEachIndex {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6};
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                arr[i]=arr[i]+10;
            }else {
                arr[i]=arr[i]*2;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
