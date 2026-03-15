package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintNegative {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the size of the array: ");
        int n=Integer.parseInt(in.readLine());
        int []arr=new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(in.readLine());
        }
        System.out.println("The negative number is: ");
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                System.out.println(arr[i]);
            }
        }

    }
}
