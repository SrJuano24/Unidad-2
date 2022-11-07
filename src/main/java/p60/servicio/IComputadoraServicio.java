/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package p60.servicio;

import java.util.List;
import p60.modelo.Computadora;

/**
 *
 * @author morti
 */
public interface IComputadoraServicio {
    
    public Computadora crear(Computadora e);
    public List<Computadora> listar();
    public Computadora obtener(int i);
    
}
