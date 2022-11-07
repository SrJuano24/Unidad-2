/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p60.modelo;

import java.util.ArrayList;

/**
 *
 * @author morti
 */
public class Laboratorio {
    
    private int numero;
    private int capacidad;
    private ArrayList<Computadora> computadoraList;

    public Laboratorio(int numero, int capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
        this.computadoraList = new ArrayList<>();
    }
    
    public Computadora crear(int c, String ma, String mo, double p ){
        var compu= new Computadora(c,ma,mo,p);
        this.computadoraList.add(compu);
        return compu;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public ArrayList<Computadora> getComputadoraList() {
        return computadoraList;
    }

    public void setComputadoraList(ArrayList<Computadora> computadoraList) {
        this.computadoraList = computadoraList;
    }

    @Override
    public String toString() {
        String retorno= "Laboratorio{" + "numero=" + numero + ", capacidad=" + 
                capacidad;
                for(var c:this.computadoraList){
                    retorno=retorno+"\n"+c.toString();
                }
        return retorno;
    }
    
    
    
}
