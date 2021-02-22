package com.patotski.example.array.operations;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@Order(0)
@Component
public class ArrayMin implements ArrayOperation {

    @Override
    public Double calculate(List<Double> list) {
        return list.stream().mapToDouble(Double::doubleValue).min().orElse(0.0);
    }
}
