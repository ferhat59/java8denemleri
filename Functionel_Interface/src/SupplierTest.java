import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierTest {
    public static void main(String[] args) {
        Random random = new Random();
        Supplier<Integer> supplier = () ->random.nextInt(10);
        Stream.generate(supplier).limit(10).forEach(System.out::println);
        Supplier<String> supplier1 = String::new;

    }
}
