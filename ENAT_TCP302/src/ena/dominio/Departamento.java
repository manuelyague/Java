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
public class Departamento {

    private int id;
    private String nombre;

    public Departamento(int id, String nombre) {
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

    public static void departamento(JComboBox jcbGerencia, JComboBox jcbDpto) {
        jcbDpto.removeAllItems();
        switch (jcbGerencia.getSelectedItem().toString()) {
            case "Finanzas":
                jcbDpto.addItem("Dpto finanzas 1");
                jcbDpto.addItem("Dpto finanzas 2");
                jcbDpto.addItem("Dpto finanzas 3");
                break;
            case "Operaciones":
                jcbDpto.addItem("Dpto Operaciones 1");
                jcbDpto.addItem("Dpto Operaciones 2");
                jcbDpto.addItem("Dpto Operaciones 3");
                break;
            case "Infraestructura":
                jcbDpto.addItem("Dpto Infraestructura 1");
                jcbDpto.addItem("Dpto Infraestructura 2");
                jcbDpto.addItem("Dpto Infraestructura 3");
                break;
            default:
                break;
        }
    }

}
