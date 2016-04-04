/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cargaacadémica;

/**
 *
 * @author Gabriel
 */
public class Maestros {

    private String nombre;
    private String[] clases;
    private String[] horarios;

    public Maestros(String nombre, String[] clases, String[] horarios) {
        this.nombre = nombre;
        this.clases = clases;
        this.horarios = horarios;
    }
    

    public String[] getClases() {
        return clases;
    }

    public void setClases(String[] clases) {
        this.clases = clases;
    }

    public String[] getHorarios() {
        return horarios;
    }

    public void setHorarios(String[] horarios) {
        this.horarios = horarios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        String clase = "";
        String Horarios = "";

        for (int i = 0; i < clases.length; i++) {
            if (i == clases.length - 1) {
                clase += clases[i];
            } else {
                clase += clases[i] + ", ";
            }
        }
        for (int j = 0; j < horarios.length; j++) {
            if (j == horarios.length - 1) {
                Horarios += horarios[j];
            } else {
                Horarios += horarios[j] + ", ";
            }
        }
        return "nombre = " + nombre + ", clases = " + clase + ", horarios = " + Horarios;
    }
}
