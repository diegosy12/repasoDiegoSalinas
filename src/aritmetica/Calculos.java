/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aritmetica;

import java.util.Scanner;

/**
 *
 * @author Diego Salinas Yañez (diegosy12@educastur.es)
 */
public class Calculos {
    
    protected static void calcularAreaTriangulo(Scanner scanner) {
        System.out.print("Introduce la base del triangulo: ");
        double base = scanner.nextDouble();
        System.out.print("Introduce la altura del triangulo: ");
        double altura = scanner.nextDouble();
        double areaTriangulo = (base * altura) / 2;
        final String menasje = "El area de la figura es: ";
        System.out.println(menasje + areaTriangulo);
    }

    protected static void calcularAreaCirculo(Scanner scanner) {
        System.out.print("Introduce el radio del circulo: ");
        double radio = scanner.nextDouble();
        double areaCirculo = Math.PI * radio * radio;
        System.out.println("El area de la figura es: " + areaCirculo);
    }

    protected static void calcularAreaCuadrado(Scanner scanner) {
        System.out.print("Introduce el lado del cuadrado: ");
        double lado = scanner.nextDouble();
        double areaCuadrado = lado * lado;
        System.out.println("El area de la figura es: " + areaCuadrado);
    }
    
}
