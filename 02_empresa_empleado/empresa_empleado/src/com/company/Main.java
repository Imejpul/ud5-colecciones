package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        int opcion;
        Empresa emp = new Empresa();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Empresa> empresas = new ArrayList<>();

        do {
            System.out.println("\n" +
                    "    1. Crear nueva empresa.\n" +
                    "    2. Añadir empleado a empresa ya existente.\n" +
                    "    3. Listado de empresas.\n" +
                    "    4. Listado detallado de empresas y empleados.\n" +
                    "    5. Salir\n");

            System.out.print("¿Opción? = ");
            opcion = Integer.parseInt(br.readLine());

            switch (opcion) {
                case 1:
                    System.out.println("Introduzca datos:");

                    System.out.print("Nombre Empresa: ");
                    emp.setNombre(br.readLine());

                    System.out.print("Año de fundación: ");
                    emp.setAnyoFundacion(br.readLine());

                    empresas.add(emp);
                    break;

                case 2:
                    System.out.println("Elija empresa introduciendo su nombre: ");

                    String eleccion = br.readLine().toLowerCase();
                    Empleado emple = new Empleado();

                    System.out.println("Introduzca datos de empleado: ");

                    System.out.print("Nombre:");
                    emple.setNombre(br.readLine());

                    System.out.print("Apellidos: ");
                    emple.setApellidos(br.readLine());

                    System.out.print("Fecha Nacimiento: ");
                    emple.setFechaNacimiento(br.readLine());

                    System.out.print("Fecha Contrato: ");
                    emple.setFechaContrato(br.readLine());

                    for (Empresa empresa : empresas) {
                        if (empresa.getNombre().toLowerCase().equals(eleccion)) {
                            empresa.getEmpleados().add(emple);
                            emple.setCorp(empresa);
                        }
                    }
                    break;

                case 3:
                    for (Empresa empresa : empresas) {
                        System.out.println("---Empresa: ");
                        System.out.println("Nombre: " + empresa.getNombre());
                        System.out.println("Fecha Fundación: " + empresa.getAnyoFundacion());
                    }
                    break;

                case 4:
                    for (Empresa empresa : empresas) {
                        System.out.println("---Empleados: ");
                        System.out.println("Nombre: " + empresa.getNombre());
                        System.out.println("Fecha Fundación: " + empresa.getAnyoFundacion() + "\n");
                        emp.mostrarEmpleados();
                    }
                    break;

                case 5:
                    System.out.println("¡Adios!");
                    break;
            }
        } while (opcion != 5);
    }
}
