package com.zutjmx.curso.java.comun;

import java.util.Locale;

import com.github.javafaker.Faker;
import com.zutjmx.curso.java.models.Producto;

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

    public Producto[] generarArregloProductos(int n) {
        Producto[] arreglo = new Producto[n];
        Faker faker = new Faker(Locale.getDefault());
        for (int i = 0; i < n; i++) {
            Producto producto = new Producto();
            producto.setIdProducto(faker.number().numberBetween(1, 100));
            producto.setNombre(faker.commerce().productName());
            producto.setPrecio(faker.number().numberBetween(100, 1000));
            arreglo[i] = producto;
        }
        return arreglo;
    }

    public String[] generarArregloStrings(int n) {
        String[] arreglo = new String[n];
        Faker faker = new Faker(Locale.getDefault());
        for (int i = 0; i < n; i++) {
            arreglo[i] = faker.lorem().sentence();
        }
        return arreglo;
    }

}
