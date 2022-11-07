/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p60.vista;

import p60.controlador.BarcoControl;
import p60.modelo.Barco;
import p60.modelo.Capitan;

/**
 *
 * @author morti
 */
public class BarcoVista {
    
    public static void main(String [] args)
    {
        var barcoControl = new BarcoControl();
        barcoControl.crear(10, "Titanic", "Ecuador", "B0HC", 100, "Sparrow");
        barcoControl.crear(20, "La Pinta", "España", "B0HC", 200, "Cristobal Colón");
        barcoControl.crear(30, "La Niña", "España", "B0HC", 200, "Cristobal Colón");
        barcoControl.crear(40, "La Santa María", "España", "B0HC", 200, "Cristobal Colón");
        System.out.println("Listado Inicial");
        for(Barco b: barcoControl.listar())
            System.out.println(b.toString());
        
        barcoControl.eliminar(30);
        System.out.println("Listado Eliminando el código 30");
        for(Barco b: barcoControl.listar())
            System.out.println(b.toString());
        var nuevoCapitan = new Capitan(300, "Otto Ernst Lindemann"); 
        var nuevoBarco = new Barco(20,"Bismarck", "Alemania", "NZ52", nuevoCapitan);
        barcoControl.modificar(20, nuevoBarco);
        
        System.out.println("Listado Modificando el código 20");
        for(Barco b: barcoControl.listar())
            System.out.println(b.toString());
        
    }
    
}
