package com.imejpul;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Alarma {

    private int pin;
    private boolean activada;
    private int telefonoAviso;

    private List<SensorMovimiento> sensores = new ArrayList<>();

    public void consultarSensores() {
        for (SensorMovimiento s : sensores) {
            boolean estado = s.hayMovimiento(s.getUmbral());

            if (estado) {
                System.out.println("¡Detectado movimiento!");

                System.out.println("Dando aviso a.." + telefonoAviso);

                System.out.println("---ALARMA DISPARADA POR:---");
                System.out.println(s.toString());
            }
        }
    }

    public void activar() {
        activada = true;
    }

    public void desactivar(int pinDes) {
        if (pinDes == pin) {
            activada = false;
            System.out.println("Alarma Desactivada");
        } else {
            System.out.println("¡ERROR!");
        }
    }

    public Alarma(int pin, boolean activada, int telefonoAviso) {
        this.pin = pin;
        this.activada = activada;
        this.telefonoAviso = telefonoAviso;
    }

    public Alarma() {
    }

    @Override
    public String toString() {
        return "Alarma{" +
                "pin=" + pin +
                ", activada=" + activada +
                ", telefonoAviso=" + telefonoAviso +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alarma alarma = (Alarma) o;
        return pin == alarma.pin;
    }

    @Override
    public int hashCode() {

        return Objects.hash(pin);
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public boolean isActivada() {
        return activada;
    }

    public void setActivada(boolean activada) {
        this.activada = activada;
    }

    public int getTelefonoAviso() {
        return telefonoAviso;
    }

    public void setTelefonoAviso(int telefonoAviso) {
        this.telefonoAviso = telefonoAviso;
    }

    public List<SensorMovimiento> getSensores() {
        return sensores;
    }
}
