package com.example;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        adivinarNumero(1, 100, 5);
    }

    public static void adivinarNumero(int min_numero, int max_numero, int max_intentos) {
        Random random = new Random();
        Scanner escaneo = new Scanner(System.in);

        int numeroAleatorio = random.nextInt(min_numero, max_numero);
        System.out.println("¡Bienvenido al juego! Adivina un número del 1 al 100, tienes 5 intentos.");

        int intentosDelUsuario = 0;
        boolean acertoNumero = false;
        while (intentosDelUsuario < max_intentos && !acertoNumero) {
            intentosDelUsuario++;

            System.out.println("Ingresa el entero");
            int numeroentero = escaneo.nextInt();

            if (numeroentero == numeroAleatorio) {
                System.out.println("Número correcto ¡Ganaste!");
                System.out.println("Tus intentos fueron: " + intentosDelUsuario);
                acertoNumero = true;
            } else {
                System.out.println("Número incorrecto");
                if (intentosDelUsuario != max_intentos) {
                    System.out.println("Intenta de nuevo.");
                    if (numeroentero > numeroAleatorio) {
                        System.out.println("Pista: El número aleatorio es menor que el ingresado");
                    } else {
                        System.out.println("Pista: El número aleatorio es mayor que el ingresado");
                    }
                }
            }
        }

        if (intentosDelUsuario == max_intentos && !acertoNumero) {
            System.out.println("Derrota, fin del juego :(");
            System.out.println("El numero era: " + numeroAleatorio);
        }
    }
}
