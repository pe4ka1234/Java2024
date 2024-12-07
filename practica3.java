public class practica3 {
    enum Animal { CAT, DOG, MOUSE }

    public static void main(String[] args) {
        // byte, short, char, int
        int value = 2;
        switch (value) {
            case 1: System.out.println("One"); break;
            case 2: System.out.println("Two"); break;
            default: System.out.println("Other");
        }

        // enum
        Animal animal = Animal.CAT;
        switch (animal) {
            case CAT: System.out.println("Meow!"); break;
            case DOG: System.out.println("Woof!"); break;
            default: System.out.println("A-a-a..");
        }

        // string
        String name = "Christmas";
        switch (name) {
            case "Hello": System.out.println("Hello!"); break;
            case "Christmas": System.out.println("Merry Christmas!"); break;
            default: System.out.println("Happy holiday!");
        }

        // Byte, Short, Character, Integer
        Integer num = 10;
        switch (num) {
            case 5: System.out.println("Five"); break;
            case 10: System.out.println("Ten"); break;
            default: System.out.println("Other");
        }
    }
}
