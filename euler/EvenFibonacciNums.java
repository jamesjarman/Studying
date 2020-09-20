package euler;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EvenFibonacciNums {

    public static void main(String[] args) {


        List<Integer> fibNums =
        Stream.iterate(new int[]{0, 1}, i -> new int[]{i[1], i[0] + i[1]})
                .limit(34)
                .map(i -> i[0])
                .collect(Collectors.toList());
        System.out.println(fibNums);


        int sumOfEvens = fibNums
                .stream()
                .filter(i -> i%2==0)
                .reduce(0, Integer::sum);

        System.out.println(sumOfEvens);

        int x = 0;
        int y = 1;
        int answer = 0;
        int z;
        while (y < 4000000) {
            if (y % 2 == 0)
                answer = answer + y;
            z = y;
            y=x+y;
            x=z;
        }
        System.out.println(answer);


    }
}
