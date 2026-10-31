package PracticalAct2;

public class Activity8 {
    public static void main(String[] args) {
        int totalprice = 800;
        boolean isMember = true;

        System.out.println("Total purchase: "+totalprice);
        System.out.println("Is member: "+isMember);
        System.out.println("free shipping: "+(totalprice >= 1000 || isMember ==true));
    }
}
