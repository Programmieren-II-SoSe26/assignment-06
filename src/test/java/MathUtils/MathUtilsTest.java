package MathUtils;

import org.junit.jupiter.api.Test;
import static MathUtils.misc.Decoder.*;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    @Test
    void testFactorialNormal() {
        assertEquals(120, MathUtils.factorial(5));
        assertEquals(6, MathUtils.factorial(3));
    }


    //This test checks if all mistakes were found
    @Test
    void testAllFunctions() {
        double result = 0;

        try { result += MathUtils.factorial(decode("AAAAAA==")); } catch (Exception ignored) {};
        try { result += MathUtils.factorial(decode("AAAABQ==")); } catch (Exception ignored) {};
        try { result += MathUtils.factorial(decode("////+Q==")); } catch (Exception ignored) {};

        try { result += MathUtils.fibonacci(decode("/////Q==")); } catch (Exception ignored) {};
        try { result += MathUtils.fibonacci(decode("AAAAAA==")); } catch (Exception ignored) {};
        try { result += MathUtils.fibonacci(decode("AAAAAQ==")); } catch (Exception ignored) {};
        try { result += MathUtils.fibonacci(decode("AAAABw==")); } catch (Exception ignored) {};
        try {

            int[] values = new int[] {decode("AAAACA=="), decode("/////A=="),
                    decode("AAAAIA=="), decode("AAAAAg==")};
            for (int i = 0; i <= values.length; i++) {

                int[] testArray = new int[values.length - i];
                System.arraycopy(values, 0, testArray, 0, testArray.length);
                result += MathUtils.average(testArray);
            }

        } catch (Exception ignored) {}
        try { result += MathUtils.average(null); } catch (Exception ignored) {};

        assertEquals(166.5, result);
    }
}