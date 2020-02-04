/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Esta clase permite leer varios tipos de datos recibiendo por parametros un mensaje
 * @author ferna
 */
public class LeerPorTeclado 
{
    /**
    * Esto nos permite leer una cadena o string
    * Si el imput no es correcto el dato se pedira de nuevo
    * @param mensaje es el mensaje que se le monstrara al usuario
    * @return devuelve el dato que introduce el usuario
     * @throws ejercicio4static.StringVacio

    */
    public static String leerString(String mensaje) throws StringVacio
    {
        String dato;
        Scanner teclado = new Scanner(System.in);
        System.out.println(mensaje);
        dato=teclado.nextLine();
        return dato;
    }
    
    /**
    * Esto nos permite leer un caracter
    * @param mensaje es el mensaje que se le monstrara al usuario
    * @return devuelve el dato que introduce el usuario
    */
    public static char leerChar(String mensaje) throws StringIndexOutOfBoundsException
    {
        char dato;
        Scanner teclado = new Scanner(System.in);
        System.out.println(mensaje);
        dato=teclado.nextLine().charAt(0);
        String comparar=""+dato;
        return dato;
    }

    /**
    * Esto nos permite leer un numero entero
     * @param mensaje es el mensaje que se le monstrara al usuario
     * @return devuelve el dato que introduce el usuario
     * 
    */
    public static int leerInt(String mensaje) throws InputMismatchException
    { 
        int dato;
        Scanner teclado = new Scanner(System.in);
        System.out.println(mensaje);
        dato=teclado.nextInt();
        return dato;
    }
    
    /**
    * Esto nos permite leer un numero decimal
     * @param mensaje es el mensaje que se le monstrara al usuario
     * @return devuelve el dato que introduce el usuario
    */
    public static double leerDouble(String mensaje) throws InputMismatchException
    {
        double dato; 
        Scanner teclado = new Scanner(System.in);
        System.out.println(mensaje);
        dato=teclado.nextDouble();
        return dato;
    }
    
    /**
    * Esto nos permite leer un bolean
     * @param mensaje es el mensaje que se le monstrara al usuario
     * @return devuelve el dato que introduce el usuario
    */
    public static boolean leerBoolean(String mensaje) throws InputMismatchException
    {
        boolean dato;
        Scanner teclado = new Scanner(System.in);
        System.out.println(mensaje);
        dato=teclado.nextBoolean();
        return dato;
    }
}
