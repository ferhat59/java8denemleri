import java.util.stream.IntStream;

public class reduce {
    public static void main(String[] args) {
        int result = IntStream
                .of(1, 2, 3, 4, 5)
                .reduce(0, (oncem, sonra) -> {
                    System.out.format("%d - %d %n", oncem, sonra);
                    return oncem + sonra;
                });
    }
}
