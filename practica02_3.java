interface Animal {
    void sound();
}

class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Woof!");
    }
}

class Horse implements Animal {
    @Override
    public void sound() {
        System.out.println("Meow!");
    }
}

public class practica02_3 {
    public static void main(String[] args) {

        var myDog = new Dog();  // Dog
        var myHorse = new Horse();  // Cat

        myDog.sound();
        myHorse.sound();
    }
}
