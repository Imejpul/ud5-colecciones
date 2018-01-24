package com.imejpul;

import java.util.ArrayList;
import java.util.List;

public class Ticket {

    private String fecha;
    private String hora;
    private int num_ticket;

    private List<LineaTicket> lineas = new ArrayList<>();

    public Ticket() {
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "fecha='" + fecha + '\'' +
                ", hora='" + hora + '\'' +
                ", num_ticket=" + num_ticket +
                ", lineas=" + lineas +
                '}';
    }

    public void mostrarLineas() {
        double total = 0;

        for (LineaTicket lin : lineas) {
            double subtotal = lin.getCantidad() * lin.getPrecio_ud();
            System.out.println("*" + lin.getCantidad() + "   " + lin.getProducto() + " " + lin.getPrecio_ud() + "   " + subtotal);
            total += subtotal;
        }

        System.out.println("                      TOTAL: " + total);
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getNum_ticket() {
        return num_ticket;
    }

    public void setNum_ticket(int num_ticket) {
        this.num_ticket = num_ticket;
    }

    public List<LineaTicket> getLineas() {
        return lineas;
    }

}
