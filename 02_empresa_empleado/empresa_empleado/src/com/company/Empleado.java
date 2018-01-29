package com.company;

public class Empleado {

    private String nombre;
    private String apellidos;
    private String fechaNacimiento;
    private String fechaContrato;

    private Empresa corp = new Empresa();

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

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getFechaContrato() {
        return fechaContrato;
    }

    public void setFechaContrato(String fechaContrato) {
        this.fechaContrato = fechaContrato;
    }

    public Empresa getCorp() {
        return corp;
    }

    public void setCorp(Empresa corp) {
        this.corp = corp;
    }
}
