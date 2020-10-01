package codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Conversion {




    public String solution(int n) {
        String roman = "";

        while (n>=1000) {
        roman = roman + "M";
        n = n-1000;
        }


        if (n>=100) {
            switch (n/100) {
                case 1 -> {
                    roman = roman + "C";
                    n = n - 100;
                }
                case 2 -> {
                    roman = roman + "CC";
                    n = n - 200;
                }
                case 3 -> {
                    roman = roman + "CCC";
                    n = n - 300;
                }
                case 4 -> {
                    roman = roman + "CD";
                    n = n - 400;
                }
                case 5 -> {
                    roman = roman + "D";
                    n = n - 500;
                }
                case 6 -> {
                    roman = roman + "DC";
                    n = n - 600;
                }
                case 7 -> {
                    roman = roman + "DCC";
                    n = n - 700;
                }
                case 8 -> {
                    roman = roman + "DCCC";
                    n = n - 800;
                }
                case 9 -> {
                    roman = roman + "CM";
                    n = n - 900;
                }
            }
        }


        if ((n>=10) && (n<100)) {
            switch (n/10) {
                case 1 -> {
                    roman = roman + "X";
                    n = n - 10;
                }
                case 2 -> {
                    roman = roman + "XX";
                    n = n - 20;
                }
                case 3 -> {
                    roman = roman + "XXX";
                    n = n - 30;
                }
                case 4 -> {
                    roman = roman + "XL";
                    n = n - 40;
                }
                case 5 -> {
                    roman = roman + "L";
                    n = n - 50;
                }
                case 6 -> {
                    roman = roman + "LX";
                    n = n - 60;
                }
                case 7 -> {
                    roman = roman + "LXX";
                    n = n - 70;
                }
                case 8 -> {
                    roman = roman + "LXXX";
                    n = n - 80;
                }
                case 9 -> {
                    roman = roman + "XC";
                    n = n - 90;
                }
            }
        }

        roman = switch (n) {
            case 0 -> roman + "";
            case 1 -> roman + "I";
            case 2 -> roman + "II";
            case 3 -> roman + "III";
            case 4 -> roman + "IV";
            case 5 -> roman + "V";
            case 6 -> roman + "VI";
            case 7 -> roman + "VII";
            case 8 -> roman + "VIII";
            case 9 -> roman + "IX";
            default -> roman;
        };


        return roman;
    }

    @Test
    public void shouldConvertToRoman() {

        Conversion conversion = new Conversion();
        assertEquals("solution(1) should equal to I", "I", conversion.solution(1));
        assertEquals("IX",conversion.solution(9));
        assertEquals("M",conversion.solution(1000));
        assertEquals("LXXVIII",conversion.solution(78));
        assertEquals( "CDXXXIV", conversion.solution(434));
        assertEquals( "MMMMCCCXLI", conversion.solution(4341));
        assertEquals("MMMMMMMMCMXLII",conversion.solution(8942));
    }
}