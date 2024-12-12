interface MyInterface {

    // Вложенный класс
    class NestedClass {
        public void displayMessage() {
            System.out.println("Это метод из вложенного класса в интерфейсе.");
        }
    }

    // Статический метод интерфейса (для вызова вложенного класса)
    static void useNestedClass() {
        NestedClass nested = new NestedClass();
        nested.displayMessage();
    }
}

public class practica15 {
    public static void main(String[] args) {
        // 1. Прямой вызов через имя интерфейса
        MyInterface.NestedClass nested = new MyInterface.NestedClass();
        nested.displayMessage();

        // 2. Вызов через статический метод интерфейса
        MyInterface.useNestedClass();
    }
}
