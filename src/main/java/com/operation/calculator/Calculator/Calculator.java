package com.operation.calculator.Calculator;

import org.springframework.stereotype.Service;

import com.operation.calculator.operation.MathOperator;
import com.operation.calculator.operation.Operation;

@Service
public class Calculator {
    private double value;

    public Calculator(double initialValue) {
        this.value = initialValue;
    }

    public Calculator performOperation(MathOperator operation, double operand, double operand2) {
        this.value = operation.apply(operand, operand2);
        return this;
    }
    
    public Calculator performCustomOperation(Operation operation, double operand, double operand2) {
        this.value = operation.apply(operand, operand2);
        return this;
    }
    
    
    public Calculator performOperation(MathOperator operation, double operand) {
        this.value = operation.apply(this.value, operand);
        return this;
    }
    
    public Calculator performCustomOperation(Operation operation, double operand) {
        this.value = operation.apply(this.value, operand);
        return this;
    }

    public double getValue() {
        return this.value;
    }

   
}
