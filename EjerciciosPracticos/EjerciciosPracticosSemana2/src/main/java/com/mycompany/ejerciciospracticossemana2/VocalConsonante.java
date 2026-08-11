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
public class VocalConsonante {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Ingrese una letra: ");
    char letra = input.next().charAt(0);

    if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
    System.out.println(letra + " es una vocal.");
    } else {
    System.out.println(letra + " es una consonante.");
    }
    }
   }