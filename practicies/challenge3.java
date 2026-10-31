package practicies;
import java.util.ArrayList;

public class challenge3 {
    public static void main(String[] args) {
        ArrayList<Integer> result = new ArrayList<>();
        int[] variables = {10, -4, 25, -2, 30};

        for(int i = 0; i < variables.length ; i++){
            if (variables[i] % 5 == 0 && variables[i] > 0 || variables[i] % 2 ==0 && variables[i] >= -10 && variables[i] <= 0) {
                result.add(variables[i]);
                System.out.println(result);
                
            }}
        }
    }

