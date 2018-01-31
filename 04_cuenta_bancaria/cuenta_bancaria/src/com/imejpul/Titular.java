package com.imejpul;

import java.util.ArrayList;
import java.util.List;

public class Titular {

    private String nombre;
    private String apellido;
    private String DNI;
    private String fechaAlta;

    private List<CuentaBancaria> cuentas = new ArrayList<>();

    public Titular() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public List<CuentaBancaria> getCuentas() {
        return cuentas;
    }
}
