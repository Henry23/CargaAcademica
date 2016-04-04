/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cargaacadémica;

import java.util.ArrayList;

/**
 *
 * @author Gabriel
 */
public class Estudiantes {

    private int id;
    private String nombre;
    private String[] clases;

    public Estudiantes(int id, String nombre) {
        this.nombre = nombre;
        this.id = id;
        this.clases = new String[5];
    }

    public void setClases(String[] clases) {
        this.clases = clases;
    }

    public String[] getClases() {
        return clases;
    }

    public String getNombre() {
        return nombre;
    }

}
