package com.patotski.example.array.operations;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@Order(3)
@Component("sum")
public class ArraySum implements ArrayOperation {

    @Override
    public Double calculate(List<Double> list) {
        return list.stream().mapToDouble(Double::doubleValue).sum();
    }
}
