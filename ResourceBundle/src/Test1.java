import java.util.Locale;
import java.util.ResourceBundle;

public class Test1 {
    public static void main(String[] args) {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("config", new Locale("en"));
        System.out.println(resourceBundle.getString("message"));
        ResourceBundle resourceBundle1 = ResourceBundle.getBundle("ListResource",new Locale("en"));
        System.out.println(resourceBundle1.getString("key1"));
    animals animals = new cat();
        System.out.println(animals.getClass().getName());
    }
}
interface animals{
    void eat();
}
class cat implements  animals{

    @Override
    public void eat() {
        System.out.println("cat eating");
    }
    public void meaw(){
        System.out.println("meouww");
    }
}
