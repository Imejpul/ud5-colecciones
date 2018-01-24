package com.imejpul;

public class LineaTicket {

    private String producto;
    private double precio_ud;
    private int cantidad;

    public Ticket getT() {
        return t;
    }

    public void setT(Ticket t) {
        this.t = t;
    }

    private Ticket t;

    public LineaTicket() {
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getPrecio_ud() {
        return precio_ud;
    }

    public void setPrecio_ud(double precio_ud) {
        this.precio_ud = precio_ud;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
