import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test1 {
    public static void main(String[] args) {
        Path path = Paths.get("/folder/folder/a.txt");
        System.out.println(path.getParent());
        File file=path.toFile();
    }
}
