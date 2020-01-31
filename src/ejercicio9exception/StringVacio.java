/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9exception;

/**
* Clase para representar una excepción de un String vacio.
* Esta clase se lanzará cuando un String este vacio.
* @author Fernan
*/
public class StringVacio extends Exception
{

    public StringVacio(String message) 
    {
        /*
        *Llamaos al constructor de la clase padre (Exception)
        *Con esto hacemos que se lance la excepción con el mensaje que
        *queramos.
        */
        super(message);
    }
    
}
