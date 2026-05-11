package Sorting;

public class BubbleSort {
     public void bubbleSort(int[] arr){
          for(int i=0;i<arr.length;i++){
               for(int j=0;j<(arr.length)-1;j++){
                    if(arr[j]>arr[j+1]){
                         int temp=arr[j];
                         arr[j]=arr[j+1];
                         arr[j+1]=temp;
                    }
               }

          }
          for(int k=0;k<arr.length;k++){
               System.out.print(arr[k]+" ");
          }
     }

     public static void main(String[] args) {
          BubbleSort ob=new BubbleSort();
          ob.bubbleSort(new int[]{5,6,1,3});

     }
}
