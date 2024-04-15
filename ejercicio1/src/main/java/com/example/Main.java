
package com.example;

public class Main {

    public static void main(String[] args) {

        String nombre = "Juan Zapata";
        int salarioBase = 45000000;
        int horasTrabajo = 192;
        int horasExtras = 10;
        double auxilioTransporte = 162000;
        // Cálculo de la nómina
        double salarioDevengado = calcularSalarioDevengado(salarioBase, horasTrabajo, horasExtras, auxilioTransporte);
        double deducciones = calcularDeducciones(auxilioTransporte);
        double salarioNeto = salarioDevengado - deducciones;

        // Impresión de la nómina
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario base: $" + salarioBase);
        System.out.println("Horas extras: " + horasExtras);
        System.out.println("Auxilio transporte: $" + auxilioTransporte);
        System.out.println("Salario devengado: $" + salarioDevengado);
        System.out.println("Deducciones: $" + deducciones);
        System.out.println("Salario neto: $" + salarioNeto);
    }

    // Método para calcular el salario devengado
    public static double calcularSalarioDevengado(int salarioBase, int horasTrabajo, int horasExtras, double auxilioTransporte) {
        double valorCadaHora = salarioBase / horasTrabajo;
        double valorHorasExtra = valorCadaHora * horasExtras;
        double salarioDevengado = salarioBase + valorHorasExtra + auxilioTransporte;

        return salarioDevengado;
    }

    // Método para calcular las deducciones
    public static double calcularDeducciones(double auxilioTransporte) {
        return auxilioTransporte;
    }
}
