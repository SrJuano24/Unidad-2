/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package p60.servicio;

import java.util.List;
import p60.modelo.Barco;

/**
 *
 * @author Mauricio
 */
public interface IBarcoServicio {
    
    public Barco crear(Barco b);
    public Barco modificar(int c, Barco b);
    public Barco eliminar(int c);
    public List<Barco> listar();
    public int buscarPosicion(int c);
    
}
