package week6;

import java.util.Scanner;

class Students {
    private String name;
    private int age;

    public Students(String name, int age) {
        this.name = name;
        this.age = age;
    }

    

    public String GetName() {
        return name;
    }

    public void Setname(String newName){
        this.name = newName;
    }

    public int GetAge() {
        return age;
    }

    public void SetAge(int newAge) {
        this.age = newAge;
    }
}
public class Main {
    public static void main(String[] args) throws InterruptedException {


        Students Anabel = new Students("Anabell", 15);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\nCurrent name: "+Anabel.GetName());
        System.out.println("Current age: "+Anabel.GetAge()+"\n");
        Thread.sleep(1500);

        int Option = 0;
        do {
            System.out.println("\nWould you like to reset name or age? ");
            Menu();
            Option = sc.nextInt();
            switch (Option) {
                case 1:
                    System.out.print("New name: ");
                    String newName = sc.next();
                    Anabel.Setname(newName);

                    System.out.println("\nCurrent name: "+Anabel.GetName());
                    System.out.println("Current age: "+Anabel.GetAge()+"\n");
                    Thread.sleep(1500);

                    break;
                case 2:
                    System.out.print("New Age: ");
                    int newAge = sc.nextInt();
                    Anabel.SetAge(newAge);

                    System.out.println("Current name: "+Anabel.GetName());
                    System.out.println("Current age: "+Anabel.GetAge()+"\n");
                    Thread.sleep(1500);

                    break;
                default:
                    
                    System.out.println("Exiting.");
            }
        Thread.sleep(1500);
        } while(Option != 3);
    }

    public static void Menu() {
        System.out.println("1. Name Change.");
        System.out.println("2. Age change.");
        System.out.println("3. Exit.");

        
    }


}
