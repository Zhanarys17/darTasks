package darTasks;

public class SunOfOddLength {

    public static int sumOddLengthSubarrays(int[] arr) {
        int sumAll = 0;


        for (int i = 0; i < arr.length; i++) {
            sumAll += arr[i];

            if (arr.length < 3){
                return sumAll;
            } else if (arr.length == 3){
                return  sumAll * 2;
            }
        }
        return -1;
    }
}
