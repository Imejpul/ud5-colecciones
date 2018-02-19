package com.imejpul;

import java.util.Objects;

public class Tecnico {

    private String nombre;
    private int nivel;

    //posible linked lista/conjunto(para averias)

    public Tecnico(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
    }

    public Tecnico() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Tecnico{" +
                "nombre='" + nombre + '\'' +
                ", nivel=" + nivel +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tecnico tecnico = (Tecnico) o;
        return nivel == tecnico.nivel &&
                Objects.equals(nombre, tecnico.nombre);
    }

    @Override
    public int hashCode() {

        return Objects.hash(nombre, nivel);
    }
}
