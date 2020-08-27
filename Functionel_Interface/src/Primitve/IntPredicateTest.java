package Primitve;

import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class IntPredicateTest {
    public static void main(String[] args) {
        //hızlı
        IntPredicate intPredicate = i -> i % 2 == 0;
        //yavaş
        Predicate<Integer> integerPredicate = i -> i % 2 == 0;
        IntStream.range(10, 1000).filter(intPredicate).forEach(System.out::println);
    }
}
