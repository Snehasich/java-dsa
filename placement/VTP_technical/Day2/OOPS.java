package VTP_technical.Day2;

public class OOPS {
    public static void main(String[] args) {
        Car car1 = new Car();                       // car1 is an instance of Car
        System.out.println(car1.color = "Black");
        System.out.println(car1.mileage = 50);
        System.out.println(car1.speed = 180);

        Car car2 = new Car();                       // car2 is an instance of Car
        System.out.println(car2.color = "Blue");
        System.out.println(car2.mileage = 20);
        System.out.println(car2.speed = 100);

        System.out.println(car1.speed >= car2.speed ? "Car 1 speed is more" : "Car 2 speed is more");

    }
}

class Car {
    float speed;
    int mileage;
    String color;

    void carAvailable() {
        System.out.println("Car is Available");
    }

    void breaks() {
        System.out.println("Breaking...");
    }
}