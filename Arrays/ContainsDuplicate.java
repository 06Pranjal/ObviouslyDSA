package Arrays;

public class ContainsDuplicate {
    Boolean duplicate(int[] arr){
        for(int i=0;i<arr.length;i++){
            int x=arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]==x){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate c=new ContainsDuplicate();
        System.out.println(c.duplicate(new int[]{1,2,3,-1}));
    }
}
