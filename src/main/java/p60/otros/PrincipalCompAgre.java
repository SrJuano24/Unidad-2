/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p60.otros;

import p60.modelo.Asignatura;
import p60.modelo.Estudiante;

/**
 *
 * @author morti
 */
public class PrincipalCompAgre {
    
    public static void main(String [] args){
        Revista r = new Revista("Vistazo", "AblaYala","456654IASPEODK");
        r.crear("El agua es vida", 273, "Si es vida........",0);
        r.crear("El sol es vida", 3560, "Si es vida........",1);
        r.crear("La Pacha mama es vida", 1954, "Si es vida........",2);
        
        Asignatura a = new Asignatura(1,"Ing. Software","Mauricio");
        var e1= new Estudiante(1,"Juan");
        var e2= new Estudiante(2,"Nathalia");
        var e3= new Estudiante(3,"Ana Paula");
        a.crear(e1);
        a.crear(e2);
        a.crear(e3);
        
        System.out.println(r);
    }
    
}
