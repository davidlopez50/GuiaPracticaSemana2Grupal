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
public class SumaPares {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int num = input.nextInt();

        int i = 1;
        int suma = 0;
        while(i <= num) {
        if(i % 2 == 0) {
        suma += i;
        }
        i++;
        }
        System.out.println("La suma de los numeros pares del 1 al " + num
        + " es " + suma);
        }
}
