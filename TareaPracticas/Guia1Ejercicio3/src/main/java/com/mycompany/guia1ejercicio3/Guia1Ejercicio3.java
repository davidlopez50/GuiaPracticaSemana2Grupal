/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guia1ejercicio3;

import java.util.Scanner;
/**
 *
 * @author david
 */
public class Guia1Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nota parcial 1: ");
        double n1 = sc.nextDouble();

        System.out.print("Nota parcial 2: ");
        double n2 = sc.nextDouble();

        System.out.print("Nota parcial 3: ");
        double n3 = sc.nextDouble();

        System.out.print("Nota examen final: ");
        double examen = sc.nextDouble();

        System.out.print("Nota trabajo ex-aula: ");
        double trabajo = sc.nextDouble();

        double promedio = (n1 + n2 + n3) / 3;

        double notaFinal = (promedio * 0.55) + (examen * 0.30) + (trabajo * 0.15);

        System.out.printf("El Promedio de parciales es10: %.2f%n", promedio);
        System.out.printf("Nota final: %.2f%n", notaFinal);

    }

}