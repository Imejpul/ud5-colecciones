package com.imejpul;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int opcion;

        List<Asignatura> asignaturas = new ArrayList<>();
        List<Alumno> alumnos = new ArrayList<>();

        do {

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
                    Alumno al = new Alumno();

                    System.out.println("---Introduzca datos Alumno---");

                    System.out.print("Nombre: ");
                    al.setNombre(br.readLine());

                    System.out.print("Apellidos: ");
                    al.setApellidos(br.readLine());

                    System.out.print("Email: ");
                    al.setEmail(br.readLine());

                    alumnos.add(al);
                    break;

                case 2:
                    Asignatura as = new Asignatura();

                    System.out.println("---Introduzca datos Asignatura---");

                    System.out.print("Nombre: ");
                    as.setNombre(br.readLine());

                    System.out.print("Horas Semanales: ");
                    as.setHorasSemenales(Integer.parseInt(br.readLine()));

                    asignaturas.add(as);    //Creación objeto y añadimos su referencia en la lista a la vez: asignaturas.add(new Asignatura (nombre, horasSemanales);  //Hay que crear constructor con variables.
                    break;

                case 3:
                    Alumno alumnoEcontrado = buscarAlumno(br, alumnos);

                    Asignatura asignaturaEcontrada = buscarAsignatura(br, asignaturas);

                    if (asignaturaEcontrada != null && alumnoEcontrado != null) {
                        asignaturaEcontrada.getAlumnos().add(alumnoEcontrado);
                        alumnoEcontrado.getAsignaturas().add(asignaturaEcontrada);

                        System.out.println("¡Alumno matriculado correctamente!");

                    } else {
                        System.out.println("¡Error!");
                    }
                    break;

                case 4:
                    asignaturaEcontrada = buscarAsignatura(br, asignaturas);

                    System.out.println("Alumnos de " + asignaturaEcontrada.getNombre());
                    asignaturaEcontrada.getAlumnos().forEach(a -> {
                        System.out.println(a);
                    });
                    break;

                case 5:
                    alumnoEcontrado = buscarAlumno(br, alumnos);

                    int total = 0;

                    System.out.println("Asignaturas de: " + alumnoEcontrado.getNombre());
                    Iterator<Asignatura> it = alumnoEcontrado.getAsignaturas().iterator();

                    while (it.hasNext()) {
                        Asignatura subject = it.next();
                        System.out.println(subject);
                        total += subject.getHorasSemenales();
                    }

                    System.out.println("Total de horas: " + total);
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

    private static Alumno buscarAlumno(BufferedReader br, List<Alumno> alumnos) throws IOException {
        String alu;

        System.out.println("---Alumnos del centro---");
        for (Alumno alumTemp : alumnos) {
            System.out.println(alumTemp.getNombre());
        }

        System.out.print("Introduzca nombre Alumno: ");
        alu = br.readLine();

        int i = 0;
        while (i < alumnos.size() && !alu.equalsIgnoreCase(alumnos.get(i).getNombre())) {
            i++;
        }

        Alumno alumnoEcontrado = null;

        if (i < alumnos.size()) {
            alumnoEcontrado = alumnos.get(i);

        }
        return alumnoEcontrado;
    }

    private static Asignatura buscarAsignatura(BufferedReader br, List<Asignatura> asignaturas) throws IOException {
        String asi;
        System.out.println("---Asignaturas del centro---");
        for (Asignatura asigTemp : asignaturas) {
            System.out.println(asigTemp.getNombre());
        }

        System.out.print("Introduzca nombre Asignatura: ");
        asi = br.readLine();

        int i = 0;
        while (i < asignaturas.size() && !asi.equalsIgnoreCase(asignaturas.get(i).getNombre())) {
            i++;
        }

        Asignatura asignaturaEcontrada = null;

        if (i < asignaturas.size()) {
            asignaturaEcontrada = asignaturas.get(i);
        }
        return asignaturaEcontrada;
    }
}
