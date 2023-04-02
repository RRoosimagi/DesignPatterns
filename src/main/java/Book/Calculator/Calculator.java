package Book.Calculator;

import java.util.function.BinaryOperator;

public class Calculator {
        public double add ( double x, double y){
            return compute(x, y, Double::sum);
        }

        public double subtract ( double x, double y){
            return compute(x, y, (a, b) -> a - b);
        }

        public double multiply ( double x, double y){
            return compute(x, y, (a, b) -> a * b);
        }

        public double divide ( double x, double y){
            if (y == 0) {
                throw new ArithmeticException("Division by zero");
            }
            return compute(x, y, (a, b) -> a / b);
        }

        private double compute ( double x, double y, BinaryOperator<Double > op){
            return op.apply(x, y);
        }
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        double result = calc.add(2.0, 3.0);
        double result2 = calc.divide(10.0, 0.0);

    }
}