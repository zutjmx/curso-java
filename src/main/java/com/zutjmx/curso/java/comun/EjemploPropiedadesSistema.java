package com.zutjmx.curso.java.comun;

import java.util.Properties;

public class EjemploPropiedadesSistema {
    public void metodoPrincipal() {
        System.out.println("EjemploPropiedadesSistema.metodoPrincipal()");
        
        String userName = System.getProperty("user.name");
        System.out.println("Usuario: ".concat(userName));
        
        String userHome = System.getProperty("user.home");
        System.out.println("Directorio raíz del usuario: ".concat(userHome));
        
        String userWorkDir = System.getProperty("user.dir");
        System.out.println("Directorio de trabajo del usuario: ".concat(userWorkDir));

        String javaVersion = System.getProperty("java.version");
        System.out.println("Versión de java: ".concat(javaVersion));

        Properties properties = System.getProperties();
        System.out.println("===========");
        properties.list(System.out);
    }
}
