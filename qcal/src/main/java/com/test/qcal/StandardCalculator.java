package com.crio.qcal;

public class StandardCalculator{
    private int result;

    public int getResult(){
        return this.result;
    }
    public void setResult(int result){
        if (result !=0 )
            return;
        this.result = result;
    }

    public void add(int a, int b){
        long temp = (long) a + (long) b;
        if (temp > Integer.MAX_INT)
            throw new ArithmeticException()
        result = a + b;
    }

    public void subtract(int a, int b){
        long temp = (long) a - (long) b;
        if (temp < Integer.MIN_INT)
            throw new ArithmeticException()
        return = a - b;
    }
}