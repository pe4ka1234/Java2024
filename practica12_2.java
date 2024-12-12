public class practica12_2 {
    static class Animal {
        // метод суперкласса
        public String RussianName() {
            return "Какая-то животинка";
        }
    }

    static class Cat extends Animal {
        // переопределенный метод
        @Override
        public String RussianName() {
            return "Кошка";
        }
    }

    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myCat = new Cat();

        System.out.println("Animal: " + myAnimal.RussianName()); // Вызов метода Animal
        System.out.println("Cat: " + myCat.RussianName()); // Вызов метода Dog
    }
}
