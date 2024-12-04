package com.zutjmx.curso.java;

import com.zutjmx.curso.java.comun.EjemploPropiedadesSistema;

// import com.zutjmx.curso.java.comun.EjemploJavaUtilCalendar;
// import com.zutjmx.curso.java.comun.MiFaker;

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
        System.out.println("App.main()");

        EjemploPropiedadesSistema sistema = new EjemploPropiedadesSistema();
        sistema.obtenerPropiedades();
        //sistema.metodoPrincipal();
        
        //EjemploJavaUtilCalendar calendar = new EjemploJavaUtilCalendar();
        //System.out.println("Prueba de la clase EjemploJavaUtilCalendar");
        //calendar.principalCalendar();
        //calendar.dateParse();
        //calendar.comprobarFecha();

        // MiFaker miFaker = new MiFaker();
        // System.out.println("Prueba de la clase Faker");
        // miFaker.PruebaFaker();

    }
}
