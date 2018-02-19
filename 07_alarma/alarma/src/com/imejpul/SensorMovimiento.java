package com.imejpul;

import java.util.Objects;

public class SensorMovimiento {

    private int umbral;

    private Alarma alarma;

    public boolean hayMovimiento() {
        int valor = (int) (Math.random() * 100) + 1;

        if (valor > umbral) {
            return true;
        }

        return false;
    }

    public SensorMovimiento() {
    }

    public SensorMovimiento(int umbral) {
        this.umbral = umbral;
    }

    @Override
    public String toString() {
        return "SensorMovimiento{" +
                "umbral=" + umbral +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SensorMovimiento that = (SensorMovimiento) o;
        return umbral == that.umbral;
    }

    @Override
    public int hashCode() {

        return Objects.hash(umbral);
    }

    public int getUmbral() {
        return umbral;
    }

    public void setUmbral(int umbral) {
        this.umbral = umbral;
    }
}
