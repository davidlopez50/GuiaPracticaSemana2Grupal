/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_1_med;

import java.util.Scanner;

public class Proyecto_1_Med {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Parcial 1:");
        double parcial1 = sc.nextDouble();
        System.out.print("Parcial 2:");
        double parcial2 = sc.nextDouble();
        System.out.print("Parcial 3:");
        double parcial3 = sc.nextDouble();
        System.out.print("Tarea :");
        double tarea = sc.nextDouble();
        
        double promedio = (parcial1 * 0.20)+(parcial2 * 0.25)+(parcial3 * 0.40)+(tarea * 0.15);
        
        System.out.println("el promedio es: " + promedio); 
        
    }
    
}
