package com.imejpul;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int opcion;

        do {
            System.out.println("\n" +
                    "   1 Empresa\n" +
                    "       12 Crear nueva empresa\n" +
                    "       13 Borrar una empresa\n" +
                    "   2 Añadir empleados (a una empresa)\n" +
                    "       21 Añadir operario\n" +
                    "       22 Añadir directivo\n" +
                    "       23 Listar empleados (de la empresa)\n" +
                    "   3 Listados\n" +
                    "       31 Todas las empresas\n" +
                    "       32 Todos los empleados\n" +
                    "       33 Listado por empresa y empleado\n" +
                    "   4 Salir\n");

            System.out.print("¿Opción? = ");
            opcion = Integer.parseInt(br.readLine());

            switch (opcion) {
                case 12:
                    break;
                case 13:
                    break;
                case 21:
                    break;
                case 22:
                    break;
                case 23:
                    break;
                case 31:
                    break;
                case 32:
                    break;
                case 33:
                    break;
                case 4:
                    break;
                default:
                    System.out.println("¡ERROR!");
                    break;
            }
        } while (opcion != 4);
    }
}
