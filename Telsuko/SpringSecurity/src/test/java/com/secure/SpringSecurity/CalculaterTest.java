package com.secure.SpringSecurity;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.secure.SpringSecurity.forTesting.Calculater;

class CalculaterTest {

    Calculater calc;

    @BeforeEach
    void init() {
        calc = new Calculater();
        System.out.println("Before each test");
    }

    @Test
    void testAdd() {
        int result = calc.add(2, 3);
        Assertions.assertEquals(5, result);
    }

    @AfterEach
    void tearDown() {
        System.out.println("After each test");
    }
    
    
    
    @Test
    void testAssertions() {
        String name = "Sai";
        int[] numbers = {1, 2, 3};

        assertEquals("Sai", name);
        assertNotNull(numbers);
        assertTrue(numbers.length > 0);
        assertAll(
            () -> assertEquals(3, numbers.length),
            () -> assertTrue(name.startsWith("S"))
        );
    }
    
    
    @DisplayName("Addition should return correct sum")
    @Test
    void testAddNumbers() {
        assertEquals(10, calc.add(4, 6));
    }
    
    
    
    @Test
    void testDivideByZero() {
        ArithmeticException ex = assertThrows(ArithmeticException.class,
            () -> calc.divide(10, 0));
        assertEquals("/ by zero", ex.getMessage());
    }
    

}

