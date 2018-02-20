package com.imejpul;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int opcion;

        List<Averia> averias = new LinkedList<>();
        List<Tecnico> tecnicos = new ArrayList<>();

        do {
            System.out.println("\n" +
                    "    1 Alta de técnico.\n" +
                    "    2 Gestión de averías\n" +
                    "       21 Nueva avería.\n" +
                    "       22 Asignar avería a técnico.\n" +
                    "       23 Atender avería.\n" +
                    "    3 Listados\n" +
                    "       31 Listado de averías sin resolver de un técnico.\n" +
                    "       32 Listado de todas las averías de un técnico (resueltas y no resueltas).\n" +
                    "       33 Listado de todas las averías del sistema y técnico asignado.\n" +
                    "    4 Salir\n");

            System.out.print("¿Opcion? = ");
            opcion = Integer.parseInt(br.readLine());

            switch (opcion) {
                case 1:
                    //pedir nombre técnico y almacenar en variable

                    //pedir nivel técnicmo y almacenar en variable

                    //añadir a lista general de técnicos (inicializando constructor con parámetros pedidos)
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
                    System.out.println("Hasta la próxima");
                    break;
            }
        } while (opcion != 4);

    }
}
