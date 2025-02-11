package com.zutjmx.curso.java.comun;

import java.util.Arrays;

import com.zutjmx.curso.java.models.Producto;

public class Arreglo {
    public void arregloEnteros() {
        System.out.println("Arreglo de enteros:");
        MiFaker miFaker = new MiFaker();
        int[] arreglo = miFaker.generarArregloEntero(10);
        System.out.println("Se imprimen los elementos del arreglo sin ordenar:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Elemento " + i + ": " + arreglo[i]);
        }
        Arrays.sort(arreglo);
        System.out.println("Se imprimen los elementos del arreglo ordenados:");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Elemento " + i + ": " + arreglo[i]);
        }
    }

    public void arregloProductos() {
        System.out.println("Arreglo de productos:");
        MiFaker miFaker = new MiFaker();
        Producto[] arreglo = miFaker.generarArregloProductos(10);
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Producto " + i + ": " + arreglo[i]);
        }
    }

    public void arregloStrings() {
        System.out.println("Arreglo de strings:");
        MiFaker miFaker = new MiFaker();
        String[] arreglo = miFaker.generarArregloStrings(10);
        System.out.println("Se imprimen las cadenas sin ordenar:");
        for (String cadena : arreglo) {
            System.out.println("Cadena: " + cadena);
        }
        Arrays.sort(arreglo);
        System.out.println("Se imprimen las cadenas ordenadas:");
        for (String cadena : arreglo) {
            System.out.println("Cadena: " + cadena);
        }
    }

}
