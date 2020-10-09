/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientes;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

/**
 *
 * @author CANDELO
 * Clase que permite crear de manera masiva los datos de un Inmigrante.
 */
public class textoPlano {

    public void crearUsuarios() throws IOException {
        
        //Metodo aleatorio de datos
        Random miAleaLetras = new Random();
        Random miAleaNum = new Random();
        Random miNombres = new Random();
        Random miApellidos = new Random();
        Random miPais = new Random();
        
        // Arreglo de abecedario para random
        String[] letras = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "X", "W",
            "Y", "Z"};
        
        // Arreglo de nombres para random
        String[] nombres = {"Carlos","Cristian","Laura","Annier","Jeaneth","Arturo","Roberto","Mesias","Fada","Felipe"};
                                
        // Arreglo de apellidos para random
        String[] apellidos = {"Garcia","Martinez","Alvares","Diaz","Jimenez","Romero","Santos","Delgado","Peña","Mendez"};
        
        
        //Arreglo de paises para ramdom
        String[] paises = {"Colombia","Peru","China","Ecuador","Italia","España","Noruega","Bolivia","Argentina","Brasil",
                          "Honduras","Alemania","EEUU","Venezuela","Paraguay","Chile","Japon","Uruguay","Panama","Mexico"};
        
        
        //Fichero que crea el archivo de texto
        FileWriter fichero = new FileWriter("D:/UserProyectFada/usuarios.txt");
       
        for (int x = 0; x < 5000; x++) {

            int n = miAleaLetras.nextInt(26);
            int m = miAleaLetras.nextInt(26);
            int num = miAleaNum.nextInt(10);
            int num1 = miAleaNum.nextInt(10);
            int num2 = miAleaNum.nextInt(10);
            int num3 = miAleaNum.nextInt(10);
            int num4 = miAleaNum.nextInt(10);
            int num5 = miAleaNum.nextInt(10); 
            int num6 = miAleaNum.nextInt(10);
            int num7 = miAleaNum.nextInt(10);
            int nombre = miNombres.nextInt(10);
            int apellido = miApellidos.nextInt(10);
            int pais = miPais.nextInt(20);
            int paisProced = miPais.nextInt(20);
                 

            fichero.write(letras[n] + letras[m] + num + num1 + num2 + num3 + num4 + num5 + num6 + num7 +"         "
                   + nombres[nombre] + "         " + apellidos[apellido] + "         " 
                   + paises[pais] + "         " + paises[paisProced]  
                    + "\n");
            
          
        }
        fichero.close();
   
    }
}
