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

        while (op2 > 0) {

            if ((op2 & 1) == 1) {

                resultado += op1;

            }
            op1 = op1 << 1;
            op2 = op2 >> 1;
        }
        return resultado;
    }

    public int Divisao() {

        while (op1 <= op2) {
            resultado = op1-=op2;
            ++resultado;
        }
        if (op1 == -1)
        resultado = -resultado;

        return resultado;
    }

    public int RestDiv() {

        return 0;
    }
}
