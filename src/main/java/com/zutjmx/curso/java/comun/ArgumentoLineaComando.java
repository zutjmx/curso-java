package com.zutjmx.curso.java.comun;

public class ArgumentoLineaComando {
    public void argumentos(String[] args) {
        System.out.println("ArgumentoLineaComando.argumentos()");
        
        if (args.length == 0) {
            System.out.println("No se han pasado argumentos");
            System.exit(-1);            
        }
        
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argumentos n°" + i + ": " + args[i]);
        }
    }
}
