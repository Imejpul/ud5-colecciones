package com.imejpul;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int opcion;

        Set<Alumno> alumnos = new HashSet<>();
        Set<Asignatura> asignaturas = new HashSet<>();

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
                System.out.println("--INTRODUZCA DATOS ALUMNO--");

                System.out.print("Nombre: ");
                String nombreAL = br.readLine();

                System.out.print("Apellidos: ");
                String apellidos = br.readLine();

                System.out.print("Email: ");
                String email = br.readLine();

                alumnos.add(new Alumno(nombreAL, apellidos, email));
                break;

            case 12:
                System.out.println("--ALUMNO A BORRAR--");

                for (Alumno al : alumnos) {
                    System.out.println(al.getNombre() + " " + al.getEmail());
                }
                System.out.println("");

                System.out.print("Introduzca email alumno a borrar: ");
                email = br.readLine();

                alumnos.remove(email);

                break;

            case 21:
                System.out.println("--INTRODUZCA DATOS ASIGNATURA--");

                System.out.println("nombre: ");
                String nombreAs = br.readLine();

                System.out.println("Horas Semanales: ");
                int hrs = Integer.parseInt(br.readLine());

                asignaturas.add(new Asignatura(nombreAs, hrs));
                break;

            case 22:
                System.out.println("--ASIGNATURA A BORRAR--");

                for (Asignatura as : asignaturas) {
                    System.out.println(as.getNombre());
                }
                System.out.println();

                System.out.print("Introduzca nombre asignatura a borar: ");
                nombreAs = br.readLine();

                asignaturas.remove(nombreAs);
                break;

            case 31:
                System.out.println("--ALUMNO A MATRICULAR--");

                for (Alumno al : alumnos) {
                    System.out.println(al.getNombre() + " " + al.getEmail());
                }
                System.out.println("");

                System.out.print("Introduzca email alumno a matricular: ");
                email = br.readLine();

                //------------------------------

                System.out.println("--ASIGNATURA A MATRICULAR--");

                for (Asignatura as : asignaturas) {
                    System.out.println(as.getNombre());
                }
                System.out.println();

                System.out.print("Introduzca nombre asignatura a matricular: ");
                nombreAs = br.readLine();

                boolean matriculado = false;

                for (Asignatura as : asignaturas) {
                    if (as.equals(nombreAs)) {
                        for (Alumno al : alumnos) {
                            if (al.equals(email)) {
                                matriculado = as.getAlumnos().add(al);
                            }
                        }
                    }
                }
                if (matriculado)
                    System.out.println("Alumno matriculado OK.");
                else
                    System.out.println("¡Error!");
                break;

            case 32:
                System.out.println("--ALUMNOS MATRICULADOS ASIGNATURA--");

                System.out.print("Introduzca nombre asignatura: ");
                nombreAs = br.readLine();

                if (asignaturas.contains(nombreAs)) {
                    for (Asignatura as : asignaturas) {
                        if (as.equals(nombreAs)) {
                            for (Alumno al : as.getAlumnos()) {
                                System.out.println(al);
                            }
                        }
                    }
                } else
                    System.out.println("¡Error! No existe la asignatura introducida.");
                break;

            case 33:
                System.out.println("--ASIGNATURAS MATRICULADOS ALUMNO--");

                for (Alumno al : alumnos) {
                    System.out.println(al.getNombre() + " " + al.getEmail());
                }
                System.out.println("");

                System.out.print("Introduzca email alumno: ");
                email = br.readLine();

                if (alumnos.contains(email)) {
                    for (Alumno al : alumnos) {
                        if (al.equals(email)) {
                            for (Asignatura as : al.getAsignaturas()) {
                                System.out.println(as);
                            }
                        }
                    }
                } else
                    System.out.println("¡Error! No existe el alumno introducido.");
                break;

            case 34:
                System.out.println("--ALUMNOS CENTRO Y HORAS TOTALES--");
                int hrsTot = 0;

                for (Alumno al : alumnos) {
                    System.out.println(al);
                    for (Asignatura as : al.getAsignaturas()) {
                        hrsTot += as.getHorasSemanales();
                    }
                    System.out.print("Horas totales: " + hrsTot + "\n");
                }
                break;

            case 4:
                System.out.println("¡Hasta la próxima");
                break;

            default:
                System.out.println("¡ERROR!");
        }
    }
}
