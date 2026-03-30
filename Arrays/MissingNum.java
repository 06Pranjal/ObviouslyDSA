package Arrays;

public class MissingNum {
    int sum=0;
    int acSum=0;
    int sum(int[] arr){
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        return sum;
    }
    int actualSum(int[] arr){
        int n=arr.length+1;
        acSum=(n*(n+1))/2;
        return acSum;
    }

    public static void main(String[] args) {
        MissingNum ob=new MissingNum();
        int totSum=ob.sum(new int[]{8, 2, 4, 5, 3, 7, 1});
        int actSum=ob.actualSum(new int[]{8, 2, 4, 5, 3, 7, 1});
        System.out.println(actSum-totSum);
    }

}
