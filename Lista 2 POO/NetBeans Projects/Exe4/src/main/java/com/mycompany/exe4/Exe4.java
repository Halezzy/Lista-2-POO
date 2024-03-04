/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exe4;

/**
 *
 * @author Admin
 */
public class Exe4 {

 public int soma(int a, int b) {
        return a + b;
    }

    public int subtracao(int a, int b) {
        return a - b;
    }

    public int multiplicacao(int a, int b) {
        return a * b;
    }

    public double radiciacao(double numero, double indice) {
        return Math.pow(numero, 1.0 / indice);
    }

    public int fatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fatorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Exe4 calculadora = new Exe4();

        // Exemplos de operações
        System.out.println("Soma: " + calculadora.soma(5, 3));
        System.out.println("Subtração: " + calculadora.subtracao(5, 3));
        System.out.println("Multiplicação: " + calculadora.multiplicacao(5, 3));
        System.out.println("Radiciação: " + calculadora.radiciacao(9, 2));
        System.out.println("Fatorial de 5: " + calculadora.fatorial(5));
    }
}
