/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exe3;

/**
 *
 * @author Admin
 */
public class Exe3 {

    public double calcular(double raio) {
        return Math.PI * raio * raio; // Área do círculo
    }

    public double calcular(double lado1, double lado2) {
        return lado1 * lado2; // Área do quadrado
    }

    public int calcular(int lado1, int lado2, int lado3) {
        return lado1 + lado2 + lado3; // Perímetro do triângulo
    }

    public double calcular(int base, double altura) {
        return 0.5 * base * altura; // Área do triângulo
    }

    public double calcular(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Área do triângulo com coordenadas cartesianas
        return Math.abs((x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2.0);
    }

    public String calcular(String texto) {
        return "Uso incorreto"; // Uso incorreto
    }

    public static void main(String[] args) {
        Exe3 calculadora = new Exe3();

        // Exemplos de uso
        System.out.println("Área do círculo: " + calculadora.calcular(5.0));
        System.out.println("Área do quadrado: " + calculadora.calcular(4.0, 4.0));
        System.out.println("Perímetro do triângulo: " + calculadora.calcular(3, 4, 5));
        System.out.println("Área do triângulo: " + calculadora.calcular(4, 6.0));
        System.out.println("Área do triângulo (coordenadas cartesianas): " + calculadora.calcular(0, 0, 3, 0, 0, 4));
        System.out.println("Uso incorreto: " + calculadora.calcular("teste"));
    }
}
