package com.patotski.example.collection;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class InjectInjectListServiceTest extends BaseTest {

    @Autowired
    InjectListService injectListService;

    @Test
    void shouldPrintOutput() {
        System.out.println("Output: " + injectListService.calculate(testList));
    }

}