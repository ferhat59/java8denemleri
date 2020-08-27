import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.List;

public class Collect {
    public static void main(String[] args) {
        List names = Arrays.asList("Ali", "Veli", "Selami", "Veli", "Selami", "Can", "Hüseyin");

        List list =(List) names.stream().collect(Collectors.toList());
        System.out.println(list);
        Set set = (Set)names.stream().collect(Collectors.toSet());
        System.out.println(set);
        Long count = (Long)names.stream().collect(Collectors.counting());
        System.out.println(count);
        String collect = (String) names.stream().collect(Collectors.joining(" - "));
        System.out.println(collect);

        //Map<Integer, List> integerListMap =
          //      names.stream().collect(Collectors.groupingBy(name -> name.length()));
    }
}
