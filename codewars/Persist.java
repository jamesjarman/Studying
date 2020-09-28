package codewars;


import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class Persist {

    public static int persistence(long n) {
        int number = 0;
        int m = 1;
        int characters = String.valueOf(n).length();
        String numberString = "" + n;
        while (characters > 1) {
            for (int i = 0; i < characters; i++) {
                m = m * Integer.parseInt("" + numberString.charAt(i));
            }
            characters = String.valueOf(m).length();
            number++;
            numberString=""+m;
            m = 1;
        }

        return number;


//        if (n < 10) return 0;
//
//        final long m = Arrays.stream(String.valueOf(n).split(""))
//                .mapToLong(Long::valueOf)
//                .reduce(1, (acc, next) -> acc * next);
//
//        return persistence(m) + 1;
    }



    @Test
    public void BasicTests() {
        System.out.println("****** Basic Tests ******");
        assertEquals(3, Persist.persistence(39));
        assertEquals(0, Persist.persistence(4));
        assertEquals(2, Persist.persistence(25));
        assertEquals(4, Persist.persistence(999));
    }
}

