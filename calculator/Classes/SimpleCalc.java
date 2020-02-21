package calculator.Classes;

import calculator.Interfaces.ICalculator;

public class SimpleCalc implements ICalculator
{
    public int add(int x , int y){
        return x + y ;
    }
    public float divide(int x , int y){
        if (y == 0)
            throw new RuntimeException("cannot divide by zero .");
        return (float) x / y ;
    }
}
