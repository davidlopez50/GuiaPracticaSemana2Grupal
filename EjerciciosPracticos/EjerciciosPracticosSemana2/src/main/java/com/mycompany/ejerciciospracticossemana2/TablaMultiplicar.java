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
public class TablaMultiplicar {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int num = input.nextInt();

        int i = 1;
        while(i <= 10) {
        System.out.println(num + " x " + i + " = " + (num*i));
        i++;
        }
        }
}

