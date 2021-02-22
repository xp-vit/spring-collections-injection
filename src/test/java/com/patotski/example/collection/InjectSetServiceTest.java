package com.patotski.example.collection;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class InjectSetServiceTest extends BaseTest {

    @Autowired
    InjectSetService injectSetService;

    @Test
    void shouldPrintOutput() {
        System.out.println("Output: " + injectSetService.calculate(testList));
    }

}