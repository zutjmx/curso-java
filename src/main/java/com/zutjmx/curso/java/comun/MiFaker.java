package com.zutjmx.curso.java.comun;

import java.util.Locale;

import com.github.javafaker.Faker;

public class MiFaker {

    public void pruebaFaker() {
        Faker faker = new Faker(Locale.getDefault());
        String streetAddress = faker.address().streetAddress();
        System.out.println("Dirección: " + streetAddress);
    }

    public int[] generarArregloEntero(int n) {
        int[] arreglo = new int[n];
        Faker faker = new Faker(Locale.getDefault());
        for (int i = 0; i < n; i++) {
            arreglo[i] = faker.number().numberBetween(1, 100);
        }
        return arreglo;
    }

}
