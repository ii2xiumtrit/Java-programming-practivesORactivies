package week6;


public class inheritance {
    public static void main(String[] args){
        Bike bike = new Bike();
        Car car = new Car();


        bike.Pedal();
        car.accelerate();
    }
}

class Vehicles {
    int speed;
    

    void Go() {
        System.out.println("The vehicle is accelerating.");
    }

    void Stop() {
        System.out.println("The vehicle is stopping.");
    }
}

class Car extends Vehicles{
    void accelerate() {
        System.out.println("Now going.");
    }
}

class Bike extends Vehicles{
    
    void Pedal() {
        System.out.println("Now pedaling.");
    }
}