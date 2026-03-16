package Arrays;

public class ShallowCopy {
    public static void main(String[] args) {
        int [] arr={10,20,30,50,60};
        int []x=arr;//shallow copy
        x[0]=100;
        System.out.println(arr[0]);
    }
}
