package codewars;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.assertEquals;

public class PINRegEx {

    public static boolean validatePin(String pin) {
        boolean isValid = false;
        if (pin.length()==4 || 6==pin.length()) {
            Pattern pattern1 = Pattern.compile("[0-9][0-9][0-9][0-9]");
            Pattern pattern2 = Pattern.compile("[0-9][0-9][0-9][0-9][0-9][0-9]");
            Matcher matcher1 = pattern1.matcher(pin);
            Matcher matcher2 = pattern2.matcher(pin);
            isValid=matcher1.find()||matcher2.find();
        }
        return isValid;
    }


    @Test
    public void invalidLengths() {
        assertEquals(false, validatePin("1"));
        assertEquals(false, validatePin("12"));
        assertEquals(false, validatePin("123"));
        assertEquals(false, validatePin("12345"));
        assertEquals(false, validatePin("1234567"));
        assertEquals(false, validatePin("-1234"));
        assertEquals(false, validatePin("1.234"));
        assertEquals(false, validatePin("00000000"));
    }
}
