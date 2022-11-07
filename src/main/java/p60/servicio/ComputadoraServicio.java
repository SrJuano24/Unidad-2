/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p60.servicio;

import java.util.ArrayList;
import java.util.List;
import p60.modelo.Computadora;

/**
 *
 * @author morti
 */
public class ComputadoraServicio implements IComputadoraServicio {

    public final ArrayList<Computadora> computadoraList = new ArrayList<>();
    
    @Override
    public Computadora crear(Computadora e) {
        this.computadoraList.add(e);
        return e;
    }

    @Override
    public List<Computadora> listar() {
        return this.computadoraList;
    }

    @Override
    public Computadora obtener(int i) {
        return this.computadoraList.get(i);
    }
    
}
