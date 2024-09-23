/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cita;

import java.util.Scanner;

public class principal {
	
	
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Ingrese el número de cita");
		int numero =input.nextInt();
	
		System.out.println("Ingrese el tipo de cita 1: para médico general 2: Para especialista");
		int tipo =input.nextInt();
	
		System.out.println("Ingrese la tarifa");
		double tarifa =input.nextInt();
		
        Cita cita= new Cita(numero,tipo,tarifa);
        
        System.out.println("El numero de la cita es: "+ cita.getNumero());
        System.out.println("El tipo de la cita es: "+cita.getTipo());
        System.out.println("Su tarifa normal es:  "+cita.getTarifa());
        System.out.println("Pero por ser de tipo:  "+cita.getTipo()+ " queda con un valor final de: " + cita.calcularValorFinal());
        input.close(); 
    }
    
}
