/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p60.modelo;

import p60.servicio.IDatos;
import p60.servicio.IDatosConstructores;

/**
 *
 * @author morti
 */
public class Estudiante implements IDatos, IDatosConstructores{
    private int codigo;
    private String nombre;

    public Estudiante(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "codigo=" + codigo + ", nombre=" + nombre + '}';
    }

    @Override
    public String obtenerInformacion() {
        var retorno="La clase tiene 3 atributos y 1 método";
        return retorno;
    }

    @Override
    public String autor() {
        var retorno= "Mauricio Ortiz";
        return retorno;
    }

    @Override
    public int obtenerNumero() {
        return 1;
    }

    @Override
    public boolean obtenerConstructorDefecto() {
        return false;
    }
    
    
}
