package com.zutjmx.curso.java.comun;

import java.io.IOException;

public class EjecutarProgramaSO {
    public void ejecutar() {
        System.out.println("EjecutarProgramaSO.ejecutar()");
        Runtime runtime = Runtime.getRuntime();
        Process process;
        if (System.getProperty("os.name").startsWith("Windows")) {
            try {
                process = runtime.exec("notepad");
                
                try {
                    process.waitFor();
                } catch (InterruptedException e) {
                    System.err.println("Error al tratar de ejecutar notepad: ".concat(e.getMessage()));;
                    System.exit(1);
                }

                System.out.println("Se cerró el editor");
                System.exit(0);

            } catch (IOException e) {                
                System.err.println("Error al tratar de ejecutar notepad: ".concat(e.getMessage()));;
                System.exit(1);
            }
        }
    }
}
