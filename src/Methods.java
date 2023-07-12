import java.util.List;
import java.util.stream.Collectors;

public class Methods {
    public static void main(String[] args) {
        // filter(predicate)
        // map(Function)

        List<String> names = List.of("Aman", "Ankit", "Abhinav", "Durgesh","Mohan");

        List<String> newList = names.stream()
                .filter(e -> e.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(newList);

        List<Integer> numbers = List.of(23,4,2,66,34);

        List<Integer> newNumbers = numbers.stream().map(i -> i*i).collect(Collectors.toList());
        System.out.println(newNumbers);

        //names.stream().forEach(e -> System.out.println(e));

        names.stream().forEach(System.out::println);

        int n = numbers.stream().min((x,y) -> x.compareTo(y)).get();
        System.out.println("Compare to "+n);

    }
}
