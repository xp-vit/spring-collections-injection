package com.patotski.example.collection;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class InjectInjectArrayServiceTest extends BaseTest {

    @Autowired
    InjectArrayService injectArrayService;

    @Test
    void shouldPrintOutput() {
        System.out.println("Output: " + injectArrayService.calculate(testList));
    }

}