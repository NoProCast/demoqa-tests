package com.demoqa;

import org.junit.jupiter.api.*;

import java.lang.module.Configuration;

public class ExampleJunit5Test {

    @BeforeAll
    static void configure() {
        System.out.println("    this is @BeforeAll");
    }

    @AfterAll
    static void tearDown() {
        System.out.println("    this is @AfterAll");
    }

    @BeforeEach
    void beforeTest() {
        System.out.println("this is @BeforeEach");
    }

    @Test
    void firstTest0() {
        System.out.println("        this is @Test0");
    }

    @Test
    void firstTest1() {
        System.out.println("        this is @Test1");
    }

}
