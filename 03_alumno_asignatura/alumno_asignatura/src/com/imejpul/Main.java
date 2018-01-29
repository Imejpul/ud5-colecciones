package com.imejpul;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int opcion;

        do {

            Alumno al = new Alumno();
            Asignatura as = new Asignatura();

            System.out.println("\n" +
                    "    1. Crear nuevo alumno.\n" +
                    "    2. Crear nueva asignatura.\n" +
                    "    3. Matricular alumno en asignatura.\n" +
                    "    4. Listado de alumnos matriculados en una asignatura.\n" +
                    "    5. Listado de asignaturas en las que está matriculado un alumno y total de horas.\n" +
                    "    6. Salir\n");

            System.out.print("¿Opcion? = ");
            opcion = Integer.parseInt(br.readLine());

            switch (opcion) {

                case 1:
                    System.out.println("---Introduzca datos Alumno---");

                    System.out.print("Nombre: ");
                    al.setNombre(br.readLine());

                    System.out.print("Apellidos: ");
                    al.setApellidos(br.readLine());

                    System.out.print("Email: ");
                    al.setEmail(br.readLine());

                    as.getAlumnos().add(al);
                    break;

                case 2:
                    System.out.println("---Introduzca datos Asignatura---");

                    System.out.print("Nombre: ");
                    as.setNombre(br.readLine());

                    System.out.print("Horas Semanales: ");
                    as.setHorasSemenales(Integer.parseInt(br.readLine()));

                    al.getAsignaturas().add(as);
                    break;

                case 3:
                    String alu;
                    String asi;

                    System.out.print("Introduzca nombre Alumno: ");
                    alu = br.readLine();

                    System.out.print("Introduzca nombre Asignatura: ");
                    asi = br.readLine();

                    for (Alumno a : as.getAlumnos()) {
                        if (a.getNombre().toLowerCase().equals(alu)) {
                            for (Asignatura asign : al.getAsignaturas()) {
                                if (asign.getNombre().toLowerCase().equals(asi)) {
                                    asign.getAlumnos().add(a);
                                    a.getAsignaturas().add(asign);
                                }
                            }
                        }
                    }
                    break;

                case 4:
                    String asignatura;
                    System.out.print("Introduzca nombre Asignatura: ");
                    asignatura = br.readLine();

                    for (Asignatura asig : al.getAsignaturas()) {
                        if (asig.getNombre().toLowerCase().equals(asignatura)) {
                            asig.mostrarAlumnos();
                        }
                    }
                    break;

                case 5:
                    String alumno;
                    System.out.println("Introduzca nombre Alumno");
                    alumno = br.readLine();

                    for (Alumno alum : as.getAlumnos()) {
                        if (alum.getNombre().toLowerCase().equals(alumno)) {
                            alum.mostrarAsignaturas();
                        }
                    }
                    break;

                case 6:
                    System.out.println("¡Adios!");
                    break;

                default:
                    System.out.println("¡Error!");
                    break;
            }
        } while (opcion != 6);

    }
}
