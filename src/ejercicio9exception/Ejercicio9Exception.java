/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9exception;

/**
 *
 * @author ferna
 */
public class Ejercicio9Exception {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Alumno a1 = new Alumno();
        
        try{
        String nombre= LeerPorTeclado.leerString("Introduce el nombre del alumno");
        a1.setNombre(nombre);
        a1.getNombre();
        
        a1.pedirNotas();
        
        a1.modificarNota(0, 0);
        
        a1.imprimirCalificaciones();
        }
        catch(RangoException | StringVacio e1)
        {
            System.out.println("Error: " +e1.getMessage());
        }
    }
    
}
