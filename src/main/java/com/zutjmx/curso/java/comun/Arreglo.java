package com.zutjmx.curso.java.comun;

import com.zutjmx.curso.java.models.Producto;

public class Arreglo {
    public void arregloEnteros() {
        System.out.println("Arreglo de enteros:");
        MiFaker miFaker = new MiFaker();
        int[] arreglo = miFaker.generarArregloEntero(10);
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
}
