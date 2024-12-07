public class practica2_2 {
    Object obj = "Hello, World!";
        if (obj instanceof String) {
        System.out.println("obj является строкой и его значение: " + obj);
    }

    Animal animal = new Dog();
        if (animal instanceof Dog) {
        System.out.println("animal является объектом класса Dog.");
    }
        if (animal instanceof Animal) {
        System.out.println("animal также является объектом класса Animal.");
    }

    Object nullObj = null;
        if (nullObj instanceof String) {
        System.out.println("nullObj является строкой.");
    } else {
        System.out.println("nullObj не является строкой (instanceof всегда false для null).");
    }
}
}
