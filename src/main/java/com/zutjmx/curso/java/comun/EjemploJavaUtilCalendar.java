package com.zutjmx.curso.java.comun;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

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

    public void dateParse() {
        try (Scanner scanner = new Scanner(System.in)) {
            
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            
            System.out.println("Ingrese una fecha con formato (DD/MM/AAAA):");
            
            try {
                Date fecha = format.parse(scanner.next());
                System.out.println("Fecha: " + fecha);
                System.out.println("Fecha con formato: " + format.format(fecha));
            } catch (ParseException e) {
                e.printStackTrace();
                System.out.println("No se pudo convertir la fecha: " + e.getMessage());
            }
            
        }
    }

    public void comprobarFecha() {
        try (Scanner scanner = new Scanner(System.in)) {
            
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            
            System.out.println("Ingrese una fecha con formato (DD/MM/AAAA):");
            
            try {
                Date fecha = format.parse(scanner.next());
                System.out.println("Fecha: " + fecha);
                System.out.println("Fecha con formato: " + format.format(fecha));

                Date fechaDos = new Date();
                System.out.println("Fecha del sistema: " + fechaDos);

                /* if (fecha.after(fechaDos)) {
                    System.out.println("La fecha ingresada es mayor a la fecha del sistema.");
                } else if (fecha.before(fechaDos)) {
                    System.out.println("La fecha ingresada es menor a la fecha del sistema.");
                } else if (fecha.equals(fechaDos)) {
                    System.out.println("La fecha ingresada es igual a la fecha del sistema.");
                } */

                if (fecha.compareTo(fechaDos) > 0) {
                    System.out.println("La fecha ingresada es mayor a la fecha del sistema.");
                } else if (fecha.compareTo(fechaDos) < 0) {
                    System.out.println("La fecha ingresada es menor a la fecha del sistema.");
                } else if (fecha.compareTo(fechaDos) == 0) {
                    System.out.println("La fecha ingresada es igual a la fecha del sistema.");
                }

            } catch (ParseException e) {
                e.printStackTrace();
                System.out.println("No se pudo convertir la fecha: " + e.getMessage());
            }
            
        }
    }

}
