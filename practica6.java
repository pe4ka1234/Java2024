public class practica6 {
    static class OverloadingExample {
        // Метод с одним аргументом
        public void display(String message) {
            System.out.println("Message: " + message);
        }

        // Перегруженный метод с двумя аргументами
        public void display(String message, int count) {
            System.out.println("Message: " + message + " (count: " + count + ")");
        }
    }

    static class Parent {
        public void show() {
            System.out.println("Parent: show()");
        }
    }

    static class Child extends Parent {
        @Override
        public void show() {
            System.out.println("Child: show()");
        }
    }

    public static void main(String[] args) {
        // Пример перегрузки
        OverloadingExample overloadingExample = new OverloadingExample();
        overloadingExample.display("Hello, World!");
        overloadingExample.display("Hello, Java!", 7);

        // Пример переопределения
        Parent parent = new Parent();
        parent.show(); // Вызов метода суперкласса

        Child child = new Child();
        child.show(); // Вызов переопределенного метода

        Parent parentReference = new Child();
        parentReference.show();
    }

}
