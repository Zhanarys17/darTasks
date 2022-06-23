package darTasks;

import java.util.Arrays;
import java.util.Random;

public class UniqueIntegers {
    public static void main(String[] args) {
        int[] arr = sumZero(5);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] sumZero(int n) {
        int[] arr = new int[n];
        Random random = new Random();
        int sum = -1;

        while (sum != 0){
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(100);
                sum += arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
        }

        return arr;
    }
}
