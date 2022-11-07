/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p60.otros;

import p60.modelo.Laboratorio;

/**
 *
 * @author morti
 */
public class PrincipalCompArrayList {
    
    public static void main(String [] args){
        Laboratorio lab = new Laboratorio(9,47);
        lab.crear(1, "DELL", "i5", 1200);
        lab.crear(2, "Compaq", "i7", 693);
        lab.crear(3, "Lenovo", "Dual Core", 800);
        lab.crear(4, "Clone", "Pentium", 800);
        
        
        System.out.println(lab);
    }
    
}
