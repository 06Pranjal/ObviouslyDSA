package Arrays;

public class Search {
    Boolean findNum(int x,int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Search search = new Search();
        System.out.println(search.findNum(10,new int[]{1,2,3,4,5,6,7,8,9}));
    }
}
