package com.imejpul;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Asignatura {

    private String nombre;
    private int horasSemanales;

    private Set<Alumno> alumnos = new HashSet<>();  //debido a la restricción de no haber duplicados

    public Asignatura(String nombre, int horasSemanales) {
        this.nombre = nombre;
        this.horasSemanales = horasSemanales;
    }

    public Asignatura() {
    }

    public Set<Alumno> getAlumnos() {
        return alumnos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasSemanales() {
        return horasSemanales;
    }

    public void setHorasSemanales(int horasSemanales) {
        this.horasSemanales = horasSemanales;
    }

    @Override
    public String toString() {
        return "Asignatura{" +
                "nombre='" + nombre + '\'' +
                ", horasSemanales=" + horasSemanales +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Asignatura that = (Asignatura) o;
        return Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {

        return Objects.hash(nombre);
    }
}
