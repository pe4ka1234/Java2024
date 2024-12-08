class OldClass {
    @Deprecated
    public void oldMethod() {
        System.out.println("Устаревший метод.");
    }

    public void newMethod() {
        System.out.println("Новый метод.");
    }
}

public class practica16_2 {
    public static void main(String[] args) {
        OldClass obj = new OldClass();
        obj.oldMethod(); // Компилятор выдаст предупреждение
        obj.newMethod();
    }
}
