package codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DuplicateEncoder {
    static String encode(String word) {
        String encoded = "";
        word = word.toLowerCase();

        for (char c : word.toCharArray()) {
            if (word.chars().filter(ch -> ch == c).count() > 1) {
                encoded = encoded.concat(")");

            } else {
                encoded=encoded.concat("(");
            }

        }
        return encoded;
    }

    @Test
    public void test() {
        assertEquals(")()())()(()()(",
                DuplicateEncoder.encode("Prespecialized"));
        assertEquals("))))())))", DuplicateEncoder.encode("   ()(   "));
    }
}

