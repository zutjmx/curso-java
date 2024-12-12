package com.zutjmx.curso.java;

import com.zutjmx.curso.java.comun.EjemploClaseMath;

// import com.zutjmx.curso.java.comun.EjecutarProgramaSO;

// import java.io.IOException;

// import com.zutjmx.curso.java.clienterest.EstadisticaCovid;
//import com.zutjmx.curso.java.astradb.AstraDbConfig;
// import com.zutjmx.curso.java.comun.EjemploPropiedadesSistema;
// import com.zutjmx.curso.java.sqlserver.SqlServerConfig;

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

        EjemploClaseMath ejemploClaseMath = new EjemploClaseMath();
        ejemploClaseMath.generaAleatorio();
        //ejemploClaseMath.calculos();

        // EjecutarProgramaSO ejecutarProgramaSO = new EjecutarProgramaSO();
        // ejecutarProgramaSO.ejecutar();

        // EjemploPropiedadesSistema sistema = new EjemploPropiedadesSistema();
        //sistema.obtenerVariablesDeEntorno();
        // sistema.obtenerPropiedades();
        //sistema.metodoPrincipal();

        // SqlServerConfig sqlServerConfig = new SqlServerConfig();
        // sqlServerConfig.conectaSelect();
        
        //EjemploJavaUtilCalendar calendar = new EjemploJavaUtilCalendar();
        //System.out.println("Prueba de la clase EjemploJavaUtilCalendar");
        //calendar.principalCalendar();
        //calendar.dateParse();
        //calendar.comprobarFecha();

        // MiFaker miFaker = new MiFaker();
        // System.out.println("Prueba de la clase Faker");
        // miFaker.PruebaFaker();

        // AstraDbConfig astraDbConfig = new AstraDbConfig();
        // astraDbConfig.conecta();
        // astraDbConfig.exploraDb();

        // EstadisticaCovid estadisticaCovid = new EstadisticaCovid();
        // try {
        //     estadisticaCovid.reporteTotal();
        // } catch (IOException e) {
        //     e.printStackTrace();
        //     System.out.println("Error al consultar la estadisca de covid19: " + e.getMessage());
        // }

    }
}
