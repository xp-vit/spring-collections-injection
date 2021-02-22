package com.patotski.example.collection;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class InjectMapServiceTest extends BaseTest {

    @Autowired
    InjectMapService injectMapService;

    @Test
    void shouldPrintOutput() {
        System.out.println("Output: " + injectMapService.calculate(testList));
    }

}