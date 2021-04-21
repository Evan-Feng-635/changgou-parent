import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<String> as = new ArrayList<>();
        as.add("50");
        as.add("30");
        as.add("40");
        as.add("10");
        System.out.println(as);
        Collections.reverse(as);
        System.out.println(as);
        as.stream().map(a ->{
            return a+"s";
        });
        as.forEach(System.out::println);
    }
}
