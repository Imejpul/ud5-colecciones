package com.imejpul;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int opcion;

        System.out.println("\n" +
                "    1 Alumnos\n" +
                "       11 Crear nuevo alumno.\n" +
                "       12 Borrar alumno.\n" +
                "    2 Asignaturas\n" +
                "       21 Crear nueva asignatura.\n" +
                "       22 Borrar asignatura.\n" +
                "    3 Matrícula\n" +
                "       31 Matricular alumno en asignatura.\n" +
                "       32 Listado de alumnos matriculados en una asignatura.\n" +
                "       33 Listado de asignaturas en las que está matriculado un alumno.\n" +
                "       34 Listado de todos los alumnos del centro y total de horas en las que están matriculados.\n" +
                "    4 Salir\n");

        System.out.print("¿Opción? = ");
        opcion = Integer.parseInt(br.readLine());

        switch (opcion) {
            case 11:
                break;
            case 12:
                break;
            case 21:
                break;
            case 22:
                break;
            case 31:
                break;
            case 32:
                break;
            case 33:
                break;
            case 34:
                break;
            case 4:
                break;
            default:
                System.out.println("¡ERROR!");
        }
    }
}
