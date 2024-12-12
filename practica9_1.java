public class practica9_1 {
    enum Day {
        MONDAY("Понедельник"),
        TUESDAY("Вторник"),
        WEDNESDAY("Среда"),
        THURSDAY("Четверг"),
        FRIDAY("Пятница"),
        SATURDAY("Суббота"),
        SUNDAY("Воскресенье");

        private String russianName;

        // Конструктор перечисления
        Day(String russianName) {
            this.russianName = russianName;
        }
    }

    public static void main(String[] args) {
        Day day = Day.MONDAY;
    }
}
