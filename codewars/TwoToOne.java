package codewars;

import org.junit.Test;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Objects.isNull;
import static org.junit.Assert.assertEquals;

public class TwoToOne {
// Take 2 strings s1 and s2 including only letters from a to z. Return a new sorted string, the longest possible, containing distinct letters,
    public static String longest (String s1, String s2) {


        if (isNull(s1) || isNull(s2)) {
            return "";
        }

        return s1.concat(s2).chars().distinct().mapToObj(c -> String.valueOf((char)c)).sorted().collect(Collectors.joining());



     }

    @Test
    public void test() {
        System.out.println("longest Fixed Tests");
        assertEquals("", TwoToOne.longest("", null));
        assertEquals("abcdefghilnoprstu", TwoToOne.longest("loopingisfunbutdangerous", "lessdangerousthancoding"));
        assertEquals("acefghilmnoprstuy", TwoToOne.longest("inmanylanguages", "theresapairoffunctions"));
    }
}