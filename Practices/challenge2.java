package Practices;
import java.util.ArrayList;

public class challenge2 {
    public static void main(String[] args) {
        ArrayList<Integer> result = new ArrayList<>();

        int[] lists = {15, -8, 6, -12, 9};

        for(int i = 0 ; i < lists.length ; i++){
            if (lists[i] % 3 == 0 && lists[i] > 5 || lists[i] % 4 == 0 && lists[i] < 0) {
                result.add(lists[i]);
                System.out.println(result);
            }
        }
    }
}

