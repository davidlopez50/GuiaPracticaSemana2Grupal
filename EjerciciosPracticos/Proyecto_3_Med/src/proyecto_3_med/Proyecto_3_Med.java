/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_3_med;

import java.util.Scanner;

public class Proyecto_3_Med {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre del producto: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();

        double iva = precio * 0.13;
        double total = precio + iva;

        System.out.printf("El nombre del producto: %s \nEl precio: $%.2f \nIVA: $%.2f \nTotal: $%.2f%n",
                nombre, precio, iva, total);
    }
    
}
