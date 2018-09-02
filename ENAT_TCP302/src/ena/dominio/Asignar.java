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
public class Asignar {

    private int id;
    private String nombre;

    public Asignar(int id, String nombre) {
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

    public static void asignar(JComboBox jcbDpto, JComboBox jcbAsignar) {
            try
            {
                System.out.println(jcbDpto.getSelectedItem().toString());
            jcbAsignar.removeAllItems();
            switch (jcbDpto.getSelectedItem().toString()) {
                case "Dpto finanzas 1":
                    jcbAsignar.addItem("Asignado finanzas 1.1");
                    jcbAsignar.addItem("Asignado finanzas 1.2");
                    jcbAsignar.addItem("Asignado finanzas 1.3");
                    break;
                case "Dpto finanzas 2":
                    jcbAsignar.addItem("Asignado finanzas 2.1");
                    jcbAsignar.addItem("Asignado finanzas 2.2");
                    jcbAsignar.addItem("Asignado finanzas 2.3");
                    break;
                case "Dpto finanzas 3":
                    jcbAsignar.addItem("Asignado finanzas 3.1");
                    jcbAsignar.addItem("Asignado finanzas 3.2");
                    jcbAsignar.addItem("Asignado finanzas 3.3");
                    break;
                case "Dpto Operaciones 1":
                    jcbAsignar.addItem("Asignado Operaciones 1.1");
                    jcbAsignar.addItem("Asignado Operaciones 1.2");
                    jcbAsignar.addItem("Asignado Operaciones 1.3");
                    break;
                case "Dpto Operaciones 2":
                    jcbAsignar.addItem("Asignado Operaciones 2.1");
                    jcbAsignar.addItem("Asignado Operaciones 2.2");
                    jcbAsignar.addItem("Asignado Operaciones 2.3");
                    break;
                case "Dpto Operaciones 3":
                    jcbAsignar.addItem("Asignado Operraciones 3.1");
                    jcbAsignar.addItem("Asignado Operraciones 3.2");
                    jcbAsignar.addItem("Asignado Operraciones 3.3");
                    break;
                case "Dpto Infraestructura 1":
                    jcbAsignar.addItem("Asignado Infraestructura 1.1");
                    jcbAsignar.addItem("Asignado Infraestructura 1.2");
                    jcbAsignar.addItem("Asignado Infraestructura 1.3");
                    break;
                case "Dpto Infraestructura 2":
                    jcbAsignar.addItem("Asignado Infraestructura 2.1");
                    jcbAsignar.addItem("Asignado Infraestructura 2.2");
                    jcbAsignar.addItem("Asignado Infraestructura 2.3");
                    break;
                case "Dpto Infraestructura 3":
                    jcbAsignar.addItem("Asignado Infraestructura 3.1");
                    jcbAsignar.addItem("Asignado Infraestructura 3.2");
                    jcbAsignar.addItem("Asignado Infraestructura 3.3");
                    break;
                default:
                    break;
            }
        }catch(NullPointerException e){
            e.printStackTrace();
        }
    }

}
