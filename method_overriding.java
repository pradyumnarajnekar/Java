class Vehicle {
    String printer() {
        return "Vehicle";
    }
}
class Car extends Vehicle {
    String printer() {
        return "Car";
    }
}
public class overriding {
    public static void main(String args[]) {
        Vehicle P1 = new Vehicle();
        Car P2 = new Car();
        System.out.println("The category is a : " + P1.printer());
        System.out.println("The sub-category is a : " + P2.printer());
    }
}
