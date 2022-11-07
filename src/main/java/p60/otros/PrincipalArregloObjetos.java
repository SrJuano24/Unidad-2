/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p60.otros;

/**
 *
 * @author morti
 */
public class PrincipalArregloObjetos {
    public static void main(String [] args){
    
        var autoList = new Auto[3];
        autoList[0]=new Auto("AGF0256","Chevrolet",2009);
        autoList[1]=new Auto("PXB0986","Kia",2009);
        autoList[2]=new Auto("ACV0742","Ford",2009);
        
        System.out.println(autoList[2].getMarca());
    
    }
}
