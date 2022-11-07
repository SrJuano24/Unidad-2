/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p60.otros;

import p60.util.Carrera;

/**
 *
 * @author morti
 */
public class Principal {
    public static void main(String [] args)
    {
        var competenciaList = new Auto[4];
        competenciaList[0]= new Auto("ABG7549","Chevrolet",2017);
        competenciaList[1]= new Auto("PYR0549","Toyota",2015);
        competenciaList[2]= new Auto("UBC9685","Jetour",2005);
        competenciaList[3]= new Auto("ADX0422","Mazda",1998);
        
        System.out.println("Los autos que competirán son");
        for(var auto:competenciaList)
            System.out.println(auto.toString());
        
        var numeroDecimalList = new double[7];
        numeroDecimalList[0]=45.8;
        numeroDecimalList[1]=45.8;
        numeroDecimalList[2]=44.8;
        numeroDecimalList[3]=5.8;
        numeroDecimalList[4]=457.8;
        numeroDecimalList[5]=35.8;
        numeroDecimalList[6]=25.8;
        
        for(int i=0;i<numeroDecimalList.length;i++){
            System.out.println(numeroDecimalList[i]);
        }
        
        Universidad upm= new Universidad("Universidad Politécnica de Madrid");
        Universidad upv= new Universidad("Universidad Politécnica de Valencia");
        
        var carreraList = new Carrera[4];
        carreraList[0]=new Carrera("Computación","Vladimir");
        carreraList[1]=new Carrera("Electrónica","Eduardo");
        carreraList[2]=new Carrera("Telecomunicaciones","Eduardo");
        carreraList[3]=new Carrera("Economía","Luis");
        Universidad ups= new Universidad("Universidad Politécnica Salesiana", 
                "Juan Cárdenas",23000,4,carreraList);
       
        System.out.println(ups.toString());
        
        
        
        
        
        
        
    }
}
