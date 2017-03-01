package com.example.emailvalidator;

import java.util.Scanner;
import java.net.InetAddress;
import java.net.UnknownHostException;  

/**
 * Hello world!
 *
 */
public class App 
{
    private static Scanner kbd;
	public static void main( String[] args ) {
    	kbd = new Scanner(System.in);
        System.out.println( "Enter an email address:" );
        String input = kbd.nextLine();
        //System.out.println("You entered:"+input);
        if (validator(input))
        	System.out.println("Success");
        else
        	System.out.println("Failed");
        
        
    }
    public static Boolean validator (String email){
    	Boolean check = true;
    	if (!email.contains("@")){
    		check = false;
        	System.out.println("Email does not contain '@'");
    	}
    	if (!email.contains(".")){
    		check = false;
        	System.out.println("Email does not contain '.'");
    	}
    	
    		
    	return check;
    }
    
    
}
