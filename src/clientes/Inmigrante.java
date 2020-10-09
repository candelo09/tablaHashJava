/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientes;

/**
 *
 * @author CANDELO
 */

// Clase Inmigrante, donde se encuentran los  atributos del usuario.
public class Inmigrante {
	private String pasaporte;
	private String nombre;
	private String apellido;
	private String pais_procedencia;
	private String pais_nacionalidad;

	public Inmigrante(String pasaporte, String nombre, String apellido, String pais_procedencia, String pais_nacionalidad) {
		this.pasaporte = pasaporte;
		this.nombre = nombre;
		this.apellido = apellido;
		this.pais_procedencia = pais_procedencia;
		this.pais_nacionalidad = pais_nacionalidad;
	}

	public String getPasaporte() {
		return pasaporte;
	}

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getPais_procedencia() {
        return pais_procedencia;
    }

    public String getPais_nacionalidad() {
        return pais_nacionalidad;
    }
        
}
