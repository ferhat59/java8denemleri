package Binary;

import java.util.function.BiFunction;
import java.util.stream.Stream;

public class BifunctionTest {
    public static void main(String[] args) {
        BiFunction<String,String,Integer> stringStringIntegerBiFunction = (String a,String b)->a.length()+b.length();

        System.out.println(stringStringIntegerBiFunction.apply("ferhat","camgöz"));
        a<String> a1 = String::new;
        a1.dene().split("ferhat");
    }
}
@FunctionalInterface
interface a<T>{
    T dene();
}
