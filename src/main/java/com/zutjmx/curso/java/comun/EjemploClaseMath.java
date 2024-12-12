package com.zutjmx.curso.java.comun;

import java.util.Locale;
import java.util.Random;

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
        System.out.println("Exponencial 1: " + Math.exp(1));
        System.out.println("Exponencial 2: " + Math.exp(2));
        System.out.println("Logaritmo natural de 10: " + Math.log(10));
        System.out.println("10 elevado a la potencia 3: " + Math.pow(10, 3));
        System.out.println("Raíz cuadrada de 20: " + Math.sqrt(20));
        System.out.println("Raíz cuadrada de 9: " + Math.sqrt(9));
        double dobleDePI = Math.PI*2;
        System.out.println("dobleDePI: " + dobleDePI);
        System.out.println("Convertir 2PI a grados: " + Math.toDegrees(dobleDePI));
        System.out.println("Convertir PI a grados: " + Math.toDegrees(Math.PI));
        System.out.println("Convertir 90 grados a radianes: "+Math.toRadians(90));
        System.out.println("Seno de 90 grados: "+Math.sin(+Math.toRadians(90)));
        System.out.println("Coseno de 90 grados: "+Math.cos(+Math.toRadians(90)));
        System.out.println("Seno de 180 grados: "+Math.sin(+Math.toRadians(180)));
        System.out.println("Coseno de 180 grados: "+Math.cos(+Math.toRadians(180)));
    }

    public void generaAleatorio() {
        System.out.println("EjemploClaseMath.generaAleatorio()");
        double aleatorio = Math.random();
        System.out.println("aleatorio: " + aleatorio);
        System.out.println("floor de aleatorio: " + Math.floor(aleatorio));
        System.out.println("ceil de aleatorio: " + Math.ceil(aleatorio));

        Random aleatorioObj = new Random();
        int aleatorioInt = aleatorioObj.nextInt();
        System.out.println("aleatorioInt: " + aleatorioInt);
    }

}
