package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        int opcion;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("\n" +
                "    1. Crear nueva empresa.\n" +
                "    2. Añadir empleado a empresa ya existente.\n" +
                "    3. Listado de empresas.\n" +
                "    4. Listado detallado de empresas y empleados.\n" +
                "    5. Salir\n");

        opcion = Integer.parseInt(br.readLine());

        switch (opcion) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                System.out.println("¡Adios!");
                break;
        }
    }
}
