/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculonotas;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class CalculoNotas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        System.out.println("Ingresa nota 1: ");
        System.out.println("Ingresa nota 2: ");
        System.out.println("ingresa nota 3: ");
        double Promedio = (n1+n2+n3)/ 3;
        System.out.println(Promedio+ "El promedio es: ");
    }
}
