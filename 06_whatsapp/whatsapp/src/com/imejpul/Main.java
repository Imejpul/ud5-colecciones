package com.imejpul;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int opcion;

        Map<String, Contacto> agenda = new LinkedHashMap<>();

        System.out.println("\n" +
                "    1 Gestión de contactos\n" +
                "       11 Nuevo contacto.\n" +
                "       12 Eliminar contacto.\n" +
                "    2 Búsqueda\n" +
                "       21 Buscar contacto por número de teléfono.\n" +
                "       22 Buscar contacto por nombre.\n" +
                "    3 Listados\n" +
                "       31 Listado de todos los contactos, tal como se han añadido.\n" +
                "       32 Listado de todos los contactos, ordenados por número de teléfono.\n" +
                "    4 Salir\n");

        System.out.print("¿Opción? = ");
        opcion = Integer.parseInt(br.readLine());
        String telefono;

        do {
            switch (opcion) {
                case 11:
                    Contacto nuevoContacto = new Contacto();

                    System.out.println("---INTRODUZCA DATOS NUEVO CONTACTO---");

                    System.out.print("Nombre: ");
                    nuevoContacto.setNombre(br.readLine());

                    System.out.print("Apellidos: ");
                    nuevoContacto.setApellidos(br.readLine());

                    System.out.print("Email: ");
                    nuevoContacto.setEmail(br.readLine());

                    System.out.println("Teléfono: ");
                    telefono = br.readLine();

                    agenda.put(telefono, nuevoContacto);
                    System.out.println("Contacto creado.");

                    System.out.println();
                    break;

                case 12:
                    System.out.println("---INTRODUZCA TELÉFONO CONTACTO A BORRAR---");
                    telefono = br.readLine();

                    agenda.remove(telefono);
                    break;

                case 21:
                    System.out.println("---INTRODUZCA TELÉFONO CONTACTO A BUSCAR---");
                    telefono = br.readLine();

                    String finalTelefono = telefono;
                    agenda.forEach((tel, con) -> {
                        if (tel.equalsIgnoreCase(finalTelefono)) {
                            System.out.println(tel);
                            System.out.println(con);
                        }
                    });
                    break;

                case 22:
                    System.out.println("---INTRODUZCA NOMBRE CONTACTO A BUSCAR---");
                    String nombre_a_buscar = br.readLine();

                    agenda.forEach((t, c) -> {
                        if (c.getNombre().equalsIgnoreCase(nombre_a_buscar)) {
                            System.out.println(t);
                            System.out.println(c);
                        }
                    });
                    break;

                case 31:
                    System.out.println("---LISTADO ORDENADO POR ORDEN INSERCIÓN---");

                    agenda.forEach((te, co) -> {
                        System.out.println(te);
                        System.out.println(co);
                    });
                    break;

                case 32:
                    System.out.println("---LISTADO ORDENADO POR NÚMERO TELÉFONO---");

                    SortedMap<String, Contacto> agendaOrdenadaTelf = new TreeMap<>(agenda);

                    agendaOrdenadaTelf.forEach((tf, cn) -> {
                        System.out.println(tf);
                        System.out.println(cn);
                    });
                    break;

                case 4:
                    System.out.println("¡Hasta la próxima!");
                    break;
                default:
                    System.out.println("¡ERROR!");
            }
        } while (opcion != 4);
    }
}
