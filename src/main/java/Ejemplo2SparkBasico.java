//Importación de la librería de Javalin

import static spark.Spark.*;

// GET (select), POST (insert), PUT (update), DELETE (delete)

/*
API REST BÁSICA EN JAVA CON SPARK
Aplicación simple que proporciona un endpoint tipo GET
El servidor se inicia en el puerto 4567 con un mensaje de texto plano
 */

//http://localhost:4567/
public class Ejemplo2SparkBasico {
    public static void main(String[] args) {
        //Levantamos el enpoint en puerto 4567
        port(4567);

        //Utilizamos el metodo GET
        get("/", ((req, res) -> {
            return "Hola desde Spark";
        }));

        System.out.println("Servidor iniciado en //http://localhost:4567/");
    }
}
