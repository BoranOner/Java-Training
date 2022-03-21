package com.company.interfaces;

abstract class Animal{
    abstract void bark();
}

class Dog extends Animal{

    @Override
    void bark() {
        System.out.println("Bow Bow");
    }
}
class Cat extends Animal{

    @Override
    void bark() {
        System.out.println("Meow Meow");
    }
}

interface Flyable{
    void fly();
}

class Bird implements  Flyable{

    @Override
    public void fly() {
        System.out.println("with wings");
    }
}

class Aeroplane implements Flyable{

    @Override
    public void fly() {
        System.out.println("with fuel");
    }
}


public class FlyableRunner {
    public static void main(String[] args) {
        Flyable[] flyingObjects = { new Bird(), new Aeroplane()};
        for(Flyable object: flyingObjects){
            object.fly();
        }

        Animal[] animals = {new Cat(),new Dog()};
        for(Animal animal:animals){
            animal.bark();
        }
    }
}
