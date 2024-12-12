import java.io.FileInputStream;
import java.io.IOException;

class MyResource implements AutoCloseable {
    public void use() {
        System.out.println("Ресурс используется");
    }

    @Override
    public void close() {
        System.out.println("Ресурс закрыт");
    }
}

public class practica25_3 {
    public static void main(String[] args) {
        try (MyResource resource = new MyResource()) {
            resource.use();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
