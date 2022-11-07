/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p60.modelo;

/**
 *
 * @author Mauricio
 */
public class Auto {
    private String placa;
    private String marca;
    private int modelo;

    public Auto(String placa, String marca) {
        this.placa = placa;
        this.marca = marca;
    }

    public Auto() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public boolean aplicaSeguro(int actual, int maxAnios){
        var aplica=false;
        aplica=((this.modelo-actual)>maxAnios);
        return aplica;
    }

    @Override
    public String toString() {
        return "Auto{" + "placa=" + placa + ", marca=" + marca + '}';
    }
}
