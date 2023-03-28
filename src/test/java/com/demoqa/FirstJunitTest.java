package com.demoqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FirstJunitTest {


    @BeforeEach
    void beforeEach () {
        System.out.println("      #### @BeforeEach");
    }

    @Test
    void firstTest() {
        Assertions.assertTrue(3 > 2);
        System.out.println("             #### @Test firstTest()");
    }

    @Test
    void secondTest() {
        Assertions.assertTrue(3 > 2);
        System.out.println("             #### @Test secondTest()");
    }

}
