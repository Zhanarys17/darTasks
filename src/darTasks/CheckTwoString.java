package darTasks;

public class CheckTwoString {

    public static void main(String[] args) {
        String[] arr1 = {"a","cb"};
        String[] arr2 = {"ab","c"};
        System.out.println(arrayStringsAreEqual(arr1,arr2));
    }


    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1 = "", str2 = "";

        for (String s : word1) {
            str1 += s;
        }

        for (String s : word2) {
            str2 += s;
        }

        if (str1.equals(str2))
            return true;

        return false;
    }
}
