/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9exception;

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
    */
    public static String leerString(String mensaje)
    {
        String dato="";
        boolean error;
        do{
            Scanner teclado = new Scanner(System.in);
            error=false;
            try
            {
                System.out.println(mensaje);
                dato=teclado.nextLine();
                if(dato.isEmpty())
                {
                    throw new StringVacio("No has introducido ningun dato");
                }
            }
            catch (StringVacio e)
            {
                System.out.println(e.getMessage());
                error=true;
            }
        }while(error==true);
        return dato;
    }
    
    /**
    * Esto nos permite leer un caracter
    * @param mensaje es el mensaje que se le monstrara al usuario
    * @return devuelve el dato que introduce el usuario
    */
    public static char leerChar(String mensaje)
    {
        char dato = 'a';
        boolean error;
        do{
            Scanner teclado = new Scanner(System.in);
            error=false;
            try
            {
                System.out.println(mensaje);
                dato=teclado.nextLine().charAt(0);
                String comparar=""+dato;

            }
            catch(StringIndexOutOfBoundsException e)
            {
                System.out.println("No has introducido ningun caracter");
                error=true;
            }
        }while(error==true);
        return dato;
    }

    /**
    * Esto nos permite leer un numero entero
     * @param mensaje es el mensaje que se le monstrara al usuario
     * @return devuelve el dato que introduce el usuario
    */
    public static int leerInt(String mensaje)
    { 
        boolean error;
        int dato=0;
        do{
            Scanner teclado = new Scanner(System.in);
            error=false;
            try
            {
                System.out.println(mensaje);
                dato=teclado.nextInt();

            }
            catch(Exception e)
            {
                System.out.println("El dato que has introducido no es el que se te pide");
                error=true;
            }
        }while(error==true);
        return dato;
    }
    
    /**
    * Esto nos permite leer un numero decimal
     * @param mensaje es el mensaje que se le monstrara al usuario
     * @return devuelve el dato que introduce el usuario
    */
    public static double leerDouble(String mensaje)
    {
        boolean error;
        double dato=0;
        do{
            Scanner teclado = new Scanner(System.in);
            error=false;
            try
            {
                System.out.println(mensaje);
                dato=teclado.nextDouble();
            }
            catch(Exception e)
            {
                System.out.println("El dato que has introducido no es el que se te pide");
                error=true;
            }
        }while(error==true);
        return dato;
    }
    
    /**
    * Esto nos permite leer un bolean
     * @param mensaje es el mensaje que se le monstrara al usuario
     * @return devuelve el dato que introduce el usuario
    */
    public static boolean leerBoolean(String mensaje)
    {
        
        boolean error;
        boolean dato=false;
        do{
            Scanner teclado = new Scanner(System.in);
            error=false;
            try{
                System.out.println(mensaje);
                dato=teclado.nextBoolean();
            }
            catch(Exception e)
            {
                System.out.println("El dato que has introducido no es el que se te pide");
                error=true;
            }
        }while(error==true);
        return dato;
    }
}
