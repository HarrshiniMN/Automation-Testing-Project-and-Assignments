package com.Assignment;

interface Animal {
    void sound();
}

interface Vehicle {
    void speed();
}

class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Bark!");
    }
}

class Car implements Vehicle {
    @Override
    public void speed() {
        System.out.println("Speed: 120 km/h");
    }
}

class AnimalVehicle implements Animal, Vehicle {
    @Override
    public void sound() {
        System.out.println("Animal Sound: Roar!");
    }

    @Override
    public void speed() {
        System.out.println("Vehicle Speed: 180 km/h");
    }
}

public class MultipleInheritanceExample {
    public static void main(String[] args) {
        // Creating object of Dog class and calling method
        Dog dog = new Dog();
        dog.sound();

        // Creating object of Car class and calling method
        Car car = new Car();
        car.speed();

        // Creating object of AnimalVehicle class and calling methods
        AnimalVehicle animalVehicle = new AnimalVehicle();
        animalVehicle.sound();
        animalVehicle.speed();
    }
}