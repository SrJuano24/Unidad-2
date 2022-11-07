/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p60.servicio;

import java.util.ArrayList;
import java.util.List;
import p60.modelo.Barco;

/**
 *
 * @author morti
 */
public class BarcoServicio implements IBarcoServicio{

    public final List<Barco> barcoList = new ArrayList<>();
    
    @Override
    public Barco crear(Barco b) {
        this.barcoList.add(b);
        return b;
    }

    @Override
    public Barco modificar(int c, Barco b) {
        this.barcoList.set(this.buscarPosicion(c), b);
        return b;
    }

    @Override
    public Barco eliminar(int c) {
        var barco=this.barcoList.get(this.buscarPosicion(c));
        this.barcoList.remove(this.buscarPosicion(c));
        return barco;
    }

    @Override
    public List<Barco> listar() {
        return this.barcoList;
    }

    @Override
    public int buscarPosicion(int c) {  
        var posicion=-1;
        var i=0;
        for(var auxBarco:this.barcoList){
            if(auxBarco.getCodigo()==c){
                posicion=i;
                break;
            }
            i++;
        }
        return posicion;
    }
    
}
