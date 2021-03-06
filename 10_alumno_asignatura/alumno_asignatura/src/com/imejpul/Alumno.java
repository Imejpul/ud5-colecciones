package com.imejpul;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Alumno {

    private String nombre;
    private String apellidos;
    private String email;

    private Set<Asignatura> asignaturas = new HashSet<>();  //debido a la restricción de no haber duplicados

    public Alumno(String nombre, String apellidos, String email) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
    }

    public Alumno() {
    }

    public Set<Asignatura> getAsignaturas() {
        return asignaturas;
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

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return Objects.equals(email, alumno.email);
    }

    @Override
    public int hashCode() {

        return Objects.hash(email);
    }
}
