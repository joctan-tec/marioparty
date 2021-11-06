/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marioparty;

/**
 *
 * @author Joctan Esquivel
 */
public class DatosMenuPrimerUsuario {
    
    int numeroJugadores;
    String nombreJugador;
    
    public DatosMenuPrimerUsuario(int numero, String nombre){
        numeroJugadores = numero;
        nombreJugador = nombre;
    }

    public int getNumeroJugadores() {
        return numeroJugadores;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }
 
    
    
    
}
