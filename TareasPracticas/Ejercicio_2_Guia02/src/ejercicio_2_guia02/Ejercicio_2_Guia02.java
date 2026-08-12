/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_2_guia02;

import java.util.Scanner;

public class Ejercicio_2_Guia02 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Ingresa la base del triangulo: ");
        int base = input.nextInt();
        System.out.println("Ingresa la altura del triangulo:  ");
        int altura = input.nextInt();
        
        int area = (base * altura)/2;
        
        System.out.println("El area de un triangulo es: " + area);
    }
    
}
