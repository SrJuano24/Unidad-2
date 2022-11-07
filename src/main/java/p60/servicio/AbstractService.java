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
public abstract class AbstractService<T> {
    
    public abstract T crear(T objeto);
    public abstract List<T> listar();
    
     
}
