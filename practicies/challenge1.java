package practicies;
import java.util.ArrayList;


public class challenge1 {
    public static void main(String[] args){
        int[] arrays = {12, -5, 8, 20, -3, 15, 4, -1};
        ArrayList<Integer> result = new ArrayList<>();
        int lengthy = arrays.length;

        for(int i = 0; i < lengthy; i++ ){
            if((arrays[i] % 2 == 0 && arrays[i] > 10) || (arrays[i] % 2 != 0 && arrays[i] < 0)){
                result.add(arrays[i]);
                System.out.println(result);
            }
        }
    }
}