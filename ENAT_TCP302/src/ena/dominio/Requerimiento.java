/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ena.dominio;

import javax.swing.JComboBox;

/**
 *
 * @author myague
 */
public class Requerimiento {
    
    private int id;
    private String nombre;
    
    public Requerimiento(int id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
        public static void encargado(JComboBox jcbEncargado) {
        
        
                jcbEncargado.addItem("Encargado 1");
                jcbEncargado.addItem("Encargado 2");
                jcbEncargado.addItem("Encargado 3");

    }
}
