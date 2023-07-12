import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {
        
        //blank stream
        Stream<Object> emptyStream = Stream.empty();
        String names[] = {"Durgesh", "Uttam", "Ankit", "Mohan"};
        
        Stream.of(names)
                        .forEach(e -> System.out.println(e));


         //builder pattern to create empty stream
         
         Stream<Object> streamBuilder = Stream.builder().build();


        IntStream arrayStream = Arrays.stream(new int[]{2,9,23,1,4,32,55});

        //list set

        List<Integer> list = List.of(2, 4, 50, 21, 30,33,27);
        list.stream().forEach(e -> System.out.println(e));

        
    }
}
