import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class First {
    public static void main(String[] args) {
        System.out.println("123");
        //ghbjbjhbhgbhgbhgb
        First first = new First();
        System.out.println(first.plus(4,5));

        List<String> list = Stream.of("12-31", "45-62", "78-91")
                .map(s -> s.split("-")[0])
                .collect(Collectors.toList());
        System.out.println(list);

    }
    public int plus(int a, int b){
        return a+b;
    }
}
