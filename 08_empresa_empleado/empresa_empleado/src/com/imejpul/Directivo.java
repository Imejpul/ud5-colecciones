package com.imejpul;

public class Directivo extends Empleado {

    private double salarioAnual;
    private double bonusPersonal;

    public Directivo() {
    }

    public Directivo(String nombre, String apellidos, String fecha_nacimiento, String fecha_contrato, Empresa empresa, double salarioAnual, double bonusPersonal) {
        super(nombre, apellidos, fecha_nacimiento, fecha_contrato, empresa);
        this.salarioAnual = salarioAnual;
        this.bonusPersonal = bonusPersonal;
    }

    public double getSalarioAnual() {
        return salarioAnual;
    }

    public void setSalarioAnual(double salarioAnual) {
        this.salarioAnual = salarioAnual;
    }

    public double getBonusPersonal() {
        return bonusPersonal;
    }

    public void setBonusPersonal(double bonusPersonal) {
        this.bonusPersonal = bonusPersonal;
    }
}
