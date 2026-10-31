package PracticalAct2;

public class Activity6 {
    public static void main(String[] args) {
        int productA = 150;
        int productB = 200;

        System.out.println("Product A: "+ productA);
        System.out.println("Product B: "+productB);
        System.out.println("Product A is cheaper: "+(productA < productB));
        System.out.println("Product A is expensive: "+(productA > productB));
        System.out.println("Same price: "+(productA == productB));
    }
}
