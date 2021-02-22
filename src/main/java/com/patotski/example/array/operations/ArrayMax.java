package com.patotski.example.array.operations;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@Order(2)
@Component
public class ArrayMax implements ArrayOperation {

    @Override
    public Double calculate(List<Double> list) {
        return list.stream().mapToDouble(Double::doubleValue).max().orElse(0.0);
    }
}

