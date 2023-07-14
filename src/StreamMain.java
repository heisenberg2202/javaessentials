import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {
        List<Integer> list = List.of(2, 4, 50, 21, 30,33,27);

        // Stream<Integer> stream = list.stream();
        // List<Integer> newList = stream.filter(i ->
        // i%2==0).collect(Collectors.toList());

        list.stream()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList())
                .forEach(n -> System.out.println(n));

        List<Integer> newList1 = list.stream()
                    .filter(i -> i>20)
                    .collect(Collectors.toList());


        System.out.println(newList1);

    }
}
