package com.campusdual.classroom;

public class Car {

    public String brand;
    public String model;
    public static final int MAX_SPEED = 120;
    public String fuel;
    public int speedometer = 0;
    public int tachometer = 0;
    public String gear = "N";
    public boolean reverse = false;
    public int wheelsAngle = 0;

    public Car(String brand, String model, String fuel) {
        this.brand = brand;
        this.model = model;
        this.fuel = fuel;
        this.gear = "N";
    }

    public Car() {
        this.brand = "BRAND";
        this.model = "MODEL";
        this.fuel = "FUEL";
        this.gear = "N";
    }

    public void start() {
        if (!isTachometerGreaterThanZero()) {
            this.tachometer = 1000;
            System.out.println("Vehículo acendido");
        } else {
            System.out.println("O vehículo xa está acendido");
        }
    }

    public void stop() {
        if (!isTachometerEqualToZero() && this.speedometer == 0) {
            this.tachometer = 0;
            System.out.println("Vehículo apagado");
        } else {
            System.out.println("Non se pode apagar o vehículo, primeiro ten que estar detido");
        }
    }

    public void accelerate() {
        if (this.tachometer > 0 && this.speedometer < MAX_SPEED) {
            this.speedometer += 20;
            this.tachometer += 1000;
            System.out.println("Acelerando...");
        } else {
            System.out.println("Non se pode acelerar, o vehículo xa está a máxima velocidade");
        }

    }

    public void brake() {
        if (this.speedometer > 0 ) {
            this.speedometer -= 20;
            System.out.println("(-20) Frenando...");
        } else {
            System.out.println("El vehículo xa está parado");
        }
    }

    public void turnAngleOfWheels(int angle) {
        boolean isStart  = this.tachometer > 0;
        if (isStart) {
            this.wheelsAngle += angle;
            if (this.wheelsAngle > 45) {
                this.wheelsAngle = 45;
            } else if (this.wheelsAngle < -45) {
                this.wheelsAngle = -45;
            }
            System.out.println("Girando volante " + angle + " grados");
        } else {
            System.out.println("Non se pode xirar o volante, o vehículo ten que estar en marcha");
        }
    }

    public String showSteeringWheelDetail() {
        if (this.wheelsAngle > 5) {
            return "Gira á dereita";
        } else if (this.wheelsAngle < 5) {
            return "Gira á esquerda";
        }
        return "Non se pode xirar o volante";
    }

    public boolean isReverse() {
        if(this.gear == "R" && this.reverse){
            System.out.println("Marcha atras...");
            return true;
        }
        else {
            System.out.println("Non se pode cambiar a marcha a marcha atrás, o vehículo ten que estar parado");
            return false;
        }
    }

    public void setReverse(boolean reverse) {
        if (this.speedometer > 0) {
            System.out.println("Non se pode cambiar a marcha a marcha atrás, o vehículo ten que estar parado");
        } else {
            this.gear = "R";
            this.reverse = true;
        }
    }

    public void showDetails() {
        System.out.println("Marca: " + this.brand);
        System.out.println("Modelo: " + this.model);
        System.out.println("Combustible: " + this.fuel);
        System.out.println("Velocímetro: " + this.speedometer);
        System.out.println("Tacómetro: " + this.tachometer);
        System.out.println("Marcha: " + this.gear);
        System.out.println("Ángulo de dirección: " + this.wheelsAngle);

    }

    public boolean isTachometerEqualToZero() {
        return this.tachometer == 0;
    }

    public boolean isTachometerGreaterThanZero() {
        if( this.tachometer > 0) return true;
        else return false;
    }
}