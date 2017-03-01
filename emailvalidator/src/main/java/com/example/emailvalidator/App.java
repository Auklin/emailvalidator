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

    	if (!email.contains("@")){
        	System.out.println("Email does not contain '@'");
        	return false;
    	}
    	if (!email.contains(".")){
        	System.out.println("Email does not contain '.'");
        	return false;
    	}
    	
    	if(!atCheck(email))
    		return false;   		
    		
    	return true;
    }
    private static Boolean atCheck(String email){
    	if (atCheckRec(email)>1){
    		System.err.println("more than one @ symbol detected");
    		return false;
    	}
    	return true;
    }
    private static int atCheckRec (String s){
    	if (s.contains("@"))
    		return 1+atCheckRec(s.substring(s.indexOf('@')+1, s.length()));
    	return 0;
    }
    
}
