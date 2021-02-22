package com.patotski.example.array.operations;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@Order(1)
@Component("avg")
public class ArrayAvg implements ArrayOperation {

    @Override
    public Double calculate(List<Double> list) {
        return list.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
    }
}
