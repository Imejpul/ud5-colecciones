package com.imejpul;

public class Apunte {

    private double cantidad;
    private String fecha;

    private CuentaBancaria cuentaBancaria = new CuentaBancaria();

    public Apunte() {
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public CuentaBancaria getCuentaBancaria() {
        return cuentaBancaria;
    }
}
