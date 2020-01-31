package ejercicio9exception;


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ferna
 */
public class Alumno 
{
    private static int num_asignaturas=5;
    private String nombre;
    private ArrayList<Double> notas;

    public Alumno() 
    {
        this.notas = new ArrayList<>();
        nombre="";
    }

    public Alumno(String nombre) {
        this.notas = new ArrayList<>();
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    
}
