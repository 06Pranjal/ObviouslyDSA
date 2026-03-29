package Arrays;

class RotateArray {
    static void reverseArray(int[] arr,int i,int j){
        while(i<j){
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            i++;
            j--;
        }
    }
    static void rotateArr(int arr[], int d) {
        // code here

            reverseArray(arr,0,d-1);


            reverseArray(arr,d, arr.length-1);


            reverseArray(arr,0, arr.length-1);

        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+ " ");
        }

    }

    public static void main(String[] args) {
        rotateArr(new int[]{1,2,3,4,5},2);
    }
}
