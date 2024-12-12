import java.util.StringJoiner;

public class practica18_2 {
    public static void main(String[] args) {
        // cоздание StringJoiner с разделителем
        StringJoiner sj = new StringJoiner(", ", "[", "]");
        sj.add("I have a pen");
        sj.add("I have an apple");
        sj.add("M-m-m apple-pen");
        System.out.println("StringJoiner result: " + sj);

        // bспользование StringJoiner без начальной и конечной строки
        StringJoiner sj2 = new StringJoiner(";");
        sj2.add("I have a pen");
        sj2.add("I have a pineapple");
        sj2.add("M-m-m pineapple-pen");
        System.out.println("StringJoiner result: " + sj2);
    }
}
