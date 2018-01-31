package com.imejpul;

import java.util.ArrayList;
import java.util.List;

public class CuentaBancaria {

    private String codigoCuenta;

    private List<Titular> titulares = new ArrayList<>();
    private List<Apunte> apuntes = new ArrayList<>();

    public CuentaBancaria() {
    }

    public double calcularSaldo() {
        return 0;
    }

    public void nuevoApunte(double cantidad) {

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
