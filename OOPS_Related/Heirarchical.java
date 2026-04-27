class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Meowing...");
    }
}

public class Heirarchical {
    public static void main(String[] args) {

        Dog d = new Dog();
        Cat c = new Cat();

        d.eat();   // inherited from Animal
        d.bark();  // Dog method

        c.eat();   // inherited from Animal
        c.meow();  // Cat method
    }
}
