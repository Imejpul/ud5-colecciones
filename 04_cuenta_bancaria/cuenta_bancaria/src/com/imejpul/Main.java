package com.imejpul;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int opcion;

        List<CuentaBancaria> cuentas = new ArrayList<>();
        List<Titular> titulares = new ArrayList<>();
        List<Apunte> apuntes = new ArrayList<>();

        do {
            System.out.println("\n" +
                    "    1. Titular\n" +
                    "        i. Nuevo titular\n" +
                    "    2. Cuenta bancaria\n" +
                    "        i. Nueva cuenta\n" +
                    "       ii. Nuevo apunte\n" +
                    "      iii. Borrar cuenta\n" +
                    "    3. Consultas\n" +
                    "        i. Dado un titular, saldo de todas sus cuentas\n" +
                    "       ii. Dada una cuenta, titulares asociados\n" +
                    "    4. Salir\n");

            System.out.print("¿Opción? = ");
            opcion = Integer.parseInt(br.readLine());

            switch (opcion) {
                case 1:
                    Titular titular = new Titular();

                    System.out.println("---Introduzca datos nuevo titular---");

                    System.out.print("Nombre: ");
                    titular.setNombre(br.readLine());

                    System.out.print("Apellido: ");
                    titular.setApellido(br.readLine());

                    System.out.println("DNI: ");
                    titular.setDNI(br.readLine());

                    System.out.println("Fecha Alta: ");
                    titular.setFechaAlta(br.readLine());

                    titulares.add(titular);
                    break;

                case 2:
                    System.out.println("\n" +
                            "    1. Nueva cuenta\n" +
                            "    2. Nuevo apunte\n" +
                            "    3. Borrar cuenta\n");

                    System.out.print("¿Opción? = ");
                    opcion = Integer.parseInt(br.readLine());

                    switch (opcion) {
                        case 1:
                            CuentaBancaria cuentaBancaria = new CuentaBancaria();

                            System.out.print("Introduzca código cuenta: ");
                            String codigo = br.readLine();
                            cuentaBancaria.setCodigoCuenta(codigo);

                            //añadir titular

                            cuentas.add(cuentaBancaria);
                            break;

                        case 2:
                            Apunte apunte = new Apunte();

                            System.out.println("---Introduzca datos apunte---");

                            System.out.print("Cantidad: ");
                            apunte.setCantidad(Double.parseDouble(br.readLine()));

                            System.out.print("Fecha: ");
                            apunte.setFecha(br.readLine());

                            //añadir a cuenta concreta

                            apuntes.add(apunte);
                            break;

                        case 3:
                            //buscar titular

                            //buscar cuenta

                            //borrar apuntes

                            //borrar cta titular

                            //borrar cta en banco

                            break;

                        default:
                            System.out.println("¡Error!");
                            break;
                    }
                    break;

                case 3:
                    System.out.println("\n" +
                            "    1. Dado un titular, saldo de todas sus cuentas\n" +
                            "    2. Dada una cuenta, titulares asociados\n");

                    System.out.print("¿Opción? = ");
                    opcion = Integer.parseInt(br.readLine());

                    switch (opcion) {
                        case 1:
                            break;

                        case 2:
                            break;

                        default:
                            System.out.println("¡Error!");
                            break;
                    }
                    break;

                case 4:
                    System.out.println("¡Fin de la sesión!");
                    break;

                default:
                    System.out.println("¡Error!");
                    break;
            }
        } while (opcion != 4);
    }

}
