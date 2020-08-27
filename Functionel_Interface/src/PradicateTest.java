import java.util.function.Predicate;
import java.util.stream.Stream;

public class PradicateTest {

    public static void main(String[] args) {
        //java 7
        String[] st=  {"a","b","ab","abc","dg"};
int toplam=0;
for(String s :st){
    if(s.startsWith("a")){
        toplam++;
    }
}
//java 8
        Predicate<String> p = (s -> s.startsWith("a"));
        Predicate<String> p2 = (s->s.startsWith("b"));
        Predicate<String> p3 = p.or(p2);
        Stream.of("a","b","c","f").filter(p3).forEach(System.out::println);

      System.out.println(Stream.of("as","afsdf","b").filter(p2).count());
    }
}
