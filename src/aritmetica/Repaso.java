package aritmetica;


import java.util.Scanner;


/**
 * Esta clase muestra un menú
 * 
 * @author diego 
 * @version 1.0
 * @since 14/02/2025
 */ 
public class Repaso extends Calculos {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nSeleccione una figura para calcular su area:");

        System.out.println("1. Cuadrado");

        System.out.println("2. Circulo");

        System.out.println("3. Triangulo");

        System.out.print("Elige una opcion: ");

        int opcion = scanner.nextInt();

        switch (opcion) {

            case 1:	
                calcularAreaCuadrado(scanner);
                break;

            case 2:	
                calcularAreaCirculo(scanner);
                break;
            case 3:	
                calcularAreaTriangulo(scanner);
                break;

            default:
                System.out.println("Opcion no valida. Intentalo de nuevo.");

        }

    }


}