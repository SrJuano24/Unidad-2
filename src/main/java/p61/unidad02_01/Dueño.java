/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.unidad02_01;


/**
 *
 * @author Mauricio Ortiz Ochoa
 */
public class Dueño {

    private String cedula;
    private String nombre;
    private int cantidadTelefonos;
    private Telefono[] telefonoList;
    private int cantidadRecetas;
    private Receta[] recetaList;

    public Dueño(String cedula, String nombre, int cantidadTelefonos, int cantidadRecetas) {
        this.cantidadRecetas = cantidadRecetas;
        this.cedula = cedula;
        this.nombre = nombre;
        this.cantidadTelefonos = cantidadTelefonos;
        this.telefonoList = new Telefono[this.cantidadTelefonos];
        this.recetaList = new Receta[this.cantidadRecetas];
    }

    public void nuevoTelefono(String numero, int extension, String tipoTelefono, String operadora, int posicion) {
        var telefono = new Telefono(numero, extension, tipoTelefono, operadora);
        this.telefonoList[posicion] = telefono;
    }

    public void nuevaReceta(String medicamento, int cantidad, String indicacion, int posicion) {
        var recetas = new Receta(medicamento, cantidad, indicacion);
        this.recetaList[posicion] = recetas;
    }

    public int getCantidadRecetas() {
        return cantidadRecetas;
    }

    public void setCantidadRecetas(int cantidadRecetas) {
        this.cantidadRecetas = cantidadRecetas;
    }

    public Receta[] getRecetaList() {
        return recetaList;
    }

    public void setRecetaList(Receta[] recetaList) {
        this.recetaList = recetaList;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadTelefonos() {
        return cantidadTelefonos;
    }

    public void setCantidadTelefonos(int cantidadTelefonos) {
        this.cantidadTelefonos = cantidadTelefonos;
    }

    public Telefono[] getTelefonoList() {
        return telefonoList;
    }

    public void setTelefonoList(Telefono[] telefonoList) {
        this.telefonoList = telefonoList;
    }

    public void mostarinfo() {
        System.out.println("Due\u00f1o{" + "cedula=" + cedula + ", nombre=" + nombre
                + ", cantidadTelefonos=" + cantidadTelefonos
                + ", telefonoList=");
        for (int i = 0; i < this.cantidadTelefonos; i++) {
            System.out.println(this.telefonoList[i].toString());

        }
        System.out.println("-------------------------------------------");
        System.out.println("La mascota tiene las siguientes recetas");
        for (int i = 0; i < this.cantidadRecetas; i++) {
            System.out.println(this.recetaList[i].toString());
        }
    }

}
