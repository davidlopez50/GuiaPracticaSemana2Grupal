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
public class MayorEdad { 
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Ingrese su edad: ");
    int edad = input.nextInt();

    if(edad >= 18) {
    System.out.println("Eres mayor de edad.");
    } else {
    System.out.println("Eres menor de edad.");
    }
    }
}