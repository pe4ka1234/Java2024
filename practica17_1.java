interface mySecondInterface {
    default void defaultMethod() {
        System.out.println("Default method");
    }
    static void staticMethod() {
        System.out.println("Static method");
    }
}

public class practica17_1 {
    static class MyClass implements mySecondInterface {
        // можно переопределить
        @Override
        public void defaultMethod() {
            System.out.println("Overridden default method in the class");
        }
    }

    public static void main(String[] args) {
        MyClass myObject = new MyClass();

        myObject.defaultMethod();

        mySecondInterface.staticMethod();
    }
}
