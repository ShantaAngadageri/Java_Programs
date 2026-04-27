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

class Puppy extends Dog {
    void weep() {
        System.out.println("Weeping...");
    }
}

public class Hybrid {
    public static void main(String[] args) {

        Dog d = new Dog();
        Cat c = new Cat();
        Puppy p = new Puppy();

        p.weep();
        p.bark();
        p.eat();

        d.eat();
        d.bark();

        c.eat();
        c.meow();
    }
}
