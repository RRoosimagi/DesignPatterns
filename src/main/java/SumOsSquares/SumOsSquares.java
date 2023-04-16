package SumOsSquares;

import java.util.stream.IntStream;

public class SumOsSquares {

        public static void main(String[] args) {
            int sum = IntStream.rangeClosed(1, 20)
                    .map(x -> x * x)
                    .reduce(0, (a, b) -> a + b);
            System.out.println("Sum of squares: " + sum);
        }
    }
