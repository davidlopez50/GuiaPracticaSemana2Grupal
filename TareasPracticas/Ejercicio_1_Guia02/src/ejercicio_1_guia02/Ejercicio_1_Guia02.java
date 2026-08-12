/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_1_guia02;

import java.util.Scanner;

public class Ejercicio_1_Guia02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingresa el primer numero: ");
        int num1 = input.nextInt();
        System.out.print("Ingresa el segundo numero: ");
        int num2 = input.nextInt();
        
        if (num1 == num2) {
            int suma = num1 + num2;
            System.out.println("Los numeros son iguales y la suma es: " + suma);
        } else {
            int producto = num1 + num2;
            System.out.println("Los numeros son diferentes y el procuto es: " + producto);
        }
    }
    
}
