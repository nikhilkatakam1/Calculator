package com.operation.calculator.operation;

@FunctionalInterface
public interface Operation {
    double apply(double x, double y);
}
