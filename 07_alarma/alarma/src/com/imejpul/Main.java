package com.imejpul;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //Instancia Alarma
        //Pedir datos a usuario (pin, teléfono Aviso)
        //Instancia Lista sensores (List<>)
        //Bucle for (para añadir número aleatorio sensores, usar para umbral: (int)(Math.ramdom()*100) + 1

        System.out.println("\n" +
                "    1 Activar alarma\n" +
                "    2 Desactivar alarma (necesario PIN)\n" +
                "    3 Consultar sensores\n" +
                "    4 Salir\n");

        System.out.print("¿Opción? = ");
        int opcion = Integer.parseInt(br.readLine());

        do {
            switch (opcion) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("¡Hasta la próxima!");
                    break;
            }

        } while (opcion != 4);

    }
}
