import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class map_reduce {
    public static void main(String[] args) {
        Person p1 = new Person("Ahmet", 12);
        Person p2 = new Person("Ali", 20);
        Person p3 = new Person("Ayşe", 31);
        Person p4 = new Person("Murat", 52);
        Person p5 = new Person("Zeynep", 61);
        List<Person> personList = Arrays.asList(p1, p2, p3, p4, p5);
       double topla= personList
                .stream()
                .map(p -> p.getAge())

                .reduce(0, (a, b) -> (a + b)/2);
        System.out.println( topla);
        ThreadLocalRandom.current().nextInt(10);
    }

}
 class Person {
    private String name;
    private Integer age;

     public Person(String name, Integer age) {
         this.name = name;
         this.age = age;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public Integer getAge() {
         return age;
     }

     public void setAge(Integer age) {
         this.age = age;
     }
 }
