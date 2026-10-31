package PracticalActivities;

public class Activity6 {
    public static void main(String[] args) {
        int age = 20;
        boolean hasID = true;

        System.out.println("age: "+age);
        System.out.println("has ID: "+ hasID);
        System.out.println("Can enter: "+ (hasID && age > 18));
    }
}
