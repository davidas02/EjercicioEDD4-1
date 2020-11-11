/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicioedd4;

/**
 * This practice is about entering 10 numbers from 1 to 10 
   that the child shows you.
 * 
 * @author Diego Castaño Freile
 * @version 1.0
 */
import java.util.Scanner;
public class Menor{
	public static void main (String[] args){
            Scanner teclado=new Scanner(System.in);
            int n,minus;
		
            minus=Integer.MAX_VALUE;
	
	for (int i=1;i<=10;i++){
            System.out.println ("Introduce un numero entre 1 y 10: ");
            n=teclado.nextInt();
	if (n<minus){
            minus=n;
	}
	}
            System.out.print("El menor es: "+minus);
	}
}