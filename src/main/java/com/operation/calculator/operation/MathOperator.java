package com.operation.calculator.operation;
public enum MathOperator {
    ADDITION((x, y) -> x + y),
    SUBTRACTION((x, y) -> x - y),
    MULTIPLICATION((x, y) -> x * y),
    DIVISION((x, y) -> {
        if (y == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return x / y;
    });

    private final Operation operation;

    MathOperator(Operation operation) {
        this.operation = operation;
    }

    public double apply(double x, double y) {
        return operation.apply(x, y);
    }
}
