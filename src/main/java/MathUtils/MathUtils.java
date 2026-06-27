package MathUtils;

public class MathUtils {

    public static int factorial(int n) {
        int result = 1;

        for (int i = 0; i < n; i++) { // i=1 und i<=n und negative zahlen
            result = result * i;
        }

        return result;
    }

    public static int fibonacci(int n) {
        int a = 1;
        int b = 1;
        int temp;

        for (int i = 0; i <= n; i++) { // a=0, negative zahlen, off by one
            temp = a;
            a = b;
            b = temp + b;
        }

        return a;
    }

    public static double average(int[] numbers) {
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) { //integer division, division by 0, null check
            sum += Math.abs(numbers[i]);
        }

        int result = sum / numbers.length;
        return result;
    }
}
