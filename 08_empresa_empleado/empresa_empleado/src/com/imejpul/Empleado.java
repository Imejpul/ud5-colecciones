package com.imejpul;

import java.util.Objects;

public abstract class Empleado {

    private String nombre;
    private String apellidos;
    private String fecha_nacimiento;
    private String fecha_contrato;

    public Empleado(String nombre, String apellidos, String fecha_nacimiento, String fecha_contrato) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fecha_nacimiento = fecha_nacimiento;
        this.fecha_contrato = fecha_contrato;
    }

    public Empleado() {
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

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getFecha_contrato() {
        return fecha_contrato;
    }

    public void setFecha_contrato(String fecha_contrato) {
        this.fecha_contrato = fecha_contrato;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", fecha_nacimiento='" + fecha_nacimiento + '\'' +
                ", fecha_contrato='" + fecha_contrato + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return Objects.equals(nombre, empleado.nombre) &&
                Objects.equals(apellidos, empleado.apellidos) &&
                Objects.equals(fecha_nacimiento, empleado.fecha_nacimiento) &&
                Objects.equals(fecha_contrato, empleado.fecha_contrato);
    }

    @Override
    public int hashCode() {

        return Objects.hash(nombre, apellidos, fecha_nacimiento, fecha_contrato);
    }
}
