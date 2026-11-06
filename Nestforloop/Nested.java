package Nestforloop;

public class Nested {
    public static void main(String[] args) {
        int evenCounter = 0;
        int oddCounter = 0;
        for(int i = 1; i <= 5 ; i++) {
            
            int sum = 0;
            
            for (int j = 1; j<=5;j++) {
                
            
                String zero = "";
                int product = j * i;
                String even = "";
                
                if (product < 10) {
                    zero = "0";
                }
                if (product % 2 == 0) {
                    even = "-E";
                    evenCounter++;
                } else {
                    even = "-O";
                    oddCounter++;
                }
                sum += product;
                System.out.print(zero+product+even+" ");
            }
            System.out.println("= "+sum);
        
        }
        System.out.println("Odd: "+oddCounter);
        System.out.println("Even: "+evenCounter);
    }
}