/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guia1ejercicio2;

import java.util.Scanner;
/**
 *
 * @author david
 */
public class Guia1Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Parcial 1: ");
        double p1 = sc.nextDouble();

        System.out.print("Parcial 2: ");
        double p2 = sc.nextDouble();

        System.out.print("Parcial 3: ");
        double p3 = sc.nextDouble();

        System.out.print("Tarea: ");
        double tarea = sc.nextDouble();

        double notaFinal = (p1 * 0.20) + (p2 * 0.25) + (p3 * 0.40) + (tarea * 0.15);

        System.out.printf("Su Nota final es: %.2f%n", notaFinal);

    }

}