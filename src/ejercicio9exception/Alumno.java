package ejercicio9exception;


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Clase alumno que nos permite crear alumnos e introducir sus notas
 * @author ferna
 */
public class Alumno 
{
    private static int num_asignaturas=5;
    private String nombre;
    private ArrayList<Double> notas;

    /**
     * Constructor por defecto
     */
    public Alumno() 
    {
        this.notas = new ArrayList<>();
        nombre="";
    }

    /**
     * Constructor por parametros
     * @param nombre nombre del alumno
     */
    public Alumno(String nombre) {
        this.notas = new ArrayList<>();
        this.nombre = nombre;
    }

    /**
     * Devuelve el nombre del alumno
     * @return nombre del alumno
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre del alumno
     * @param nombre nombre del alumno
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Metodo que pide las notas por teclado y las añade al array
     * Si falla lanza una excecpcion personalizada (RangoException)
     * @throws RangoException
     */
    public void pedirNotas() throws RangoException
    {
        for (int i = 0; i < Alumno.num_asignaturas; i++) 
        {
            double n=LeerPorTeclado.leerDouble("Dame la nota:");
            notas.add(n);
        }
    }
    
    /**
     * Pide una posicion y una nota 
     * Reemplaza la nota en esa posicion por la introducida
     * @param posicion posicion en el array de la nota a modificar
     * Si falla lanza una excecpcion personalizada (RangoException)
     * @param nnota nueva nota que se quiere introducir
     * @throws RangoException 
     */
    public void modificarNota(int posicion, double nnota) throws RangoException
    {
        posicion= LeerPorTeclado.leerInt("Que posicion quieres modificar");
        if(posicion>Alumno.num_asignaturas || posicion<0)
        {
            throw new RangoException("El rango no es correcto");
        }
        nnota= LeerPorTeclado.leerDouble("Introduce la nota nueva");
        notas.set(posicion, nnota);
    }
    
    /**
     * Metodo que imprime por pantalla las notas del array
     */
    public void imprimirCalificaciones()
    {
        for (int i = 0; i < Alumno.num_asignaturas; i++) 
        {
            System.out.println(notas.get(i));
        }
    }

    
}
