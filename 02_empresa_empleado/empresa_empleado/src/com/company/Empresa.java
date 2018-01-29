package com.company;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private String nombre;
    private String anyoFundacion;

    private List<Empleado> empleados = new ArrayList<>();

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
}
