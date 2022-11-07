/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package p60.servicio;

import java.util.List;
import p60.modelo.Auto;

public interface IAutoServicio {
    
    public Auto crear(Auto auto);
    public List<Auto> listar();
    public Auto obtenerAuto(int i);
    
}


