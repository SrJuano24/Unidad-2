/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package p60.servicio;

import java.util.List;
import p60.modelo.Auto;
import p60.modelo.Estudiante;

/**
 *
 * @author morti
 */
public interface IEstudianteServicio {
    
    public Estudiante crear(Estudiante e);
    public List<Estudiante> listar();
    public Estudiante obtener(int i);
    
}
