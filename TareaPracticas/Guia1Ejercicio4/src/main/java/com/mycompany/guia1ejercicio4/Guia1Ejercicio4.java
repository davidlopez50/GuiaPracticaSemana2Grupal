/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guia1ejercicio4;

import java.util.Scanner;
/**
 *
 * @author david
 */
public class Guia1Ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre del producto: ");
        String nombre = sc.nextLine();

        System.out.print("Precio del producto: ");
        double precio = sc.nextDouble();

        double iva = precio * 0.13;
        double total = precio + iva;

        System.out.printf("Nombre del producto: %s, Precio: $%.2f, IVA: $%.2f, Total: $%.2f%n",
                nombre, precio, iva, total);

    }

}