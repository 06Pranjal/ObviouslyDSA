package Sorting;

public class CountingSort {

    public static int[] count(int[] arr) {

        int max = arr[0];

        // Find maximum
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Create count array
        int[] count = new int[max + 1];

        // Store frequencies
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        int index = 0;

        // Build sorted array
        for (int i = 0; i < count.length; i++) {

            while (count[i] > 0) {

                arr[index] = i;
                index++;

                count[i]--;
            }
        }

        return arr;
    }

    public static void main(String[] args) {

        int[] arr = count(new int[]{2,5,3,0,2,3,0,3});

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}