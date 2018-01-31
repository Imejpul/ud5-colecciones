package com.imejpul;

import java.util.ArrayList;
import java.util.List;

public class Asignatura {

    private String nombre;
    private int horasSemenales;

    private List<Alumno> alumnos = new ArrayList<>();

    public Asignatura() {
    }

    public void mostrarAlumnos() {
        System.out.println("---Alumnos: ");
        for (Alumno al : alumnos) {
            System.out.println("Nombre: " + al.getNombre());
            System.out.println("Apellidos: " + al.getApellidos() + "\n");
        }
    }

    @Override
    public String toString() {
        return "Asignatura{" +
                "nombre='" + nombre + '\'' +
                ", horasSemenales=" + horasSemenales +
                ", alumnos=" + alumnos +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasSemenales() {
        return horasSemenales;
    }

    public void setHorasSemenales(int horasSemenales) {
        this.horasSemenales = horasSemenales;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }
}
