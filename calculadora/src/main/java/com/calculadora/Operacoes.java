package com.calculadora;

public class Operacoes {
    
    private int op1;
    private int op2;
    private int resultado;
   
    Operacoes(int op1, int op2) {
        this.op1 = op1;
        this.op2 = op2;
    }

    public int Soma() {
        resultado = op1 + op2;
        return resultado;
    }

    public int Subtracao() {
        resultado = op1 - op2;
        return resultado;
    }
    
    public int Multiplicacao() {
        
        
        
        return 0;
        
    }

}
