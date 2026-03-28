package Arrays;

class SecondLargest {
    public int getSecondLargest(int[] arr) {
        // code here
        int max=Integer.MIN_VALUE;
        int sMax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        for(int i=0;i< arr.length;i++)
        {
            if(arr[i]>sMax && arr[i]!=max)
            {
                sMax=arr[i];
            }
        }
        if(sMax==Integer.MIN_VALUE){
            return -1;
        }else {
            return sMax;
        }

    }

    public static void main(String[] args) {
        SecondLargest obj=new SecondLargest();
        System.out.println(obj.getSecondLargest(new int[]{10,10,10}));
    }
}
