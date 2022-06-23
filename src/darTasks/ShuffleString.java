package darTasks;

import java.util.Scanner;

public class ShuffleString {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();

        System.out.println(restoreString(s,new int[]{2,1,0}));
    }


    public static String restoreString(String s, int[] indices) {
        String result = "";
        for (int i = 0; i < indices.length; i++) {
            int currentId = indices[i];
            result += s.charAt(currentId);
        }
        return result;
    }
}
