package com.algods.recursion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactorialByRecursionTest {
    @Test
    public void factorialSuccess() {
        FactorialByRecursion factorialByRecursion = new FactorialByRecursion();
        int result = factorialByRecursion.factorial(5);
        Assertions.assertEquals(120, result);
    }

    @Test
    public void factorialForNegativeNumber() {
        FactorialByRecursion factorialByRecursion = new FactorialByRecursion();
        Assertions.assertThrows(IllegalArgumentException.class, () -> factorialByRecursion.factorial(-7));
    }

    @Test
    public void factorialForZero() {
        FactorialByRecursion factorialByRecursion = new FactorialByRecursion();
        Assertions.assertThrows(IllegalArgumentException.class, () -> factorialByRecursion.factorial(-7));
    }
}
