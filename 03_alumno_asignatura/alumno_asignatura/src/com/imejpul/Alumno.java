package com.imejpul;

import java.util.ArrayList;
import java.util.List;

public class Alumno {

    private String nombre;
    private String apellidos;
    private String email;

    private List<Asignatura> asignaturas = new ArrayList<>();

    public Alumno() {
    }

    public void mostrarAsignaturas() {

        int horasTotales = 0;
        System.out.println("---Asignaturas: ");

        for (Asignatura as : asignaturas) {
            horasTotales += as.getHorasSemenales();
            System.out.println("Nombre: " + as.getNombre());
            System.out.println("Nº Horas: " + as.getHorasSemenales() + "\n");

        }
        System.out.print("Horas Totales: " + horasTotales);
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", email='" + email + '\'' +
                ", asignaturas=" + asignaturas +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Asignatura> getAsignaturas() {
        return asignaturas;
    }
}
