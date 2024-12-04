package com.zutjmx.curso.java.comun;

import java.util.Locale;

import com.github.javafaker.Faker;

public class MiFaker {

    public void PruebaFaker() {
        Faker faker = new Faker(Locale.getDefault());
        String streetAddress = faker.address().streetAddress();
        System.out.println("Dirección: " + streetAddress);
    }

}
