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
public class Primo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int num = input.nextInt();

        int i = 2;
        boolean esPrimo = true;

        while(i <= num/2) {
        if(num % i == 0) {
        esPrimo = false;
        break;
        }
        i++;
        }

        if(esPrimo) {
        System.out.println(num + " es primo.");
        } else {
        System.out.println(num + " no es primo.");
        }
        }
}
