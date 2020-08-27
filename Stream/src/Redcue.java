import java.util.Arrays;
import java.util.Optional;
import java.util.Random;
import java.util.TreeSet;
import java.util.stream.Stream;

public class Redcue {
    public static void main(String[] args) {
        String []dizi= new String[]{"a   ","b  ","    c","d" };
Optional<String> k =Arrays.stream(dizi).reduce((String a, String b) -> a+b);
      System.out.println(k.get());
        TreeSet<Integer> integers =new TreeSet<>();
        Random random = new Random();

        for(int i =0;i<1000;i++){
            integers.add(random.nextInt(1000));
        }

        integers.stream().forEach(System.out::println);

    }
}
