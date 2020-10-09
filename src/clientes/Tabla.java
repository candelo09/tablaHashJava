/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientes;

import java.util.ArrayList;

/**
 *
 * @author CANDELO
 * Funciones de la tabla hash, función hash, insertar, modificar, buscar y eliminar.
 */
public class Tabla {

    // Arreglo que guardara los datos del inmigrante, hace la función de una tabla hash.
    public ArrayList<Inmigrante>[] casas = new ArrayList[26 * 26];
    
    // Permite el calculo de la llave que indica la posición en la que se registrara el Inmigrante.
    public int funcionHash(String pasaporte) {
        int key = 0;
        String abecedario = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int x = abecedario.indexOf(pasaporte.charAt(0));
        int y = abecedario.indexOf(pasaporte.charAt(1));

        int resultado = x * 26 + y;

         key = resultado % 100;
        return key;
    }

    //Función que permite registrar el inmigrante en el arreglo.
    public boolean insertar(String clave, Inmigrante valor) {
        int posicion = funcionHash(clave);
        if (casas[posicion] == null) {
            casas[posicion] = new ArrayList<Inmigrante>();
            casas[posicion].add(valor);
        } else {
            for (Inmigrante inmigrante : casas[posicion]) {
                if (inmigrante.getPasaporte().equals(clave)) {
                    return false;
                }
            }
            casas[posicion].add(valor);
        }
        return true;
    }

    //Función que permite buscar el inmigrante en el arreglo.
    public Inmigrante buscar(String pasaporte) {
        int position = funcionHash(pasaporte);
        if (casas[position] != null) {
            for (Inmigrante inmigrante : casas[position]) {
                if (inmigrante.getPasaporte().equals(pasaporte)) {
                    return inmigrante;
                }
            }
        }
        return null;
    }

    //Funcón que permite eliminar el inmigrante en el arreglo.
    public void eliminar(String pasaporte) {
        int position = funcionHash(pasaporte);
        if (casas[position] != null) {
            A:
            for (Inmigrante inmigrante : casas[position]) {
                if (inmigrante.getPasaporte().equals(pasaporte)) {
                    casas[position].remove(inmigrante);
                    break A;
                }
            }
        }
    }

    //Función que permite modificar el inmigrante en el arreglo.
    public void modificar(String pasaporte, Inmigrante inmigrante) {
        int position = funcionHash(pasaporte);
        if (casas[position] != null) {
            A:
            for (Inmigrante inmigrante1 : casas[position]) {
                if (inmigrante1.getPasaporte().equals(pasaporte)) {
                    inmigrante1 = inmigrante;
                    break A;
                }
            }
        }
    }

}
