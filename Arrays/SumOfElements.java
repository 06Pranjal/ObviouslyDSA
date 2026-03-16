package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfElements {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double sum=0.0;
        System.out.print("Enter Size of Array: ");
        int n=Integer.parseInt(br.readLine());
        int[] arr=new int[n];
        System.out.println("Enter Elements of Array: ");
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        System.out.print("The Sum of Array is: ");
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);

    }
}
