/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p60.otros;

/**
 *
 * @author morti
 */
public class Revista {
    private String nombre;
    private String editor;
    private String isbn;
    private Articulo [] articuloList;

    public Revista(String nombre) {
        this.nombre = nombre;
        this.articuloList = new Articulo[3];
    }

    public Revista(String nombre, String editor, String isbn) {
        this.nombre = nombre;
        this.editor = editor;
        this.isbn = isbn;
        this.articuloList = new Articulo[3];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Articulo[] getArticuloList() {
        return articuloList;
    }

    public void setArticuloList(Articulo[] articuloList) {
        this.articuloList = articuloList;
    }

    @Override
    public String toString() {
        var retorno= "Revista{" + "nombre=" + nombre + ", editor=" + editor +
                ", isbn=" + isbn + '}';
        for (Articulo a:this.articuloList)
            retorno= retorno+"\n"+a.toString();
                
        return retorno;
    }
    
    public Articulo crear(String n, int nP, String r,int p)
    {
        var articulo = new Articulo(n,nP,r);
        this.articuloList[p]=articulo;
        return articulo;
    }

    
    
    
    
    
}
