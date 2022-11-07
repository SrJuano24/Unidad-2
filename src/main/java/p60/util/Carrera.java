/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p60.util;

/**
 *
 * @author morti
 */
public class Carrera {
    
    private String nombre;
    private String director;

    public Carrera(String nombre) {
        this.nombre = nombre;
    }

    public Carrera(String nombre, String director) {
        this.nombre = nombre;
        this.director = director;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "La Carrera se llama: "+this.nombre+" y su director es: "+this.director;
    }
 
}
