package codewars;

import org.junit.Test;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class Vowels {
    public static Character[] vowels = {'a', 'e', 'i', 'o', 'u'};

    public static int getCount(String str) {
        int vowelsCount = 0;
        Stream<Character> characterStream = str.chars()
                .mapToObj(c -> (char) c);


        vowelsCount = (int) characterStream.filter(Vowels::isVowel)
                .count();
        return vowelsCount;
    }


    public static boolean isVowel(Character c) {
        for (Character vowel : vowels) {
            if (vowel.equals(c)) {
                return true;
            }
        }
        return false;
    }

    @Test
    public void testCase1() {
        assertEquals("Nope!", 5, Vowels.getCount("abracadabra"));
    }

}