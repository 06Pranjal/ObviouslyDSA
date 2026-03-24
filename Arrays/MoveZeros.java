package Arrays;

import java.util.Arrays;

public class MoveZeros {
    int[] shiftZeros(int[] arr) {
        int last = arr.length - 1;

        for (int i = 0; i <= last; ) {

            if (arr[last] == 0) last--;

            else if (arr[i] == 0) {
                int temp = arr[i];
                arr[i] = arr[last];
                arr[last] = temp;
                last--;
            }

            else i++;
        }
        return arr;
    }

    public static void main(String[] args) {
        MoveZeros obj = new MoveZeros();
        System.out.println(Arrays.toString(obj.shiftZeros(new int[]{0, 1, 0, 3, 12})));
    }
}
