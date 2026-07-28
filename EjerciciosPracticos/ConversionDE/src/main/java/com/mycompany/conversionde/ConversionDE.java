/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conversionde;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class ConversionDE {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dolares: ");
        int c = sc.nextInt();
        double Euro = c * 1.14;
        System.out.printf("Se calculo: $%.2f%n", Euro);
    }
}
