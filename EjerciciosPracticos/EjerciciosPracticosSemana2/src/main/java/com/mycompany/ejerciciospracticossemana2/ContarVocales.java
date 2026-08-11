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
public class ContarVocales {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese una cadena: ");
        String cadena = input.nextLine().toLowerCase();

        int i = 0;
        int contador = 0;

        while (i < cadena.length()) {
            char c = cadena.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }

            i++;
        }

        System.out.println("La cadena contiene " + contador + " vocales.");

        input.close();
    }
}