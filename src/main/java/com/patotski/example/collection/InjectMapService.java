package com.patotski.example.collection;

import com.patotski.example.array.operations.ArrayOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class InjectMapService {

    @Autowired
    Map<String, ArrayOperation> arrayOperations;

    public String calculate(List<Double> array) {
        System.out.println(arrayOperations.getClass());
        return arrayOperations.entrySet().stream().map(op -> op.getKey() + " : " + op.getValue().calculate(array))
                .collect(Collectors.joining(", ", "[", "]"));
    }
}
