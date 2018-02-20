package com.imejpul;

import java.util.List;
import java.util.Objects;

public class Empresa {

    private String nombre;
    private String anyoFundacion;

    private List<Empleado> empleados;

    public Empresa(String nombre, String anyoFundacion) {
        this.nombre = nombre;
        this.anyoFundacion = anyoFundacion;
    }

    public Empresa() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAnyoFundacion() {
        return anyoFundacion;
    }

    public void setAnyoFundacion(String anyoFundacion) {
        this.anyoFundacion = anyoFundacion;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", anyoFundacion='" + anyoFundacion + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empresa empresa = (Empresa) o;
        return Objects.equals(nombre, empresa.nombre);
    }

    @Override
    public int hashCode() {

        return Objects.hash(nombre);
    }
}
