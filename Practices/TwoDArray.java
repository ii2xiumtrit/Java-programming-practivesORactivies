package Practices;

public class TwoDArray {
    public static void main(String[] args) {
        String[] fruits = {"apple", "banana", "mango", "pineapple"};
        String[] veggies = {"Celery", "onions", "carrot"};
        String[] meats = {"Chicken", "pork", "beef"};

        String[][] groceries = {
            fruits,
            veggies,
            meats
        };

        for (String[] foods : groceries) {
            for (String food : foods) {
                System.out.println(food + " ");
            }
        }
    }
}
