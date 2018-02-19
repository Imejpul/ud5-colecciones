package com.imejpul;

import java.util.Objects;

public class Averia {

    private String titulo;
    private String descripcion;
    private String fechaApertura;
    private int nivel;

    public Averia(String titulo, String descripcion, String fechaApertura, int nivel) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaApertura = fechaApertura;
        this.nivel = nivel;
    }

    public Averia() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(String fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Averia{" +
                "titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", fechaApertura='" + fechaApertura + '\'' +
                ", nivel=" + nivel +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Averia averia = (Averia) o;
        return Objects.equals(titulo, averia.titulo) &&
                Objects.equals(fechaApertura, averia.fechaApertura);
    }

    @Override
    public int hashCode() {

        return Objects.hash(titulo, fechaApertura);
    }
}
