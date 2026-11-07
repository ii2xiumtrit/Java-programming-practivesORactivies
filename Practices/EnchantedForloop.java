package Practices;

import java.util.ArrayList;

public class EnchantedForloop {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<String>();
        
        String[] Animals = {"Cat", "dog", "rat"};

        // animals.add("Meow");
        // animals.add("WoofWoof");
        // animals.add("Roar");

        for(String i : Animals) {
            System.out.println(i);
        }
    }
}
