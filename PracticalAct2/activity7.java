package PracticalAct2;

public class activity7 {
    public static void main(String[] args) {
        int grade = 92;
        boolean Nofail = true;

        System.out.println("Grade: "+grade);
        System.out.println("No failing subject: "+Nofail);
        System.out.println("Eligible for scholarship: "+(grade > 90 && Nofail == true));
    }
}
