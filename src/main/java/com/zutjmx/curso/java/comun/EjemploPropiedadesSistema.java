package com.zutjmx.curso.java.comun;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.Map;
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

    public void obtenerPropiedades() {
        try (
            FileInputStream fileInputStream = new FileInputStream("src\\main\\java\\com\\zutjmx\\curso\\java\\config\\config.properties")
        ) {
            System.out.println("EjemploPropiedadesSistema.obtenerPropiedades()");
            Properties properties = new Properties(System.getProperties());
            properties.load(fileInputStream);
            properties.setProperty("mi.valor.propio", "Mi Valor Propio");

            System.setProperties(properties);

            Properties ps = System.getProperties();

            System.out.println("clave: " + ps.getProperty("clave"));
            System.out.println("config.autor.email: " + System.getProperty("config.autor.email"));

            ps.list(System.out);

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("No existe el archivo: " + e.getMessage());
        }
    }

    public void obtenerVariablesDeEntorno() {
        Map<String, String> envMap = System.getenv();
        System.out.println("EjemploPropiedadesSistema.obtenerVariablesDeEntorno()");
        System.out.println("Variables de ambiente:");
        
        for (Entry<String, String> entry : envMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("JAVA_HOME: ".concat(javaHome));        

        String astraDbApiEndPoint = System.getenv("ASTRA_DB_API_ENDPOINT");
        System.out.println("ASTRA_DB_API_ENDPOINT: ".concat(astraDbApiEndPoint));
        
        String astraDbAppToken = System.getenv("ASTRA_DB_APPLICATION_TOKEN");
        System.out.println("ASTRA_DB_APPLICATION_TOKEN: ".concat(astraDbAppToken));

        String faunaKey = envMap.get("FAUNA_KEY");
        String faunaSecret = envMap.get("FAUNA_SECRET");
        System.out.println("FAUNA_KEY: ".concat(faunaKey));
        System.out.println("FAUNA_SECRET: ".concat(faunaSecret));

    }
}
