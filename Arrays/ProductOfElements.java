package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProductOfElements {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int pro=1;
        System.out.print("Enter Size of Array: ");
        int n=Integer.parseInt(br.readLine());
        int[] arr=new int[n];
        System.out.println("Enter Elements of Array: ");
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        System.out.print("The Product of Array is: ");
        for(int i=0;i<n;i++){
            pro=pro*arr[i];
        }
        System.out.println(pro);

    }
}
