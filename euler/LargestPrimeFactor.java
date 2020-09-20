package euler;

import org.junit.Test;
import org.w3c.dom.ls.LSOutput;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class LargestPrimeFactor {
    public static void main(String[] args) {
        System.out.println(largestPrimeFactor(600851475143L));
    }

    public static long largestPrimeFactor(long n) {
        if (n <= 1) {
            return 0;
        } else {
            int div = 2;
            while (div < n) {
                if (n % div != 0) {
                    div++;
                } else {
                    n = n / div;
                    div = 2;
                }
            }
            return n;
        }
    }



}
