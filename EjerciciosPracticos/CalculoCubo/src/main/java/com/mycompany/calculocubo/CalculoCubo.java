/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculocubo;

import java.util.Scanner;
/**
 *
 * @author david
 */
public class CalculoCubo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double Arista;
        double Volumen;
        System.out.println("Ingrese el numero de aristas del cubo: ");
        Arista = sc.nextDouble();
        Volumen = Math.pow(Arista,3);
        System.out.printf("Se calculo el volumen: %.2f%n", Volumen);
    }
}
