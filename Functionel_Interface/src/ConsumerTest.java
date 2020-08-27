import java.util.function.Consumer;

public class ConsumerTest {
    public static void main(String[] args) {
        String a="sad";
      //  System.out.println(a.toUpperCase());
        Consumer<String> consumer = c->c.startsWith("a");
        consumer.accept(a);
    }
}
