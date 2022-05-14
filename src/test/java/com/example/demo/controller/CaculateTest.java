package com.example.demo.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class CaculateTest {
    @Test
    public void should_return_3_when_add_given_input_1_and_2(){
        // Given
        Caculate caculate = new Caculate();
        // When
        int actual = caculate.add(1, 2);
        // Then
        Assertions.assertEquals(actual, 3);
        System.out.println("run...");
    }
}