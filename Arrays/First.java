package Arrays;

import java.io.*;

public class First {
    public static void main(String[] args)throws IOException {
        BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter size: ");
        int size=Integer.parseInt(in.readLine());
        int [] arr=new int[size];
        for(int i=0;i<size;i++){
            System.out.print("The "+(i+1)+" number is: ");
            arr[i]=Integer.parseInt(in.readLine());
        }
        System.out.println("The Array is: ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
