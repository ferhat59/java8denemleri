import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class map {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ali", "Veli", "Selami", "Cem");

        Stream<String> stream = names.stream();
        Stream<String> upperStream= stream.map(name -> name.toUpperCase());
        List upperNames =(List) upperStream.collect(Collectors.toList());
        IntStream
                .rangeClosed(1, 5)
                .map(n -> n*n)
                .forEach(System.out::println);
    }
}
