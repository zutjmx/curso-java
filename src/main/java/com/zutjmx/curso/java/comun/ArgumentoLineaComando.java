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

    public void calculadora(String[] args) {
        System.out.println("ArgumentoLineaComando.calculadora()");

        if (args.length == 0) {
            System.out.println("No se han pasado argumentos");
            System.exit(-1);
        }

        if (args.length != 3) {
            System.out.println("Se deben pasar tres argumentos, tipo de operación y dos operandos");
            System.exit(-1);
        }

        String operacion = "";
        int a = 0;
        int b = 0;
        double resultado = 0;

        try {
            operacion = args[0];
            a = Integer.parseInt(args[1]);
            b = Integer.parseInt(args[2]);

            if (operacion == null || operacion.isEmpty()) {
                System.out.println("No se ha pasado ninguna operación");
                System.exit(-1);
                
            }

            if (operacion.equals("/")) {
                if (a == 0 || b == 0) {
                    System.out.println("No se puede dividir entre cero");
                    System.exit(-1);
                }                
            }

            switch (operacion) {
                case "+":
                    resultado = a + b;        
                    break;
                case "-":
                    resultado = a - b;
                    break;
                case "m":
                    resultado = a * b;
                    break;
                case "/":
                    resultado = (double) a / b;
                    break;
                default:
                    System.out.println("Operación no válida");
                    break;
            }            
        } catch (NumberFormatException e) {
            System.out.println("Se deben pasar dos argumentos enteros");
            System.exit(-1);
        }

        System.out.println("Resultado: " + resultado);
    }
}
