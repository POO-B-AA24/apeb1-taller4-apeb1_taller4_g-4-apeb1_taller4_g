// Importamos las clases ArrayList y Scanner del paquete java.util
package problema1tallergrupal;

import java.util.ArrayList;
import java.util.Scanner;

public class Problema2_EmpleadoClaseBase {

    // Método main, punto de entrada del programa
    public static void main(String[] args) {
        // Creamos un objeto Scanner para la entrada de datos desde la consola
        Scanner scanner = new Scanner(System.in);
        // Creamos un ArrayList para almacenar objetos de tipo Empleado
        ArrayList<Problema2_EmpleadoClaseEjecutor> empleados = new ArrayList<>();
        // Variable booleana para controlar la salida del bucle do-while
        boolean salir = false;

        // Bucle do-while para mostrar el menú y permitir al usuario interactuar con el programa
        do {
            // Mostramos el menú
            System.out.println("\nSeleccione una opcion:");
            System.out.println("1. Agregar empleado");
            System.out.println("2. Mostrar información de los empleados");
            System.out.println("3. Calcular aumento de salario");
            System.out.println("4. Salir");

            // Leemos la opción seleccionada por el usuario
            int opcion = scanner.nextInt();
            // Consume la nueva línea después de leer un entero para evitar problemas de lectura
            scanner.nextLine();

            // Evaluamos la opción seleccionada por el usuario
            switch (opcion) {
                case 1:
                    // Agregar empleado
                    System.out.println("Ingrese el nombre del empleado:");
                    String nombre = scanner.nextLine();

                    System.out.println("Ingrese el salario del empleado:");
                    double salario = scanner.nextDouble();

                    System.out.println("Ingrese la edad del empleado:");
                    int edad = scanner.nextInt();

                    // Creamos un nuevo objeto Empleado y lo agregamos al ArrayList empleados
                    Problema2_EmpleadoClaseEjecutor empleado = new Problema2_EmpleadoClaseEjecutor(nombre, salario, edad);
                    empleados.add(empleado);
                    System.out.println("Empleado agregado correctamente.");
                    break;

                case 2:
                    // Mostrar información de los empleados
                    System.out.println("Información de los empleados:");
                    for (Problema2_EmpleadoClaseEjecutor emp : empleados) {
                        // Utilizamos el método toString de la clase Empleado para mostrar la información
                        System.out.println(emp.toString());
                    }
                    break;

                case 3:
                    // Calcular aumento de salario
                    System.out.println("Ingrese el porcentaje de aumento salarial:");
                    double porcentajeAumento = scanner.nextDouble();

                    // Calculamos el salario promedio de todos los empleados
                    double salarioPromedio = calcularSalarioPromedio(empleados);
                    // Iteramos sobre cada empleado para aumentar su salario si es menor al promedio
                    for (Problema2_EmpleadoClaseEjecutor emp : empleados) {
                        if (emp.obtenerSalario() < salarioPromedio) {
                            emp.aumentarSalario(porcentajeAumento);
                            System.out.println("Nuevo salario de " + emp.toString());
                        }
                    }
                    break;

                case 4:
                    // Salir del programa
                    System.out.println("Hasta luego");
                    salir = true;
                    break;

                default:
                    // Mensaje de opción no válida
                    System.out.println("Opción no válida, intente de nuevo.");
            }
        } while (!salir); // El bucle se repite hasta que la variable salir sea verdadera
    }

    public static double calcularSalarioPromedio(ArrayList<Problema2_EmpleadoClaseEjecutor> empleados) {
        double totalSalarios = 0;
        // Iteramos sobre cada empleado y sumamos sus salarios
        for (Problema2_EmpleadoClaseEjecutor emp : empleados) {
            totalSalarios += emp.obtenerSalario();
        }
        // Calculamos y devolvemos el salario promedio
        return totalSalarios / empleados.size();
    }
}
