package com.patotski.example.collection;

import com.patotski.example.array.operations.ArrayOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class InjectArrayService {

    @Autowired
    ArrayOperation[] arrayOperations;

    public String calculate(List<Double> array) {
        System.out.println(arrayOperations.getClass());
        return Arrays.asList(arrayOperations).stream().map(op -> op.calculate(array))
                .map(d -> d.toString())
                .collect(Collectors.joining(", ", "[", "]"));
    }
}
