/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema1tallergrupal;

/**
 *
 * @author romer
 */
// Definimos la clase Empleado
public class Problema2_EmpleadoClaseEjecutor {
    // Definimos los atributos privados nombre, salario y edad
    private String nombre;
    private double salario;
    private int edad;

    // Constructor de la clase Empleado que recibe nombre, salario y edad
    public Problema2_EmpleadoClaseEjecutor(String nombre, double salario, int edad) {
        this.nombre = nombre;
        this.salario = salario;
        this.edad = edad;
    }

    // Método toString para representar un objeto Empleado como una cadena de texto
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Salario: $" + salario + ", Edad: " + edad;
    }

    // Método para obtener el salario del empleado
    public double obtenerSalario() {
        return salario;
    }

    // Método para aumentar el salario del empleado en un porcentaje dado
    public void aumentarSalario(double porcentaje) {
        salario += salario * (porcentaje / 100);
    }
}
