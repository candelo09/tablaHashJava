/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyectofada.DatosInmigrantes;

/**
 *
 * @author CANDELO
 * Clase que permite mostrar en un Jtable los datos de manera masiva.
 */
public class metodosTable {
    
    //Función para mostrar los datos en un JTable.
    public DefaultTableModel listaEmigrantes(){
        Vector cabeceras = new Vector();
        cabeceras.addElement("Codigo");
        cabeceras.addElement("Nombre");
        cabeceras.addElement("Apellido");
        cabeceras.addElement("Pais Procedencia");
        cabeceras.addElement("Pais Nacionalidad");
        
        //Vector que contenga los datos del usuario.
        //Modelo de tabla para agregar el vector.
        DefaultTableModel mitabla = new DefaultTableModel(cabeceras, 0);
        
        try{
            FileReader fr = new FileReader("usuarios.txt");
            BufferedReader br = new BufferedReader(fr);
            String linea;
          
            
            while((linea = br.readLine()) != null){
                StringTokenizer dato = new StringTokenizer(linea);
                Vector x = new Vector();
                while (dato.hasMoreTokens()) {                    
                    x.addElement(dato.nextToken());
                    
                }
                mitabla.addRow(x);
                
//                System.out.println(x.firstElement());
               
            }
       
            
           
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        
        return mitabla;
    }
    
    public void funcionHash(){
        DatosInmigrantes misDatos = new DatosInmigrantes();
        
        for(int i = 0; i < misDatos.tableDatos.getRowCount(); i++){
       
//            System.out.println("Número de pasaporte: "+misDatos.tableDatos.getValueAt(i, 0));
            
        }
        
       String prueba = misDatos.tableDatos.getValueAt(0, 0).toString();
          char cad;
          char cad2;
          
       cad = prueba.charAt(0);
       cad2 = prueba.charAt(1);
       
        System.out.println();
       
       
    }
}
