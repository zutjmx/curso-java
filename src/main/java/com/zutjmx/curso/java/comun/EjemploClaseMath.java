package com.zutjmx.curso.java.comun;

import java.util.Locale;

import com.github.javafaker.Faker;

public class EjemploClaseMath {
    public void calculos() {
        System.out.println("EjemploClaseMath.calculos()");
        Faker faker = new Faker(Locale.getDefault());
        int enteroAleatorio = faker.number().numberBetween(-10, 10);
        System.out.println("enteroAleatorio: "+enteroAleatorio);
        int valorAbsoluto = Math.abs(enteroAleatorio);
        System.out.println("valorAbsoluto: "+valorAbsoluto);
        double dobleAleatorioUno = faker.number().randomDouble(2, 200, 300);
        double dobleAleatorioDos = faker.number().randomDouble(2, 200, 300);
        double maximo = Math.max(dobleAleatorioUno, dobleAleatorioDos);
        double minimo = Math.min(dobleAleatorioUno, dobleAleatorioDos);
        System.out.println("dobleAleatorioUno: "+dobleAleatorioUno);
        System.out.println("dobleAleatorioDos: "+dobleAleatorioDos);
        System.out.println("Máximo: "+maximo);
        System.out.println("Mínimo: "+minimo);
        System.out.println("Techo máximo: "+Math.ceil(maximo));
        System.out.println("Techo mínmo: "+Math.ceil(minimo));
        System.out.println("Piso máximo: "+Math.floor(maximo));
        System.out.println("Piso mínmo: "+Math.floor(minimo));
        System.out.println("Redondeo del máximo: "+Math.round(maximo));
        System.out.println("Redondeo del mínmo: "+Math.round(minimo));
        System.out.println("Número PI: " + Math.PI);
        System.out.println("Número PI Redondeado: " + Math.round(Math.PI));
    }
}
