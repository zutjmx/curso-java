package com.zutjmx.curso.java;

import com.zutjmx.curso.java.comun.EjemploJavaUtilCalendar;
import com.zutjmx.curso.java.comun.MiFaker;

/**
 * Clase principal App
 */
public final class App {
    private App() {
    }

    /**
     * Método main de la clase App
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        EjemploJavaUtilCalendar calendar = new EjemploJavaUtilCalendar();
        MiFaker miFaker = new MiFaker();

        System.out.println("Se ejecuta clase principal com.zutjmx.curso.java.App");
        System.out.println("App.main()");
        System.out.println("Prueba de la clase EjemploJavaUtilCalendar");
        
        //calendar.principalCalendar();
        //calendar.dateParse();

        calendar.comprobarFecha();

        System.out.println("Prueba de la clase Faker");
        miFaker.PruebaFaker();
    }
}
