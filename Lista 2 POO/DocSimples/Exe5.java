/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exe5;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Admin
 */
public class Exe5 {

    public long calcularDiferencaDias(LocalDate data1, LocalDate data2) {
        return Math.abs(ChronoUnit.DAYS.between(data1, data2));
    }

    public static void main(String[] args) {
        Exe5 diferencaEntreDatas = new Exe5();

        // Exemplo de uso
        LocalDate data1 = LocalDate.of(2024, 3, 1);
        LocalDate data2 = LocalDate.of(2024, 3, 10);

        long diferencaDias = diferencaEntreDatas.calcularDiferencaDias(data1, data2);
        System.out.println("Diferença de dias entre " + data1 + " e " + data2 + ": " + diferencaDias + " dias.");
    }
}
