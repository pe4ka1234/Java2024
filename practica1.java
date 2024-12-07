import java.util.Scanner;
public class practica1 {
    public static void main(String[] args) {
        // Создаем объект Scanner для считывания данных из консоли
        Scanner scanner = new Scanner(System.in);

        // Просим пользователя ввести имя
        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine(); // Считываем строку, введенную пользователем

        // Выводим приветствие с введенным именем
        System.out.println("Привет, " + name + "!");

        // Закрываем Scanner для освобождения ресурсов
        scanner.close();
    }
}
