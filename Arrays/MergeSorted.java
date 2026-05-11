package Arrays;

public class MergeSorted {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int k=0;
            int j=0;
            int[] arr3=new int[m+n];
            for(int i=0;i<m;i++){
                for(int l=0;l<n;l++){
                    if(nums1[i]<nums2[l])
                        arr3[k]=nums1[i];
                    else
                        arr3[k]=nums2[l];
                }
            }
            for(int i=0;i<m+n;i++){
                System.out.println(arr3[i]);
            }


    }

    public static void main(String[] args) {
        MergeSorted ob=new MergeSorted();
        ob.merge(new int[]{1,2,3},3,new int[]{4,5,6},3);
    }
}
