/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p60.controlador;


import java.util.ArrayList;
import java.util.List;
import p60.modelo.Auto;
import p60.servicio.AutoServicio;
import p60.vista.AutoVista;

/**
 *
 * @author morti
 */
public class AutoControl {
    
    private AutoServicio autoServicio = new AutoServicio();    
    
    public Auto crear(String placa, String marca){
        if(validaFormatoPlaca(placa)){
            var auto = new Auto(placa, marca);
            this.autoServicio.crear(auto);
            return auto;
        }
        throw new IllegalArgumentException("El formato de la placa es incorrecto");
    }
    
    public boolean validaFormatoPlaca(String placa){
        var retorno = false;
        var letras = placa.substring(0, 3);
        var numeros = placa.substring(3,6);
        retorno=(contieneSoloNumeros(numeros)&&(contieneSoloLetras(letras)));
        return retorno;
    }
    
    private static boolean contieneSoloNumeros(String cadena) {
        return cadena.matches("[+-]?\\d*(\\.\\d+)?");
    }
    
    private static boolean contieneSoloLetras(String cadena) {
        var retorno=true;
        for (char c: cadena.toCharArray ()){
            if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || c == ' '))
                retorno=false;
        }
        return retorno;
    }
        
    public List<Auto> listar(){   
        return this.autoServicio.listar();
    }
    
    
}
