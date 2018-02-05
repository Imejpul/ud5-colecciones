package com.imejpul;

import java.util.ArrayList;
import java.util.List;

public class CuentaBancaria {

    private String codigoCuenta;

    private List<Titular> titulares = new ArrayList<>();
    private List<Apunte> apuntes = new ArrayList<>();

    public CuentaBancaria() {
    }

    public CuentaBancaria(String codigoCuenta) {
        this.codigoCuenta = codigoCuenta;
    }

    public double calcularSaldo() {

        double total = 0.0;

        for (Apunte a : apuntes) {
            total += a.getCantidad();
        }
        return total;
    }

    public void nuevoApunte(double cantidad) {

        Apunte a = new Apunte();
        a.setCantidad(cantidad);
        a.setFecha("05/02/18");

        apuntes.add(a);
        a.setCuentaBancaria(this);
    }

    public String getCodigoCuenta() {
        return codigoCuenta;
    }

    public void setCodigoCuenta(String codigoCuenta) {
        this.codigoCuenta = codigoCuenta;
    }

    public List<Titular> getTitulares() {
        return titulares;
    }

    public List<Apunte> getApuntes() {
        return apuntes;
    }
}
