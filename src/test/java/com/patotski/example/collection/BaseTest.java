package com.patotski.example.collection;

import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class BaseTest {

    /**
     * min = 1.0
     * avg = 3.0
     * max = 5.0
     * sum = 15.0
     **/
    protected final List<Double> testList = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
}
