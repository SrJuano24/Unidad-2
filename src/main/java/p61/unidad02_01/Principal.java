/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p61.unidad02_01;

/**
 *
 * @author morti
 */
public class Principal {

    public static void main(String[] args) {

        var mauricio = new Dueño("0103667754", "Mauricio Ortiz", 3, 3);
        mauricio.nuevoTelefono("0984357604", 0, "Móvil", "tuenti", 0);
        mauricio.nuevoTelefono("074078385", 2, "Casa", "Etapa", 1);
        mauricio.nuevoTelefono("074135250", 1287, "Fijo IP", "Etapa", 2);

        mauricio.nuevaReceta("Loratadina", 3, "Una cada comida", 0);
        mauricio.nuevaReceta("Penicilina", 2, "Una en la mañana y otra en la noche", 1);
        mauricio.nuevaReceta("Omeprazol", 1, "Antes de dormir", 2);

        mauricio.mostarinfo();
    }

}
