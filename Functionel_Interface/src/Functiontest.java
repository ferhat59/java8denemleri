import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Stream;

public class Functiontest {
    public static void main(String[] args) {
        Function<String, Integer>  stringIntegerFunction =Functiontest::convert;
        stringIntegerFunction.apply("123");
         Arrays.stream("14,123".split(",")).map(stringIntegerFunction).forEach(System.out::println);
         //Yapılandırıcı metod ile çalışması
        Function<Integer,Integer> integerIntegerFunction2 = Integer::new;
        System.out.println(15);
    }
    public static int convert(String a){
        return Integer.parseInt(a);
    }
}
