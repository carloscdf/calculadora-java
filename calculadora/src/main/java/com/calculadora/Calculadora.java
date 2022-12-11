package com.calculadora;

import java.util.Scanner;

/**
 * Hello world!
 */
public class Calculadora {

    public static void main(String[] args) {
        
       
         Scanner entrada = new Scanner(System.in);
               
        int op1, op2;
        int operacao;
        
        System.out.println("CALCULADORA\n");
       
        System.out.println("Escolha uma operação\nDigite um dos valores abaixo\n\n"
                + "(1)Soma\n(2)Subtração\n(3)Multiplicação\n(4)Divisao");
        
        System.out.print("\nEscolha a operação: ");
        operacao = entrada.nextInt(); 
        System.out.print("Digite um valor: ");
        op1 = entrada.nextInt();
        System.out.print("Digite outro valor: ");
        op2= entrada.nextInt();

        
       Operacoes op = new Operacoes(op1, op2);

       
       if (op1 < 0 && op2 <0) {
         
          op1 = Math.abs(op1); // tentei converter os númeors para positivo aqui mas consegui não
          op2 = Math.abs(op2);
           
       }
       

       switch(operacao) {
           
           case 1 : System.out.println("Resultado da soma: " + op.Soma());
           break;
           case 2:  System.out.println("Resultado da subtração: " + op.Subtracao());
           break;
           case 3:  System.out.println("Resultado da multiplicação: " + op.Multiplicacao());
           break;
           case 4: System.out.println("Resultado da divisão: " + op.Divisao());
           
       }
  
    
       
       
                    
       


    }

}
