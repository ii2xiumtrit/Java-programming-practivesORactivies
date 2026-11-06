package Nestforloop;

public class Nested {
    public static void main(String[] args) {

        for(int i = 1; i <= 5 ; i++) {
            
            int sum = 0;

            for (int j = 1; j<=5;j++) {
                
               
                String zero = "";
                int product = j * i;

                if (product < 10) {
                    zero = "0";
                }

                sum += product;
                System.out.print(zero+product+" ");
            }
            System.out.println("= "+sum);
        }
    }
}