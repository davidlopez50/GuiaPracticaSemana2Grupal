/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciospracticossemana2;
import java.util.Scanner;
/**
 *
 * @author david
 */
public class PositivoNegativo {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Ingrese un numero: ");
    int num = input.nextInt();

    if(num > 0) {
    System.out.println(num + " es positivo.");
    } else if(num < 0) {
    System.out.println(num + " es negativo.");
    } else {
    System.out.println("El número es cero.");
    }
    }
}