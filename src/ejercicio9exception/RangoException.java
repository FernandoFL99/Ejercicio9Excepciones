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
public class RangoException extends Exception
{

    public RangoException(String message) 
    {
        /*
        * Controla que el rango sea valido
        */
        super(message);
    }
    
}
