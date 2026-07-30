/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_2_med;

import java.util.Scanner;
        
public class Proyecto_2_Med {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" ingrese promedio: ");
        double promedio = sc.nextDouble();
        System.out.println(" ingrese notas del examen final: ");
        double examen = sc.nextDouble();
        System.out.println(" ingrese notas del trabajo:  ");
        double trabajo = sc.nextDouble();
        
        double resultado = (promedio * 0.55) + (examen * 0.30) + (trabajo * 0.15);
        
        System.out.println("El resultado es: " + resultado);
        
        
        
        
        
    }
    
}
