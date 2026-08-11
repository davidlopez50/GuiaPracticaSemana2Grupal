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
public class AprobadoReprobado {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Ingrese su calificación: ");
    int calificacion = input.nextInt();

    if(calificacion >= 60) {
    System.out.println("Aprobado.");
    } else {
    System.out.println("Reprobado.");
    }
    }
}