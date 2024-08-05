package opps;

abstract class Animal {
    abstract void walk();

    Animal() {
        System.out.println("creating an animal....");
    }

    public void eat() {
        System.out.println("Animal is eating");
    }
    
    public void sound() {
        System.out.print("animal is making sound....");
    }
}

class Dog extends Animal {
    public final void sound() {
        System.out.println("Bark! Bark!");
    }
    Dog() {
        System.out.println("You successfully created a dog");
    }
    public void walk() {
        System.out.println("dog is walking");
    }
}

class Cat extends Animal {
    public final void sound() {
        System.out.println("Mew! Mew!");
    }
    Cat() {
        System.out.println("You successfully created a Cat");
    }
    public void walk() {
        System.out.println("Cat is walking");
    }
}
public class Abstraction {
    public static void main(String args[]) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        dog.sound();
        cat.sound();
    }
}
