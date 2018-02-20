package com.imejpul;

public class Operario extends Empleado {

    private double salarioHora;
    private int horasContrato;

    public Operario() {
    }

    public Operario(String nombre, String apellidos, String fecha_nacimiento, String fecha_contrato, Empresa empresa, double salarioHora, int horasContrato) {
        super(nombre, apellidos, fecha_nacimiento, fecha_contrato, empresa);
        this.salarioHora = salarioHora;
        this.horasContrato = horasContrato;
    }

    public double getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora;
    }

    public int getHorasContrato() {
        return horasContrato;
    }

    public void setHorasContrato(int horasContrato) {
        this.horasContrato = horasContrato;
    }
}
