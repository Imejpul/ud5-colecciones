package com.imejpul;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Empresa> empresas = new ArrayList<>();
        List<Empleado> empleados = new ArrayList<>();

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
                    //pedir nombre empresa y almacenar en variable
                    System.out.print("Introduzca nombre empresa: ");
                    String empresaNom = br.readLine();

                    //pedir año fundación y almacenar en variable
                    System.out.print("Año fundación: ");
                    String anyoFund = br.readLine();

                    empresas.add(new Empresa(empresaNom, anyoFund));
                    break;

                case 13:
                    //saber qué empresa
                    System.out.println("--Listado Empresas--");
                    for (int i = 0; i < empresas.size(); i++) {
                        System.out.println((i + 1) + " " + empresas.get(i));
                    }

                    //obtener el número de índice dentro de la lista
                    System.out.print("Introduzca número empresa listadas: ");
                    int indEmpresa = Integer.parseInt(br.readLine()) - 1;

                    //quitar referencias entrantes y salientes a empresa
                    for (Empleado e : empresas.get(indEmpresa).getEmpleados()) {
                        e.setEmpresa(null);
                    }
                    empresas.get(indEmpresa).getEmpleados().clear();
                    System.out.println("Empresa Borrada correctamente.");
                    break;

                case 21:
                    System.out.println("---Introduzca datos operario---");

                    System.out.print("Nombre: ");
                    String nombre = br.readLine();

                    System.out.print("Apellidos: ");
                    String apellidos = br.readLine();

                    System.out.print("Fecha Nacimiento: ");
                    String fechaNac = br.readLine();

                    System.out.print("Fecha Contrato: ");
                    String fechaCon = br.readLine();

                    System.out.print("Salario Hora: ");
                    double salHr = Double.parseDouble(br.readLine());

                    System.out.print("Horas Contrato: ");
                    int hrsCon = Integer.parseInt(br.readLine());

                    //saber qué empresa
                    System.out.println("--Listado Empresas--");
                    for (int i = 0; i < empresas.size(); i++) {
                        System.out.println((i + 1) + " " + empresas.get(i));
                    }

                    //obtener el número de índice dentro de la lista
                    System.out.print("Introduzca número empresa de las listadas: ");
                    indEmpresa = Integer.parseInt(br.readLine()) - 1;

                    //Añadir operario a empresa
                    empresas.get(indEmpresa).getEmpleados().add(new Operario(nombre, apellidos, fechaNac, fechaCon, empresas.get(indEmpresa), salHr, hrsCon));
                    empleados.add(new Operario(nombre, apellidos, fechaNac, fechaCon, empresas.get(indEmpresa), salHr, hrsCon));
                    break;

                case 22:
                    System.out.println("---Introduzca datos Directivo---");

                    System.out.print("Nombre: ");
                    nombre = br.readLine();

                    System.out.print("Apellidos: ");
                    apellidos = br.readLine();

                    System.out.print("Fecha Nacimiento: ");
                    fechaNac = br.readLine();

                    System.out.print("Fecha Contrato: ");
                    fechaCon = br.readLine();

                    System.out.print("Salario Año: ");
                    double salYear = Double.parseDouble(br.readLine());

                    System.out.print("Bonus Personal: ");
                    double bonus = Double.parseDouble(br.readLine());

                    //saber qué empresa
                    System.out.println("--Listado Empresas--");
                    for (int i = 0; i < empresas.size(); i++) {
                        System.out.println((i + 1) + " " + empresas.get(i));
                    }

                    //obtener el número de índice dentro de la lista
                    System.out.print("Introduzca número empresa de las listadas: ");
                    indEmpresa = Integer.parseInt(br.readLine()) - 1;

                    //Añadir Directivo a empresa
                    empresas.get(indEmpresa).getEmpleados().add(new Directivo(nombre, apellidos, fechaNac, fechaCon, empresas.get(indEmpresa), salYear, bonus));
                    empleados.add(new Directivo(nombre, apellidos, fechaNac, fechaCon, empresas.get(indEmpresa), salYear, bonus));
                    break;

                case 23:
                    //saber qué empresa
                    System.out.println("--Listado Empresas--");
                    for (int i = 0; i < empresas.size(); i++) {
                        System.out.println((i + 1) + " " + empresas.get(i));
                    }

                    //obtener el número de índice dentro de la lista
                    System.out.print("Introduzca número empresa de las listadas: ");
                    indEmpresa = Integer.parseInt(br.readLine()) - 1;

                    for (Empleado e : empresas.get(indEmpresa).getEmpleados()) {
                        System.out.println(e);
                    }
                    break;

                case 31:
                    System.out.println("--Listado Empresas--");
                    for (int i = 0; i < empresas.size(); i++) {
                        System.out.println((i + 1) + " " + empresas.get(i));
                    }
                    break;

                case 32:
                    System.out.println("--Listado Empleados--");
                    for (Empleado eTot : empleados) {
                        System.out.println(eTot);
                    }
                    break;

                case 33:
                    System.out.println("--Listado Empresas y sus empleados--");
                    for (int i = 0; i < empresas.size(); i++) {
                        System.out.println((i + 1) + " " + empresas.get(i));
                        System.out.println("Empleados:");
                        for (Empleado eE : empresas.get(i).getEmpleados()) {
                            System.out.println(eE);
                        }
                        System.out.println("");
                    }
                    break;

                case 4:
                    System.out.println("¡Hasta la próxima!");
                    break;

                default:
                    System.out.println("¡ERROR!");
                    break;
            }
        } while (opcion != 4);
    }
}
