package aritmetica;


import java.util.Scanner;



public class Repaso {

    
    public static void main(String[] args) {

        
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("\nSeleccione una figura para calcular su area:");

        	System.out.println("1. Cuadrado");

        	System.out.println("2. Circulo");

        	System.out.println("3. Triangulo");

        	System.out.print("Elige una opcion: ");


            
    int opcion = scanner.nextInt();


            
    switch (opcion) {

            		case 1:	System.out.print("Introduce el lado del cuadrado: ");

                		double lado = scanner.nextDouble();
	
                	double areaCuadrado = lado * lado;

                		System.out.println("El area de la figura es: " + areaCuadrado);

                		break;
 
           		case 2:	System.out.print("Introduce el radio del circulo: ");

                		double radio = scanner.nextDouble();

                		double areaCirculo = Math.PI * radio * radio;

                		System.out.println("El area de la figura es: " + areaCirculo);

                		break;
            
			case 3:	System.out.print("Introduce la base del triangulo: ");

                		double base = scanner.nextDouble();

                		System.out.print("Introduce la altura del triangulo: ");

                		double altura = scanner.nextDouble();

                		double areaTriangulo = (base * altura) / 2;

                		System.out.println("El area de la figura es: " + areaTriangulo);

                		break;

            		default:
System.out.println("Opcion no valida. Intentalo de nuevo.");

        	}

    	}

}