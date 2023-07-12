import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        List<Integer> nums = Arrays.asList(6, 2, 7, 3, 9);

        Stream<Integer> data = nums.stream();

        // can't reuse stream
        // long count = data.count();

        Stream<Integer> sortedData = data.sorted();
        Stream<Integer> mappedData = sortedData.map(n -> n * 2);
        mappedData.forEach(n -> System.out.println(n));

        Predicate<Integer> predi = n -> n%2 == 1;

        System.out.println("-------------------------");
        List<Integer> newNums = Arrays.asList(15,12,11,13,10,1);
        newNums.stream()
                .filter(n -> n%2 == 1)
                .sorted()
                .map(n -> n * 2)
                .forEach(n -> System.out.println(n));


        int result = newNums.stream()
                .filter(n -> n%2 == 1)
                .sorted()
                .map(n -> n * 2)
                .reduce(0 , (c,e) -> c+e);   
                
        System.out.println("Result : "+result);        


        //  newNums.stream()
        //         .filter(predi)
        //         .sorted()
        //         .map(n -> n * 2)
        //         .forEach(n -> System.out.println(n));

    }
}
