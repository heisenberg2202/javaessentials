import java.util.Arrays;
import java.util.List;

public class MethodsMore {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        //The reduce() method has several overloaded versions that allow you to provide an identity value along with the accumulator function.
        //The identity value is a default value that is used as the initial result when the stream is empty.
        
        int sum = numbers.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println(sum);


        List<String> words = Arrays.asList("Hello", "World", "Java", "Stream");
        String combined = words.stream()
                               .reduce("", (a, b) -> a + " " + b);
        System.out.println("Combined: " + combined);  


        
    }
}

