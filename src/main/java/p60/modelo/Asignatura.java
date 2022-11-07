/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p60.modelo;

import java.util.ArrayList;

/**
 *
 * @author morti
 */
public class Asignatura {
    private int codigo;
    private String nombre;
    private String profesor;
    private ArrayList<Estudiante> estudianteList;

    public Asignatura(int codigo, String nombre, String profesor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = profesor;
        this.estudianteList = new ArrayList<>();
    }

    public Estudiante crear(Estudiante e){
        this.estudianteList.add(e);
        return e;
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

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public ArrayList<Estudiante> getEstudianteList() {
        return estudianteList;
    }

    public void setEstudianteList(ArrayList<Estudiante> estudianteList) {
        this.estudianteList = estudianteList;
    }

    @Override
    public String toString() {
        return "Asignatura{" + "codigo=" + codigo + ", nombre=" + nombre + 
                ", profesor=" + profesor + 
                ", estudianteList=" + estudianteList + '}';
    }
    
    
    
    
}
