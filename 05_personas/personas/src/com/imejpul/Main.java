package com.imejpul;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("---Introduce datos de grupo de personas A");
        Set<Persona> grupoA = new HashSet<>();

        //DEPURACIÓN
        /*Persona pers1GrupoA = new Persona("72841981S", "Iván");
        grupoA.add(pers1GrupoA);
        Persona pers2GrupoA = new Persona("72851981S", "Pedro");
        grupoA.add(pers2GrupoA);
        Persona pers3GrupoA = new Persona("72861981S", "Juán");
        grupoA.add(pers3GrupoA);
        Persona pers4GrupoA = new Persona("72842981S", "Gabriel");
        grupoA.add(pers4GrupoA);
        Persona pers5GrupoA = new Persona("72891981S", "Luis");
        grupoA.add(pers5GrupoA);*/

        for (int i = 0; i < 5; i++) {

            Persona persGrupoA = new Persona();

            System.out.println("Introduzca Datos persona");
            System.out.print("Nombre: ");
            persGrupoA.setNombre(br.readLine());
            System.out.println("DNI: ");
            persGrupoA.setDni(br.readLine());

            grupoA.add(persGrupoA);
        }

        System.out.println("---Introduce datos de grupo de personas B");
        Set<Persona> grupoB = new HashSet<>();

        //DEPURACIÓN
        /*Persona pers1GrupoB = new Persona("12841981S", "Julio");
        grupoA.add(pers1GrupoB);
        Persona pers2GrupoB = new Persona("72841981S", "Iván");
        grupoA.add(pers2GrupoB);
        Persona pers3GrupoB = new Persona("22841981S", "David");
        grupoA.add(pers3GrupoB);
        Persona pers4GrupoB = new Persona("32841981S", "Oscar");
        grupoA.add(pers4GrupoB);
        Persona pers5GrupoB = new Persona("42841981S", "Vanesa");
        grupoA.add(pers5GrupoB);*/

        for (int i = 0; i < 5; i++) {

            Persona persGrupoB = new Persona();

            System.out.println("Introduzca Datos persona");
            System.out.print("Nombre: ");
            persGrupoB.setNombre(br.readLine());
            System.out.println("DNI: ");
            persGrupoB.setDni(br.readLine());

            grupoB.add(persGrupoB);

        }
        //.addAll
        System.out.println("---Visualización: Ambos grupos sin duplicados---");
        Set<Persona> AB_sin = new HashSet<>(grupoA);
        AB_sin.addAll(grupoB);

        Iterator<Persona> it = AB_sin.iterator();
        while (it.hasNext()) {
            Persona p = it.next();

            System.out.println("---Persona---");
            System.out.print("Nombre: " + p.getNombre());
            System.out.print("DNI: " + p.getDni());
        }

        //.addAll
        System.out.println("---Visualización: Ambos grupos con duplicados---");
        List<Persona> AB_con = new ArrayList<>(grupoA);
        AB_con.addAll(grupoB);

        for (Persona p : AB_con) {
            System.out.println("---DATOS PERSONA---");
            System.out.print("Nombre: " + p.getNombre());
            System.out.print("DNI: " + p.getDni());
        }

        //.removeAll
        System.out.println("---Visualización: Primer grupo que no están en segundo---");
        Set<Persona> A_min_B = new HashSet<>(grupoA);
        A_min_B.removeAll(grupoB);

        Iterator<Persona> it2 = A_min_B.iterator();
        while (it.hasNext()) {
            Persona p = it2.next();

            System.out.println("---DATOS PERSONA---");
            System.out.print("Nombre: " + p.getNombre());
            System.out.print("DNI: " + p.getDni());
        }

        //.retainAll
        System.out.println("---Visualización: Personas que pertenecen a ambos grupos---");
        Set<Persona> AyB = new HashSet<>(grupoA);
        AyB.retainAll(grupoB);

        Iterator<Persona> it3 = AyB.iterator();
        while (it.hasNext()) {
            Persona p = it3.next();

            System.out.println("---DATOS PERSONA---");
            System.out.print("Nombre: " + p.getNombre());
            System.out.print("DNI: " + p.getDni());

        }
    }
}
