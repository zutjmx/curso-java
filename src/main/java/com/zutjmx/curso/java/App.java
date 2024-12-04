package com.zutjmx.curso.java;

import com.zutjmx.curso.java.comun.EjemploJavaUtilCalendar;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        EjemploJavaUtilCalendar calendar = new EjemploJavaUtilCalendar();
        System.out.println("Hola Mundo de cero a experto.");
        System.out.println("Prueba de la clase Calendar");
        calendar.principalCalendar();
    }
}
