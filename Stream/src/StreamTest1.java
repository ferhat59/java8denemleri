import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class StreamTest1 {
    public static void main(String[] args) {
                                //intermadiate oprarion     terminal operation
      //Stream.of(12,342,564,123).filter(i ->i%2==0).sorted().forEach(System.out::println);
     /*   IntPredicate a1 =i ->i%2==0;
        int dizi[] = {1,23,4,56,77,8};
        Arrays.stream(dizi).map(k -> k * k ).sorted().forEach(i -> System.out.println(i));
     Arrays.stream(dizi).peek(System.out::println);*/
     Stream.generate(()->"true").forEach((s->System.out.println()));
     Stream<String> s1 = Stream.of("ferhat","camgöz","ali","b");
     Comparator<String> comparator = (String a,String b)->a.length()-b.length();
    Optional<String> optional= s1.min(comparator);
        List<String> stringList =Arrays.asList("ferhat","2","asdf","a3");
        Stream<String> stringStream=Stream.generate(()->"ali");
        Predicate<String> stringPredicate=x->Character.isLetter(x.charAt(0));
Stream.of(12,123,45,123).distinct().forEach(System.out::println);
stringList.stream().allMatch(stringPredicate);

       //int a= IntStream.rangeClosed(1,101).sum();
        System.out.println(optional);
    }
}
