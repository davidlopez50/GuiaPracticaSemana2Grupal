/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.iva;

import java.util.Scanner;
/**
 *
 * @author david
 */
public class IVA {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Precio: ");
        double p = sc.nextDouble();
        double iva = p * 0.13;
        System.out.printf("IVA: $%.2f%n", iva);
    }
}
