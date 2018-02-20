package com.imejpul;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int opcion;

        List<Averia> averias = new LinkedList<>();
        List<Tecnico> tecnicos = new ArrayList<>();

        do {
            System.out.println("\n" +
                    "    1 Alta de técnico.\n" +
                    "    2 Gestión de averías\n" +
                    "       21 Nueva avería.\n" +
                    "       22 Asignar avería a técnico.\n" +
                    "       23 Atender avería.\n" +
                    "    3 Listados\n" +
                    "       31 Listado de averías sin resolver de un técnico.\n" +
                    "       32 Listado de todas las averías de un técnico (resueltas y no resueltas).\n" +
                    "       33 Listado de todas las averías del sistema y técnico asignado.\n" +
                    "    4 Salir\n");

            System.out.print("¿Opcion? = ");
            opcion = Integer.parseInt(br.readLine());

            switch (opcion) {
                case 1:
                    //pedir nombre técnico y almacenar en variable
                    System.out.println("--Datos Técnico--");

                    System.out.print("Nombre: ");
                    String nombre = br.readLine();

                    //pedir nivel técnicmo y almacenar en variable
                    System.out.print("Nivel: ");
                    int nivel = Integer.parseInt(br.readLine());

                    //añadir a lista general de técnicos (inicializando constructor con parámetros pedidos)
                    tecnicos.add(new Tecnico(nombre, nivel));
                    break;

                case 21:
                    //pedir título, descripción, fecha_apertura, nivel y almacenar en variables
                    System.out.println("--Datos Avería--");

                    System.out.print("Título: ");
                    String titulo = br.readLine();

                    System.out.print("Descripción: ");
                    String descrip = br.readLine();

                    System.out.print("Fecha Apertura: ");
                    String fechaAp = br.readLine();

                    System.out.print("Nivel: ");
                    int nivelAv = Integer.parseInt(br.readLine());

                    //añadir a lista general averías (inicializando constructor con parámetros pedidos)
                    averias.add(new Averia(titulo, descrip, fechaAp, nivelAv));

                    //(comprobar que se añade al final de la LinkedList).
                    break;

                case 22:
                    //obtener la referencia del técnico al que le será asignada (mostrar lista técnicos disponibles)
                    for (int i = 0; i < tecnicos.size(); i++) {
                        System.out.println((i + 1) + " " + tecnicos.get(i));
                    }

                    System.out.print("Introduzca número técnico de los listados: ");
                    int indTecnico = Integer.parseInt(br.readLine()) - 1;

                    //añadir la avería a la lista de averías del técnico (al final)
                    tecnicos.get(indTecnico).getAveriasTecnico().add(averias.get(0));

                    //añadir el técnico a la lista de técnicos de la avería
                    averias.get(0).getTecnicosAveria().add(tecnicos.get(indTecnico));

                    System.out.println("Asignada Avería.");
                    break;

                case 23:
                    //elegir técnico (obtener índice)
                    for (int i = 0; i < tecnicos.size(); i++) {
                        System.out.println((i + 1) + " " + tecnicos.get(i));
                    }

                    System.out.print("Introduzca número técnico de los listados: ");
                    indTecnico = Integer.parseInt(br.readLine()) - 1;

                    Averia a;
                    a = tecnicos.get(indTecnico).getAveriasTecnico().get(0);

                    Tecnico t;
                    t = tecnicos.get(indTecnico);

                    //si no se resuelve:
                    if (a.getNivel() > t.getNivel()) {
                        a.setNivel(a.getNivel() - 1);   //se baja el nivel de la avería una unidad

                        averias.remove(a);  //se quita la avería de la lista general de pendientes
                        averias.add(a);     //se añade de nuevo a la lista general para enviarla al final
                    } else {
                        averias.remove(a);
                    }
                    break;

                case 31:
                    //saber el técnico y obtener índice
                    for (int i = 0; i < tecnicos.size(); i++) {
                        System.out.println((i + 1) + " " + tecnicos.get(i));
                    }

                    System.out.print("Introduzca número técnico de los listados: ");
                    indTecnico = Integer.parseInt(br.readLine()) - 1;

                    //si la avería está en la lista general y en la lista del técnico, no está resuelta
                    for (Averia av : tecnicos.get(indTecnico).getAveriasTecnico()) {
                        if (averias.contains(av)) {
                            System.out.println(av);
                        }
                    }
                    break;

                case 32:
                    //saber técnico (obtener índice)
                    for (int i = 0; i < tecnicos.size(); i++) {
                        System.out.println((i + 1) + " " + tecnicos.get(i));
                    }

                    System.out.print("Introduzca número técnico de los listados: ");
                    indTecnico = Integer.parseInt(br.readLine()) - 1;

                    //si la avería está en la lista general y en la lista del técnico, no está resuelta
                    for (Averia av : tecnicos.get(indTecnico).getAveriasTecnico()) {
                        System.out.println(av);
                    }
                    break;

                case 33:
                    //recorrer todos los técnicos
                    for (Tecnico tec : tecnicos) {
                        System.out.println(tec);
                        for (Averia ave : averias) {
                            System.out.println(ave);
                        }
                        System.out.println("------------");
                    }
                    break;

                case 4:
                    System.out.println("Hasta la próxima");
                    break;
            }
        } while (opcion != 4);

    }
}
