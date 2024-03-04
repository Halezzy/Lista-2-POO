/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exe2;

/**
 *
 * @author Admin
 */
public class Exe2 {

    public int contaPrimos(int inicio, int fim) {
        int quantidade = 0;

        for (int i = inicio; i <= fim; i++) {
            if (ehPrimo(i)) {
                quantidade++;
            }
        }

        return quantidade;
    }

    private boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Exe2 obj = new Exe2();
        int resultado = obj.contaPrimos(5, 20);
        System.out.println("Quantidade de números primos de 5 até 20: " + resultado);
    }
}
