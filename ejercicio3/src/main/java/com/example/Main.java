package com.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            // Mostrar menú de opciones
            System.out.println("Seleccione una figura geométrica:");
            System.out.println("1. Triángulo");
            System.out.println("2. Cuadrado");
            System.out.println("3. Rectángulo");
            System.out.println("4. Círculo");
            System.out.println("0. Salir");

            // Leer la opción del usuario
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    calcularTriangulo(scanner);
                    break;
                case 2:
                    calcularCuadrado(scanner);
                    break;
                case 3:
                    calcularRectangulo(scanner);
                    break;
                case 4:
                    calcularCirculo(scanner);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 0);
    }

    private static void calcularTriangulo(Scanner scanner) {
        System.out.println("Ingrese la base del triangulo:");
        int baseTriangulo = scanner.nextInt();

        System.out.println("Ingrese la altura del triangulo:");
        int alturaTriangulo = scanner.nextInt();

        double areaTriangulo = 1.0 / 2.0 * (baseTriangulo * alturaTriangulo);
        System.out.println("El área del triángulo es: " + areaTriangulo);
    }

    private static void calcularCuadrado(Scanner scanner) {
        System.out.println("Ingrese el lado del cuadrado:");
        int ladoCuadrado = scanner.nextInt();

        double areaCuadrado = ladoCuadrado * ladoCuadrado;
        System.out.println("El área del cuadrado es: " + areaCuadrado);
    }

    private static void calcularRectangulo(Scanner scanner) {
        System.out.println("Ingrese la base del rectángulo:");
        int baseRectangulo = scanner.nextInt();

        System.out.println("Ingrese la altura del rectángulo:");
        int alturaRectangulo = scanner.nextInt();

        int areaRectangulo = baseRectangulo * alturaRectangulo;
        System.out.println("El área del rectángulo es: " + areaRectangulo);

    }

    private static void calcularCirculo(Scanner scanner) {
        System.out.println("Ingrese el radio del círculo:");
        int radioCirculo = scanner.nextInt();

        double areaCircilo = 3.14 * Math.pow(radioCirculo, 2);
        System.out.println("El área del círculo es: " + areaCircilo);
    }
}
