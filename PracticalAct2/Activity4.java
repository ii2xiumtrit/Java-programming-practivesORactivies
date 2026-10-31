package PracticalAct2;

public class Activity4 {
    public static void main(String[] args) {
        int OGprice = 500;
        double discount = 10;
        double discounted = OGprice * (discount / 100);

        System.out.println("Original price: "+OGprice);
        System.out.println("Discount: "+discount);
        System.out.println("Final price: "+ (OGprice - discounted));
    }
}
