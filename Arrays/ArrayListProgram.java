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
        System.out.println("The 3rd element is "+arr.get(3));

        //to change the existing value
        arr.set(3,50);
        System.out.println("The new value of 3rd element is "+arr.get(3));

        //to calculate length
        System.out.println("The Size of Array List is "+arr.size());

        //to print complete list
        System.out.println("The ArrayList is :-");
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }

        System.out.println();
        System.out.println("Element got inserted");

        //to insert a element on the particular index
        arr.add(2,100);

        System.out.println(arr);
    }
}
