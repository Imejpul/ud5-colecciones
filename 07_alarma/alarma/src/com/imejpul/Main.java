package com.imejpul;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //Instancia Alarma
        Alarma alarma = new Alarma();

        //Pedir datos a usuario (pin, teléfono Aviso)
        System.out.println("---DATOS ALARMA---");

        System.out.print("PIN: ");
        int pin = (int) (Math.random() * 9999) + 1111;
        System.out.println(pin);

        System.out.print("Teléfono: ");
        alarma.setTelefonoAviso(Integer.parseInt(br.readLine()));

        //Bucle for para añadir número aleatorio sensores cada uno con umbral aleatorio
        int aleatorioSensores = (int) (Math.random() * 5) + 1;
        System.out.println("Sensores: " + aleatorioSensores);

        for (int i = 0; i < aleatorioSensores; i++) {
            SensorMovimiento sensor = new SensorMovimiento((int) (Math.random() * 100) + 1);
            System.out.print("Umbral sensor " + i + ": " + sensor + "\n");
            alarma.getSensores().add(sensor);
        }

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
                    alarma.activar();
                    break;

                case 2:
                    int pinDesactivacion = 0;
                    int intento = 1;

                    do {
                        System.out.println("Intento: " + (intento));

                        System.out.print("Introduzca PIN: ");
                        pinDesactivacion = Integer.parseInt(br.readLine());
                        alarma.desactivar(pinDesactivacion);

                        if (pinDesactivacion != pin) {
                            System.out.println("¡Error!");
                        }
                        intento++;

                    } while (pinDesactivacion != pin && intento < 4);

                    if (pinDesactivacion != pin) {
                        System.out.println("Número intentos sobrepasado..");
                        System.out.println("Dando aviso a.." + alarma.getTelefonoAviso());
                    }
                    break;

                case 3:
                    alarma.consultarSensores();
                    break;
                case 4:
                    System.out.println("¡Hasta la próxima!");
                    break;
            }

        } while (opcion != 4);

    }
}
