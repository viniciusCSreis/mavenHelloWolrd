package com.mycompany.app;

import com.mycompany.app.services.MegasenaResult;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String[] result = MegasenaResult.obtemUltimoResultado();
        for( String dezena: result){
            System.out.println(dezena + " ");
        }
        System.out.println( "Hello World!" );
    }
}
