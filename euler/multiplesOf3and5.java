package euler;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class multiplesOf3and5 {

    public static void main(String[] args) {

        List<Integer> numbers = IntStream.rangeClosed(1, 999)
                .boxed().collect(Collectors.toList());


        long totalStream = numbers
                .stream()
                .filter(number -> number%3==0 || number%5==0)
                .reduce(0, Integer::sum);

        System.out.println(totalStream);



    }
}
