interface Cats {
    void sound();
}

class Cat implements Cats {
    @Override
    public void sound() {
        System.out.println("Meow!");
    }
}

class Kitten implements Cats {
    @Override
    public void sound() {
        System.out.println("Meow-meow!");
    }
}

public class practica2_2 {
    public static void main(String[] args) {
        Object obj = "Woof!";
        if (obj instanceof String) {
            System.out.println("obj является строкой: " + obj);
        }

        Cats animal = new Cat(); // Используем конкретную реализацию интерфейса
        if (animal instanceof Cat) {
            System.out.println("animal является объектом класса Cat.");
        }
        if (animal instanceof Cats) {
            System.out.println("animal также является объектом класса Cats.");
        }

        Object nullObj = null;
        if (nullObj instanceof String) {
            System.out.println("nullObj является строкой.");
        } else {
            System.out.println("nullObj не является строкой (instanceof всегда false для null).");
        }
    }
}
