package com.zutjmx.curso.java.comun;

public class Arreglo {
    public void arregloEnteros() {
        System.out.println("Arreglo de enteros:");
        MiFaker miFaker = new MiFaker();
        int[] arreglo = miFaker.generarArregloEntero(10);
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Elemento " + i + ": " + arreglo[i]);
        }
    }
}
