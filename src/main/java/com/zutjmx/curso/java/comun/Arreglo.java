package com.zutjmx.curso.java.comun;

import java.util.Arrays;

import com.zutjmx.curso.java.models.Producto;

public class Arreglo {
    public void arregloEnteros() {
        System.out.println("Arreglo de enteros:");        
        MiFaker miFaker = new MiFaker();
        int[] arreglo = miFaker.generarArregloEntero(10);
        int longitud = arreglo.length;
        System.out.println("Se imprimen los elementos del arreglo sin ordenar:");
        for (int i = 0; i < longitud; i++) {
            System.out.println("Elemento " + i + ": " + arreglo[i]);
        }
        Arrays.sort(arreglo);
        System.out.println("Se imprimen los elementos del arreglo ordenados:");
        for (int i = 0; i < longitud; i++) {
            System.out.println("Elemento " + i + ": " + arreglo[i]);
        }
        System.out.println("Se imprimen los elementos del arreglo usando un while:");
        int i = 0;
        while (i < longitud) {
            System.out.println("Elemento " + i + ": " + arreglo[i]);
            i++;
        }
        System.out.println("Se imprimen los elementos del arreglo usando un do-while:");
        i = 0;
        do {
            System.out.println("Elemento " + i + ": " + arreglo[i]);
            i++;
        } while (i < longitud);
        System.out.println("Se imprimen los elementos del arreglo usando ciclo for inverso version 1:");
        for (int j = 0; j < longitud; j++) {
            System.out.println("Elemento " + (longitud-1-j) + ": " + arreglo[longitud-1-j]);
        }
        System.out.println("Se imprimen los elementos del arreglo usando ciclo for inverso versión 2:");
        for (int j = longitud-1; j >= 0; j--) {
            System.out.println("Elemento " + j + ": " + arreglo[j]);
        }
    }

    public void arregloProductos() {
        System.out.println("Arreglo de productos:");
        MiFaker miFaker = new MiFaker();
        Producto[] arreglo = miFaker.generarArregloProductos(10);
        int longitud = arreglo.length;
        System.out.println("Se imprimen los productos usando un ciclo for:");
        for (int i = 0; i < longitud; i++) {
            System.out.println("Producto " + i + ": " + arreglo[i]);
        }
        System.out.println("Se imprimen los productos usando un foreach:");
        for (Producto producto : arreglo) {
            System.out.println("Producto: " + producto);
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
