package com.algods.recursion;

public class FactorialByRecursion {
    public int factorial(int num) {
        if(num == 1 || num ==0)
            return 1;
        else if (num < 0)
            throw new IllegalArgumentException("factorial of negative numbers is undefined");
        return num * factorial(num - 1 );
    }
}
