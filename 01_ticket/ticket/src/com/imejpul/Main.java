package com.imejpul;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        Ticket tck = new Ticket();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("---Introduzca Datos Ticket--- ");

        System.out.print("Fecha: ");
        tck.setFecha(br.readLine());

        System.out.print("Hora: ");
        tck.setHora(br.readLine());

        System.out.print("Número de Ticket: ");
        tck.setNum_ticket(Integer.parseInt(br.readLine()));

        //---------------------------

        System.out.println("---Introduzca Compras--- ");
        char opcion;

        do {

            LineaTicket lt = new LineaTicket();

            System.out.print("Nombre Producto: ");
            lt.setProducto(br.readLine());

            System.out.print("Precio ud: ");
            lt.setPrecio_ud(Double.parseDouble(br.readLine()));

            System.out.print("Cantidad: ");
            lt.setCantidad(Integer.parseInt(br.readLine()));

            tck.getLineas().add(lt);
            lt.setT(tck);

            System.out.print("¿Desea introducir más productos (s/n)? :");
            opcion = br.readLine().charAt(0);

        } while (opcion != 'n');

        System.out.println("---Ticket---");
        System.out.println("-Fecha-  -Hora- -NºTicket-");
        System.out.print(tck.getFecha() + " " + tck.getHora() + "   " + tck.getNum_ticket() + "\n");
        System.out.println("\n" + "Cant" + " Producto" + "  PVP/ud" + " Subtottal");
        tck.mostrarLineas();

    }
}
