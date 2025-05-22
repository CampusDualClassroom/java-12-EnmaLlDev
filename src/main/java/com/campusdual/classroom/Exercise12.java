package com.campusdual.classroom;

public class Exercise12 {
    public static void main(String[] args) {
        Car CAR = new Car("Audi", "A4", "Gasoline");

        if (CAR.isTachometerEqualToZero()) {
            System.out.println("El tacometro está a cero");
        } else {
            System.out.println("El tacometro no está a cero");
        }
        CAR.start();
        System.out.println(CAR.isTachometerGreaterThanZero());
        CAR.accelerate();
        //CAR.start();
        //CAR.accelerate();
        //CAR.accelerate();
        //CAR.brake();
        //CAR.brake();
        CAR.turnAngleOfWheels(20);
        CAR.turnAngleOfWheels(100);
        CAR.showSteeringWheelDetail();
        CAR.brake();
        CAR.setReverse(true);
        CAR.isReverse();
        CAR.showDetails();
    }
}