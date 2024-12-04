package com.zutjmx.curso.java.comun;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * EjemploJavaUtilCalendar
 */
public class EjemploJavaUtilCalendar {
        
    /**
     * principalCalendar.
     * 
     */
    public void principalCalendar() {
        Calendar calendar = Calendar.getInstance();
        
        //calendar.set(1969, Calendar.DECEMBER, 11, 18, 30, 25);
        
        calendar.set(Calendar.YEAR, 1969);
        calendar.set(Calendar.MONTH, Calendar.DECEMBER);
        calendar.set(Calendar.DAY_OF_MONTH, 11);

        calendar.set(Calendar.HOUR_OF_DAY, 10);
        calendar.set(Calendar.MINUTE, 35);
        calendar.set(Calendar.SECOND, 26);

        Date fecha = calendar.getTime();
        System.out.println("EjemploJavaUtilCalendar.principalCalendar()");
        System.out.println("Fecha: " + fecha);

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String fechaString = formato.format(fecha);
        System.out.println("Fecha con formato: " + fechaString);
    }
}
