/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p60.servicio;

import java.util.ArrayList;
import java.util.List;
import p60.modelo.Auto;

/**
 *
 * @author morti
 */
public class AutoServicio implements IAutoServicio{
    
    private final List<Auto> autoList = new ArrayList<>();
     

    public Auto crear(Auto auto){
        this.autoList.add(auto);
        return auto;
    }
    
    public List<Auto> listar(){   
        return this.autoList;
    }   

    @Override
    public Auto obtenerAuto(int i) {
        return this.autoList.get(i);
    }
    
}
