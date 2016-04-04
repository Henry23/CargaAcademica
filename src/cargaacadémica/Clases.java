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
public class Clases {

    String materia;
    String hora;
    String maestros;
    Integer aula;
    Integer No;

    public Clases() {
    }

    public Clases(String materia) {
        this.materia = materia;
    }

    public Clases(String materia, String hora, String maestros, Integer aula, Integer No) {
        this.materia = materia;
        this.hora = hora;
        this.maestros = maestros;
        this.aula = aula;
        this.No = No;
    }

    public Clases(String materia, String hora, String maestros, Integer aula) {
        this.materia = materia;
        this.hora = hora;
        this.maestros = maestros;
        this.aula = aula;
    }

    public Clases(String materia, String hora, Integer d) {
        this.materia = materia;
        this.hora = hora;
        this.No = d;
    }

    public Integer getNo() {
        return No;
    }

    public void setNo(Integer No) {
        this.No = No;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getMaestros() {
        return maestros;
    }

    public void setMaestros(String maestros) {
        this.maestros = maestros;
    }

    public Integer getAula() {
        return aula;
    }

    public void setAula(Integer aula) {
        this.aula = aula;
    }

    @Override
    public String toString() {
        return materia + "_" + hora + "_" + maestros + "_" + aula;
    }

}
