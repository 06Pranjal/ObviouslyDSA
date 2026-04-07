package Arrays;

import java.util.ArrayList;

public class ArrayListProgram {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();

        //to add element in the arry List
        arr.add(10);
        arr.add(89);
        arr.add(56);
        arr.add(45);

        //to print the element
        System.out.println(arr.get(3));

        //to change the existing value
        arr.set(3,50);
        System.out.println(arr.get(3));
    }
}
