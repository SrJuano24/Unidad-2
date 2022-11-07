/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p60.controlador;

import java.util.List;
import p60.modelo.Barco;
import p60.modelo.Capitan;
import p60.servicio.BarcoServicio;

/**
 *
 * @author morti
 */
public class BarcoControl {
    
    public BarcoServicio barcoServicio = new BarcoServicio();
    
    public Barco crear(int c , String n, String p, String pl, int cC, String nC){
        var capitan = new Capitan(cC,nC);
        var barco = new Barco(c,n,p,pl,capitan);
        this.barcoServicio.crear(barco);
        return barco;
    }
    
    public Barco eliminar(int c) {
        return this.barcoServicio.eliminar(c);
    }
    
    public Barco modificar(int c, Barco b) {
        return this.barcoServicio.modificar(c,b);
    }
    
    public List<Barco> listar()
    {
        return this.barcoServicio.listar();
    }
    
    
}
