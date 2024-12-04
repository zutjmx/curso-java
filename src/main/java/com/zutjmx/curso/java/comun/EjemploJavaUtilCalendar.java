package com.zutjmx.curso.java.comun;

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
        Date fecha = calendar.getTime();
        System.out.println("Fecha:" + fecha);
    }
}
